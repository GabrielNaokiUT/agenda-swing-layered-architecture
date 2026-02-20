# Agenda Swing: Evolução Arquitetural Didática 📅

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-07405E?style=for-the-badge&logo=sqlite&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-blue?style=for-the-badge)

## 📌 Sobre o Projeto
Este projeto foi desenvolvido como parte do **Projeto Integrador na FATESG Senai (Análise e Desenvolvimento de Sistemas)**. A "Agenda Swing" não é apenas um gerenciador de contatos, mas um estudo de caso sobre a **transição de um código monolítico para uma Arquitetura em Camadas (3-Tier)**.

O objetivo principal foi aplicar boas práticas de engenharia de software, separando responsabilidades entre Interface (UI), Regras de Negócio (Business) e Persistência de Dados (Data).

## 🏗️ Arquitetura do Sistema
O sistema utiliza o padrão de **Arquitetura em Camadas**, seguindo o modelo de Visão "4+1" de Kruchten, conforme detalhado no [Documento de Arquitetura (DAS)](./docs/Agenda_Swing_DOCUMENTO_ARQUITETURA_DE_SOFTWARE_DAS01.pdf).

1.  **Camada de Visão (UI):** Desenvolvida em Java Swing, focada na interação com o usuário.
2.  **Camada de Negócio (Service/Business):** Responsável pelas validações e lógica do sistema.
3.  **Camada de Dados (DAO/Data):** Gerencia a persistência no banco de dados SQLite, garantindo desacoplamento.

## 🚀 Funcionalidades
- [x] **CRUD Completo:** Cadastro, Consulta, Edição e Exclusão de contatos.
- [x] **Persistência Local:** Armazenamento robusto utilizando SQLite.
- [x] **Validações:** Garantia de integridade dos dados na camada de negócio.
- [x] **Disponibilidade Offline:** Funcionamento 100% local sem dependência de internet.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java (JDK 17 ou superior)
- **Interface Gráfica:** Java Swing
- **Banco de Dados:** SQLite
- **Documentação:** Modelo de Visão 4+1 e UML

## 📂 Estrutura de Pastas
```text
├── docs/               # Documentação oficial (DAS e Diagramas)
├── src/
│   ├── ui/             # Telas e componentes Swing
│   ├── business/       # Regras de negócio e validações
│   └── data/           # Classes DAO e conexão com SQLite
├── lib/                # Bibliotecas e Drivers (.jar)
└── database/           # Arquivo do banco de dados SQLite
