# 🍔 Projeto #1 - Sistema de Pedidos de Lanchonete

**Disciplina:** Algoritmos I  
**Linguagem:** Java
**Docente:** João Carlos Lima e Silva

---

## 📌 Contexto do Projeto

Este projeto consiste no desenvolvimento de um **sistema simples em Java** para registrar pedidos de clientes em uma lanchonete.

O objetivo principal é **praticar a organização da lógica utilizando funções**, além do uso de **estruturas de controle como `switch` e `if`** para tomada de decisões dentro do programa.

---

## ⚙️ Funcionalidades do Programa

O sistema segue um fluxo de **7 etapas principais** para garantir a precisão do pedido:

1. **Escolha do Produto**  
   O usuário informa o **código do item desejado (1 a 5)**.

2. **Quantidade**  
   Definição de **quantos itens serão comprados**.

3. **Cálculo do Total**  
   Processado pela função:
   ```java
   calcularTotal(double preco, int quantidade)
