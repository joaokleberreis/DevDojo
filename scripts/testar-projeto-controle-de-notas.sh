#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

SOURCE="$ROOT_DIR/Projetos/ControleDeNotas/ControleDeNotas.java"

javac -encoding UTF-8 -d "$BUILD_DIR" "$SOURCE"

TOTAL=0
FALHAS=0

testar() {
    local nome="$1"
    local entrada="$2"
    local esperado="$3"

    TOTAL=$((TOTAL + 1))
    local saida
    saida=$(printf '%b' "$entrada" | java -cp "$BUILD_DIR" ControleDeNotas)

    if grep -Fq -- "$esperado" <<< "$saida"; then
        echo "APROVADO: $nome"
    else
        echo "FALHOU: $nome"
        echo "Esperado: $esperado"
        echo "$saida"
        FALHAS=$((FALHAS + 1))
    fi
}

echo "===== TESTES DO CONTROLE DE NOTAS ====="

testar "Cadastro de nota" "1\n8\n0\n" "Nota cadastrada com sucesso."
testar "Listagem de notas" "1\n8\n2\n0\n" "Nota 1: 8,00"
testar "Média e aprovação" "1\n8\n1\n9\n3\n0\n" "Situação: Aprovado."
testar "Situação de recuperação" "1\n5\n1\n6\n3\n0\n" "Situação: Recuperação."
testar "Situação de reprovação" "1\n2\n1\n4\n3\n0\n" "Situação: Reprovado."
testar "Nota acima do limite" "1\n11\n0\n" "A nota deve estar entre 0 e 10."
testar "Nota abaixo do limite" "1\n-1\n0\n" "A nota deve estar entre 0 e 10."
testar "Consulta sem notas" "3\n0\n" "Cadastre pelo menos uma nota."
testar "Listagem sem notas" "2\n0\n" "Nenhuma nota cadastrada."
testar "Limite de cinco notas" "1\n1\n1\n2\n1\n3\n1\n4\n1\n5\n1\n6\n0\n" "Limite de 5 notas atingido."
testar "Entrada não numérica" "abc\n0\n" "Entrada inválida."
testar "Opção inexistente" "9\n0\n" "Opção inexistente."
testar "Encerramento" "0\n" "Programa encerrado."

echo
echo "===== RESULTADO ====="
echo "Testes executados: $TOTAL"
echo "Falhas: $FALHAS"

if [ "$FALHAS" -ne 0 ]; then
    exit 1
fi

echo "TODOS OS TESTES PASSARAM."
