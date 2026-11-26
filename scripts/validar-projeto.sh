#!/usr/bin/env bash
set -Eeuo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"

echo "===== VALIDAÇÃO GERAL — DEVDOJO ====="

echo "[1/5] Validando aulas 10–38..."
bash scripts/validar-todas-aulas.sh

echo "[2/5] Compilando exercícios e projetos..."
BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

mapfile -t FUNDAMENTOS < <(find 06-Exercicios/Fundamentos -maxdepth 1 -name '*.java' -type f | sort)
mapfile -t LOGICA < <(find 06-Exercicios/Logica -maxdepth 1 -name '*.java' -type f | sort)
mapfile -t ARRAYS < <(find 06-Exercicios/Arrays -maxdepth 1 -name '*.java' -type f | sort)
mapfile -t PROJETOS < <(find 06-Exercicios/Projetos -type f -name '*.java' | sort)

[[ ${#FUNDAMENTOS[@]} -eq 5 ]] || { echo "ERRO: quantidade incorreta de Fundamentos."; exit 1; }
[[ ${#LOGICA[@]} -eq 8 ]] || { echo "ERRO: quantidade incorreta de Lógica."; exit 1; }
[[ ${#ARRAYS[@]} -eq 8 ]] || { echo "ERRO: quantidade incorreta de Arrays."; exit 1; }
[[ ${#PROJETOS[@]} -eq 3 ]] || { echo "ERRO: quantidade incorreta de projetos."; exit 1; }

javac -encoding UTF-8 -d "$BUILD_DIR" \
  "${FUNDAMENTOS[@]}" \
  "${LOGICA[@]}" \
  "${ARRAYS[@]}" \
  "${PROJETOS[@]}"

echo "5 exercícios de Fundamentos compilados."
echo "8 exercícios de Lógica compilados."
echo "8 exercícios de Arrays compilados."
echo "3 projetos práticos compilados."

echo "[3/5] Testes automatizados de Lógica..."
bash scripts/testar-exercicios-logica.sh

echo "[4/5] Testes automatizados de Arrays..."
bash scripts/testar-exercicios-arrays.sh

echo "[5/5] Testes dos projetos práticos..."
bash scripts/testar-projeto-calculadora.sh
bash scripts/testar-projeto-menu-interativo.sh
bash scripts/testar-projeto-controle-de-notas.sh

echo
echo "===== VALIDAÇÃO GERAL CONCLUÍDA ====="
