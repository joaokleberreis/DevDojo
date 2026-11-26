#!/usr/bin/env bash
set -Eeuo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"

if [[ -n "$(git diff --cached --name-only)" ]]; then
  echo "Há arquivos staged. Revise com git status antes de continuar."
  exit 1
fi

bash scripts/validar-todas-aulas.sh
git add README.md 01-Fundamentos 02-Controle-de-Fluxo 03-Arrays scripts
git diff --cached --check
git diff --cached --stat

echo
read -r -p "Confirma criar um único commit da reconstrução e enviar para origin/main? [s/N] " resposta
[[ "$resposta" =~ ^[sS]$ ]] || { echo "Cancelado; nada foi commitado."; exit 0; }

git commit -m "feat: reconstrói aulas 10 a 38 da Maratona Java"
git push origin main
