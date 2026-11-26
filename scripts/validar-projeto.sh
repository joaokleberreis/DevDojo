#!/usr/bin/env bash
set -Eeuo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"

echo "===== VALIDAÇÃO GERAL — DEVDOJO ====="

echo "[1/3] Validando aulas 10–38..."
bash scripts/validar-todas-aulas.sh

echo
echo "[2/3] Compilando exercícios..."

BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

mapfile -t FUNDAMENTOS < <(find 06-Exercicios/Fundamentos -maxdepth 1 -name '*.java' -type f | sort)
mapfile -t LOGICA < <(find 06-Exercicios/Logica -maxdepth 1 -name '*.java' -type f | sort)

[[ ${#FUNDAMENTOS[@]} -eq 5 ]] || { echo "ERRO: quantidade incorreta de Fundamentos."; exit 1; }
[[ ${#LOGICA[@]} -eq 8 ]] || { echo "ERRO: quantidade incorreta de Lógica."; exit 1; }

javac -encoding UTF-8 -d "$BUILD_DIR" "${FUNDAMENTOS[@]}" "${LOGICA[@]}"

echo "5 exercícios de Fundamentos compilados."
echo "8 exercícios de Lógica compilados."

echo
echo "[3/3] Testes automatizados de Lógica..."
bash scripts/testar-exercicios-logica.sh

echo
echo "===== VALIDAÇÃO GERAL CONCLUÍDA ====="
