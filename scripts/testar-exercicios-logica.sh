#!/usr/bin/env bash
set -Eeuo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"

BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

mapfile -t SOURCES < <(
    find 06-Exercicios/Logica -maxdepth 1 -name '*.java' -type f | sort
)

if [[ ${#SOURCES[@]} -ne 8 ]]; then
    echo "ERRO: esperados 8 exercícios; encontrados ${#SOURCES[@]}."
    exit 1
fi

javac -encoding UTF-8 -d "$BUILD_DIR" "${SOURCES[@]}"

APROVADOS=0

testar() {
    local classe="$1"
    local entrada="$2"
    local esperado="$3"
    local descricao="$4"
    local resultado

    resultado="$(printf '%b' "$entrada" | timeout 5 java -cp "$BUILD_DIR" "$classe" 2>&1)" || {
        echo "FALHOU: $descricao"
        echo "$resultado"
        exit 1
    }

    if grep -Fq -- "$esperado" <<< "$resultado"; then
        echo "OK: $descricao"
        ((APROVADOS+=1))
    else
        echo "FALHOU: $descricao"
        echo "Esperado: $esperado"
        echo "$resultado"
        exit 1
    fi
}

echo "===== TESTES AUTOMATIZADOS — LÓGICA ====="

testar Exercicio01PositivoNegativoZero "10\n" "O número é positivo." "Número positivo"
testar Exercicio01PositivoNegativoZero "0\n" "O número é zero." "Número zero"
testar Exercicio01PositivoNegativoZero "-10\n" "O número é negativo." "Número negativo"

testar Exercicio02PodeVotar "15\n" "Não pode votar." "Idade abaixo de 16"
testar Exercicio02PodeVotar "16\n" "Voto facultativo." "Voto facultativo aos 16"
testar Exercicio02PodeVotar "18\n" "Voto obrigatório." "Voto obrigatório aos 18"
testar Exercicio02PodeVotar "71\n" "Voto facultativo." "Voto facultativo acima de 70"

testar Exercicio03MaiorDeTres "10\n25\n15\n" "Maior número: 25" "Maior entre três números"

testar Exercicio04MenuOperacoes "10\n5\n1\n" "Resultado: 15.0" "Soma"
testar Exercicio04MenuOperacoes "10\n0\n4\n" "Erro: divisão por zero." "Proteção contra divisão por zero"
testar Exercicio04MenuOperacoes "10\n5\n9\n" "Opção inválida." "Opção inválida"

testar Exercicio05ContagemESoma "5\n" "Soma: 15" "Contagem e soma de 1 a 5"

testar Exercicio06Fatorial "0\n" "0! = 1" "Fatorial de zero"
testar Exercicio06Fatorial "5\n" "5! = 120" "Fatorial de cinco"
testar Exercicio06Fatorial "20\n" "20! = 2432902008176640000" "Limite do tipo long"

testar Exercicio07Adivinhacao "1\n2\n3\n4\n5\n6\n7\n" "JOGO DE ADIVINHAÇÃO" "Inicialização do jogo"
testar Exercicio08ValidarEntrada "0\n8\n" "Valor aceito: 8" "Validação de intervalo"

echo
echo "$APROVADOS testes aprovados."
