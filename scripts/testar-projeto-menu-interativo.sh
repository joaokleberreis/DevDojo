#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "$0")/.." && pwd)"
BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

SOURCE="$ROOT_DIR/Projetos/MenuInterativo/MenuInterativo.java"

javac -encoding UTF-8 -d "$BUILD_DIR" "$SOURCE"

TOTAL=0
FALHAS=0

testar() {
    local nome="$1"
    local entrada="$2"
    local esperado="$3"

    TOTAL=$((TOTAL + 1))
    local saida
    saida=$(printf '%b' "$entrada" | java -cp "$BUILD_DIR" MenuInterativo)

    if grep -Fq -- "$esperado" <<< "$saida"; then
        echo "APROVADO: $nome"
    else
        echo "FALHOU: $nome"
        echo "Esperado: $esperado"
        echo "$saida"
        FALHAS=$((FALHAS + 1))
    fi
}

echo "===== TESTES DO MENU INTERATIVO ====="

testar "Cálculo de média" "1\n8\n7\n9\n0\n" "Média: 8,00"
testar "Conversão Celsius para Fahrenheit" "2\n100\n0\n" "212,00 °F"
testar "Número par" "3\n8\n0\n" "8 é par."
testar "Número ímpar negativo" "3\n-3\n0\n" "-3 é ímpar."
testar "Nota fora do intervalo" "1\n11\n0\n" "A nota deve estar entre 0 e 10."
testar "Opção inexistente" "9\n0\n" "Opção inexistente."
testar "Entrada não numérica" "abc\n0\n" "Entrada inválida."
testar "Encerramento" "0\n" "Programa encerrado."

echo
echo "===== RESULTADO ====="
echo "Testes executados: $TOTAL"
echo "Falhas: $FALHAS"

if [ "$FALHAS" -ne 0 ]; then
    exit 1
fi

echo "TODOS OS TESTES PASSARAM."
