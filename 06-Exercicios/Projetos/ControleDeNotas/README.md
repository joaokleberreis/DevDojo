# Projeto 03 — Controle de Notas

## Objetivo
Sistema de terminal para cadastrar notas, listar registros e calcular médias.

## Funcionalidades
- Cadastrar até cinco notas.
- Validar notas entre 0 e 10.
- Listar notas cadastradas.
- Calcular média das notas.
- Classificar a situação: aprovado, recuperação ou reprovado.

## Critérios de situação
- Média igual ou superior a 7: aprovado.
- Média igual ou superior a 5 e inferior a 7: recuperação.
- Média inferior a 5: reprovado.

## Conceitos praticados
- Arrays e variáveis.
- Laços while e for.
- Condicionais e switch.
- Scanner e validação de entradas.

## Compilação
```bash
mkdir -p /tmp/devdojo-notas
javac -encoding UTF-8 -d /tmp/devdojo-notas 06-Exercicios/Projetos/ControleDeNotas/ControleDeNotas.java
```

## Execução
```bash
java -cp /tmp/devdojo-notas ControleDeNotas
```

## Testes automatizados
```bash
bash scripts/testar-projeto-controle-de-notas.sh
```
