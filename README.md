# 📅 Agenda Swing — Layered Architecture

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/Architecture-3--Tier-6DB33F?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-Stable-brightgreen?style=for-the-badge"/>
</p>

> Sistema de agenda de contatos desenvolvido em **Java Swing** com **arquitetura em 3 camadas (3-Tier)**, demonstrando a evolução de um código monolítico para uma estrutura desacoplada, de fácil manutenção e extensão.

---

## 📌 Sumário

- [Sobre o Projeto](#-sobre-o-projeto)
- [Arquitetura](#️-arquitetura)
- [Tecnologias](#-tecnologias)
- [Estrutura de Diretórios](#-estrutura-de-diretórios)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Documentação](#-documentação)
- [Equipe](#-equipe)
- [Licença](#-licença)

---

## 🎯 Sobre o Projeto

Este projeto foi desenvolvido como **Projeto Integrador** na **FATESG SENAI** (Análise e Desenvolvimento de Sistemas — 3º Semestre). O objetivo central é demonstrar, na prática, a **transição de uma abordagem monolítica para uma Arquitetura em Camadas**, separando responsabilidades e promovendo manutenibilidade, testabilidade e escalabilidade.

**Funcionalidades principais:**

- Cadastro, edição e exclusão de contatos
- Busca e filtragem de contatos por nome/telefone
- Persistência local via banco de dados SQLite
- Interface gráfica desktop com Java Swing

---

## 🏗️ Arquitetura

O sistema é dividido em **3 camadas independentes**, seguindo o padrão **3-Tier Architecture**:

```
┌─────────────────────────────────┐
│         Camada de Visão         │  ← Java Swing (UI / Apresentação)
│   src/main/java/.../view/       │
├─────────────────────────────────┤
│        Camada de Negócio        │  ← Regras de negócio e validações
│   src/main/java/.../service/    │
├─────────────────────────────────┤
│         Camada de Dados         │  ← Padrão DAO + SQLite
│   src/main/java/.../dao/        │
└─────────────────────────────────┘
```

| Camada | Pacote | Responsabilidade |
|--------|--------|-----------------|
| **View** | `view` | Interfaces Swing, formulários, tabelas |
| **Service / Business** | `service` | Validações, lógica de negócio |
| **DAO / Data** | `dao` | Consultas SQL, acesso ao SQLite |

---

## 🛠 Tecnologias

| Tecnologia | Versão | Uso |
|------------|--------|-----|
| Java | 17+ | Linguagem principal |
| Java Swing | — | Interface gráfica desktop |
| SQLite | 3.x | Banco de dados local |
| sqlite-jdbc | 3.45+ | Driver JDBC para SQLite |
| Apache Maven | 3.8+ | Gerenciamento de dependências e build |

---

## 📂 Estrutura de Diretórios

```
agenda-swing-layered-architecture/
│
├── src/
│   └── main/
│       └── java/
│           └── com/agenda/
│               ├── view/          # Camada de Visão (Swing)
│               ├── service/       # Camada de Negócio
│               ├── dao/           # Camada de Dados (DAO)
│               └── model/         # Entidades / POJOs
│
├── database/                      # Arquivo .db gerado em runtime
├── docs/                          # Documentação técnica (DAS, UML)
├── lib/                           # JARs externos (se necessário)
│
├── pom.xml                        # Configuração Maven
├── .gitignore
└── README.md
```

---

## ✅ Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **JDK 17** ou superior → [Download](https://adoptium.net/)
- **Apache Maven 3.8+** → [Download](https://maven.apache.org/download.cgi)

Para verificar:

```bash
java -version
mvn -version
```

---

## 🚀 Como Executar

### 1. Clone o repositório

```bash
git clone https://github.com/Nomscodes/agenda-swing-layered-architecture.git
cd agenda-swing-layered-architecture
```

### 2. Compile o projeto

```bash
mvn clean compile
```

### 3. Execute a aplicação

```bash
mvn exec:java -Dexec.mainClass="com.agenda.Main"
```

> **Nota:** O banco de dados SQLite (`agenda.db`) será criado automaticamente na pasta `database/` na primeira execução.

### Build com JAR executável

```bash
mvn clean package
java -jar target/agenda-swing.jar
```

---

## 📚 Documentação

A documentação completa está disponível na pasta [`docs/`](./docs/):

| Documento | Descrição |
|-----------|-----------|
| [Guia de Instalação](./docs/) | Passo a passo completo de configuração |
| [Arquitetura do Sistema (DAS)](./docs/) | Documento baseado no modelo arquitetural 4+1 |
| [Diagramas UML](./docs/) | Diagrama de classes, sequência e casos de uso |

---

## 👥 Equipe

| Nome | GitHub |
|------|--------|
| Alexander | [@Alexsanei](https://github.com/Alexsanei) |
| Caio Abreu | [@Caio4breu](https://github.com/Caio4breu) |
| Cassiano Abreu | [@Nomscodes](https://github.com/Nomscodes) |
| Gabriel Naoki | [@GabrielNaokiUT](https://github.com/GabrielNaokiUT) |
| Wyllian Mariano | [@wyllianmn](https://github.com/wyllianmn) |

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](./LICENSE) para mais detalhes.

---

<p align="center">
  Desenvolvido com ☕ durante o Projeto Integrador — FATESG SENAI
</p>
