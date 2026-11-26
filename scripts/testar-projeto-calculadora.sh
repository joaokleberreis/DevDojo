#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

SOURCE="$ROOT_DIR/06-Exercicios/Projetos/Calculadora/Calculadora.java"

javac -encoding UTF-8 -d "$BUILD_DIR" "$SOURCE"

TOTAL=0
FALHAS=0

testar() {
    local nome="$1"
    local entrada="$2"
    local esperado="$3"

    TOTAL=$((TOTAL + 1))

    local saida
    saida=$(printf '%b' "$entrada" | java -cp "$BUILD_DIR" Calculadora)

    if grep -Fq "$esperado" <<< "$saida"; then
        echo "APROVADO: $nome"
    else
        echo "FALHOU: $nome"
        echo "Esperado: $esperado"
        echo "Saída obtida:"
        echo "$saida"
        FALHAS=$((FALHAS + 1))
    fi
}

echo "===== TESTES DA CALCULADORA ====="

testar "Soma" "1\n10\n5\n0\n" "Resultado: 15.0"
testar "Subtração" "2\n10\n5\n0\n" "Resultado: 5.0"
testar "Multiplicação" "3\n10\n5\n0\n" "Resultado: 50.0"
testar "Divisão" "4\n10\n2\n0\n" "Resultado: 5.0"
testar "Proteção contra divisão por zero" "4\n10\n0\n0\n" "divisão por zero não permitida."
testar "Opção inexistente" "9\n0\n" "opção inexistente."
testar "Entrada numérica inválida" "1\nabc\n0\n" "informe um número válido."
testar "Opção não numérica" "abc\n0\n" "informe uma opção válida."
testar "Encerramento" "0\n" "Calculadora encerrada."

echo
echo "===== RESULTADO ====="
echo "Testes executados: $TOTAL"
echo "Falhas: $FALHAS"

if [ "$FALHAS" -ne 0 ]; then
    exit 1
fi

echo "TODOS OS TESTES PASSARAM."
