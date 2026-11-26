#!/usr/bin/env bash
set -Eeuo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"

echo "======================================"
echo "VALIDAÇÃO GERAL — DEVDOJO"
echo "======================================"

echo
echo "[1/2] Validando aulas 10–38..."
bash scripts/validar-todas-aulas.sh

echo
echo "[2/2] Compilando exercícios de Fundamentos..."

BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

mapfile -t SOURCES < <(
    find 06-Exercicios/Fundamentos -maxdepth 1 -name '*.java' -type f | sort
)

if [[ ${#SOURCES[@]} -ne 5 ]]; then
    echo "Erro: esperados 5 exercícios; encontrados ${#SOURCES[@]}."
    exit 1
fi

javac -encoding UTF-8 -d "$BUILD_DIR" "${SOURCES[@]}"

echo "Cinco exercícios compilados com sucesso."

echo
echo "======================================"
echo "VALIDAÇÃO GERAL CONCLUÍDA"
echo "======================================"
