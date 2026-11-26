#!/bin/bash

set -u

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BUILD_DIR="$(mktemp -d)"
TOTAL=0
FALHAS=0

cd "$ROOT" || exit 1

if ! javac -encoding UTF-8 -d "$BUILD_DIR" 06-Exercicios/Arrays/*.java; then
    echo "ERRO: compilação dos exercícios de Arrays."
    rm -rf "$BUILD_DIR"
    exit 1
fi

testar() {
    local classe="$1"
    local entrada="$2"
    local esperado="$3"

    TOTAL=$((TOTAL + 1))
    local resultado

    resultado=$(printf '%b' "$entrada" | java -cp "$BUILD_DIR" "$classe" 2>&1)

    if [[ "$resultado" == *"$esperado"* ]]; then
        echo "APROVADO: $classe"
    else
        echo "FALHOU: $classe"
        echo "Esperado: $esperado"
        echo "Resultado: $resultado"
        FALHAS=$((FALHAS + 1))
    fi
}

testar Exercicio01CriarExibirVetor '1\n2\n3\n4\n5\n' '[1, 2, 3, 4, 5]'
testar Exercicio02SomaMediaVetor '1\n2\n3\n4\n5\n' '15'
testar Exercicio03MaiorMenorVetor '-5\n0\n9\n2\n1\n' '9'
testar Exercicio04ContarParesImpares '1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n' '5'
testar Exercicio05PesquisarValor '1\n2\n3\n2\n5\n2\n' '1'
testar Exercicio06InverterVetor '1\n2\n3\n4\n5\n' '[5, 4, 3, 2, 1]'
testar Exercicio07MatrizTresPorTres '1\n2\n3\n4\n5\n6\n7\n8\n9\n' '9'
testar Exercicio08SomaMatrizDiagonal '1\n2\n3\n4\n5\n6\n7\n8\n9\n' '45'

rm -rf "$BUILD_DIR"

echo
echo "===== RESULTADO ====="
echo "Testes executados: $TOTAL"
echo "Falhas: $FALHAS"

if [ "$FALHAS" -eq 0 ]; then
    echo "TODOS OS TESTES PASSARAM."
else
    echo "EXISTEM TESTES QUE PRECISAM DE CORREÇÃO."
fi
