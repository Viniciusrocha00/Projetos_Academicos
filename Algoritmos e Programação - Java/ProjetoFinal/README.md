# 🎮 Sistema de Torneio de Games

Projeto final da disciplina de **Algoritmos I**, desenvolvido em **Java**, utilizando conceitos básicos de programação como:

* Vetores paralelos
* Funções
* Busca Linear
* Bubble Sort
* Estruturas de repetição
* Estruturas condicionais
* Classe utilitária (`Util.java`)

---

# 📚 Objetivo do Projeto

O sistema simula o gerenciamento de um torneio de games no terminal, permitindo:

* Cadastrar jogadores
* Registrar pontuações
* Buscar jogadores
* Exibir ranking
* Encerrar o torneio mostrando o campeão

---

# 🛠️ Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Programação Orientada a Objetos (básica)

---

# 📁 Estrutura do Projeto

```text
src
├── ProjetoFinal.java
└── Util.java
```

---

# ▶️ Como Executar

## 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

## 2. Abrir no IntelliJ IDEA

* Abra o IntelliJ
* Clique em:

```text
Open
```

* Selecione a pasta do projeto

---

## 3. Executar o projeto

Abra o arquivo:

```text
ProjetoFinal.java
```

Clique no botão verde ▶ ao lado do método `main`.

---

# 📌 Funcionalidades

## ✅ Cadastrar Jogador

* Adiciona jogadores ao torneio
* Limite máximo de 8 jogadores

---

## ✅ Registrar Pontuação

* Busca o jogador pelo nome
* Registra a pontuação
* Não permite valores negativos

---

## ✅ Exibir Ranking

* Ordena os jogadores usando Bubble Sort
* Exibe do maior para o menor pontuador

---

## ✅ Buscar Jogador

* Procura um jogador pelo nome
* Exibe a pontuação atual

---

## ✅ Encerrar Torneio

* Exibe o campeão
* Finaliza o sistema

---

# 🧠 Conceitos Aplicados

## Vetores Paralelos

```java
static String[] nomes = new String[8];
static int[] pontuacoes = new int[8];
```

Os vetores trabalham juntos utilizando o mesmo índice.

---

## Busca Linear

Implementada na classe `Util.java`.

```java
for (int i = 0; i < quantidadeJogadores; i++)
```

Percorre o vetor procurando um jogador.

---

## Bubble Sort

Utilizado para ordenar o ranking em ordem decrescente.

---

# 📸 Exemplo de Execução

```text
===== TORNEIO DE GAMES =====
1 - Cadastrar Jogador
2 - Registrar Pontuacao
3 - Exibir Ranking
4 - Buscar Jogador
5 - Encerrar Torneio
```

---

# 👨‍💻 Autor
VINICIUS JESUS ROCHA
Docente: JOAO CARLOS LIMA E SILVA
Projeto desenvolvido para fins acadêmicos na disciplina de Algoritmos I.
