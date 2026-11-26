#!/usr/bin/env bash
set -Eeuo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$ROOT"
BUILD_DIR="$(mktemp -d)"
trap 'rm -rf "$BUILD_DIR"' EXIT

mapfile -t SOURCES < <(find 01-Fundamentos 02-Controle-de-Fluxo 03-Arrays -name 'Aula*.java' -type f | sort)
if [[ ${#SOURCES[@]} -ne 29 ]]; then
  echo "Aviso: esperados 29 arquivos Java (aulas 10–38); encontrados ${#SOURCES[@]}."
fi

echo "Compilando ${#SOURCES[@]} arquivos..."
javac -encoding UTF-8 -d "$BUILD_DIR" "${SOURCES[@]}"

echo "Executando cada aula..."
for source in "${SOURCES[@]}"; do
  class_name="$(basename "$source" .java)"
  echo "---- $class_name ----"
  java -cp "$BUILD_DIR" "$class_name"
done

echo "Validação concluída."
