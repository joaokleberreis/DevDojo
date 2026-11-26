# Exercícios de Arrays e Matrizes

Oito exercícios para praticar vetores, matrizes, percorrimento, pesquisa e operações com elementos.

| Arquivo | Conteúdo |
|---|---|
| Exercicio01CriarExibirVetor.java | Criar e exibir um vetor de cinco números |
| Exercicio02SomaMediaVetor.java | Calcular soma e média dos elementos |
| Exercicio03MaiorMenorVetor.java | Encontrar o maior e o menor elemento |
| Exercicio04ContarParesImpares.java | Contar números pares e ímpares |
| Exercicio05PesquisarValor.java | Pesquisar um valor e localizar suas posições |
| Exercicio06InverterVetor.java | Inverter a ordem dos elementos |
| Exercicio07MatrizTresPorTres.java | Criar e exibir uma matriz 3x3 |
| Exercicio08SomaMatrizDiagonal.java | Calcular a soma dos elementos e da diagonal principal |

## Compilação

Na raiz do projeto, execute:

    BUILD_DIR=$(mktemp -d)
    javac -encoding UTF-8 -d "$BUILD_DIR" 06-Exercicios/Arrays/*.java
    rm -rf "$BUILD_DIR"

## Testes automatizados

    bash scripts/testar-exercicios-arrays.sh
