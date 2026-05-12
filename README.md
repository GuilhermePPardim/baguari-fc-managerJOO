# ⚽ Baguari FC Manager

Um mini-sistema de gestão esportiva desenvolvido em Java para o controle de profissionais de um clube de futebol. Este projeto foi construído do zero como uma aplicação prática para consolidar os fundamentos de **Programação Orientada a Objetos (POO)**.

## 📋 Sobre o Projeto

O sistema simula a rotina de um clube de futebol (Baguari FC), permitindo o gerenciamento do elenco e da comissão técnica. O objetivo principal do projeto não é apenas a regra de negócio esportiva, mas sim a aplicação estrita de boas práticas de arquitetura de software e POO em Java.

## 🚀 Funcionalidades

* Cadastro de Jogadores (posição, número de camisa, energia).
* Cadastro de Comissão Técnica (função, tática).
* Simulação de rotina de trabalho (treinos e jogos).
* Sistema de controle de saúde e lesões que impede o profissional de atuar caso esteja machucado.

## 🧠 Conceitos de POO Aplicados

Este repositório foi estruturado seguindo os padrões de mercado (`br.com.guilherme.baguarifc...`) e aplica de forma prática os seguintes pilares do Java:

* **Abstração:** Criação da classe mãe abstrata `Profissional` servindo como contrato para os funcionários do clube.
* **Encapsulamento:** Proteção dos atributos (como `energia` e `lesao`) utilizando modificadores de acesso e métodos Getters/Setters.
* **Herança:** Classes `Jogador` e `ComissaoTecnica` herdando características e comportamentos da superclasse `Profissional`.
* **Polimorfismo:** Sobrescrita do método `@Override trabalhar()` para que jogadores e técnicos gastem energia de formas diferentes, além da possibilidade de tratar diferentes funcionários de forma genérica.
* **Tratamento de Exceções Personalizadas:** Criação de exceções focadas no domínio do negócio, como `ProfissionalLesionadoException` e `EnergiaInsuficienteException`, garantindo que regras como "um jogador machucado não pode treinar" sejam respeitadas pela arquitetura (uso de blocos `try-catch` e `throws`).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos
* **IDE:** IntelliJ IDEA
* **Controle de Versão:** Git e GitHub Desktop

## ⚙️ Como executar o projeto

1. Clone este repositório para a sua máquina local:
   ```bash
