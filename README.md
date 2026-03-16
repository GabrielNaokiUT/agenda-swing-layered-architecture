# 📅 Agenda Swing — Layered Architecture

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/Architecture-3--Tier-6DB33F?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/FATESG%20SENAI-Projeto%20Integrador-0057A8?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-Stable-brightgreen?style=for-the-badge"/>
</p>

> Sistema de agenda de contatos desenvolvido em **Java Swing** com **arquitetura em 3 camadas (3-Tier)**, demonstrando a evolução de um código monolítico para uma estrutura desacoplada e de fácil manutenção. Projeto acadêmico do **3º semestre de ADS — FATESG SENAI**.

---

## 📌 Sumário

- [Sobre o Projeto](#-sobre-o-projeto)
- [Arquitetura](#️-arquitetura)
- [Decisões Arquiteturais (ADRs)](#-decisões-arquiteturais-adrs)
- [Tecnologias](#-tecnologias)
- [Estrutura de Diretórios](#-estrutura-de-diretórios)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Documentação](#-documentação)
- [Equipe](#-equipe)
- [Licença](#-licença)

---

## 🎯 Sobre o Projeto

Este projeto foi desenvolvido como **Projeto Integrador** na **FATESG SENAI** (Análise e Desenvolvimento de Sistemas — 3º Semestre). O objetivo central é demonstrar, na prática, a **transição de uma abordagem monolítica para uma Arquitetura em Camadas**, com evolução incremental documentada através de ADRs (Architecture Decision Records).

**Funcionalidades:**

- Cadastro, edição e inativação de contatos (Soft Delete)
- Busca e listagem de contatos ativos
- Validação centralizada de dados na camada de negócio
- Persistência local via banco de dados SQLite
- Interface gráfica desktop com Java Swing

---

## 🏗️ Arquitetura

O sistema evoluiu em 3 etapas documentadas, chegando à seguinte estrutura final:

```
┌─────────────────────────────────────┐
│         Camada de Visão (View)       │  ← Java Swing — JFrames, Panels, Listeners
├─────────────────────────────────────┤
│       Camada de Negócio (Service)    │  ← Regras de negócio + Validação
│       Camada de Validação            │  ← br.edu.fatesg.validation
├─────────────────────────────────────┤
│      Camada de Dados (Repository)    │  ← Interface + Implementação SQLite
│      Camada de Modelo (Entity)       │  ← POJOs (Contato)
└─────────────────────────────────────┘
```

**Fluxo de dependência:**
```
View → Controller → Service → Repository → Banco de Dados
```

---

## 📋 Decisões Arquiteturais (ADRs)

As principais decisões do projeto estão documentadas na pasta [`docs/`](./docs/):

| ADR | Título | Status | Data |
|-----|--------|--------|------|
| [ADR 0001](./docs/ADR%200001%20-%20Bot%C3%A3o%20Excluir.docx.pdf) | Botão Excluir — Soft Delete | ✅ Aceito | 05/02/2026 |
| [ADR 0002](./docs/ADR%200002%20-%20Controller%20-%20First.docx.pdf) | Controller-First | ✅ Aceito | 05/02/2026 |
| [ADR 0003](./docs/ADR%200003%20-%20Camadas%20Service%20e%20Repository.docx.pdf) | Camadas Service e Repository | ✅ Aceito | 04/03/2026 |

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
│   └── main/java/br/edu/fatesg/
│       ├── view/           # Camada de Visão (Swing)
│       ├── controller/     # Controllers (interfaces + implementações)
│       ├── service/        # Camada de Negócio
│       ├── validation/     # Validações centralizadas (SRP)
│       ├── repository/     # Camada de Dados (DAO/Repository)
│       └── model/          # Entidades (POJOs)
│
├── database/               # Arquivo .db gerado em runtime
├── docs/                   # Documentação técnica completa
│   ├── diagramas/          # Diagramas UML
│   ├── ADR 0001 - Botão Excluir.pdf
│   ├── ADR 0002 - Controller - First.pdf
│   ├── ADR 0003 - Camadas Service e Repository.pdf
│   └── Agenda_Swing_DAS1.2.pdf
├── lib/                    # JARs externos
│
├── pom.xml                 # Configuração Maven
├── .gitignore
├── CONTRIBUTING.md
├── LICENSE
└── README.md
```

---

## ✅ Pré-requisitos

- **JDK 17** ou superior → [Download](https://adoptium.net/)
- **Apache Maven 3.8+** → [Download](https://maven.apache.org/download.cgi)

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
mvn exec:java -Dexec.mainClass="br.edu.fatesg.Main"
```

> O banco de dados SQLite (`agenda.db`) é criado automaticamente na pasta `database/` na primeira execução.

### Build com JAR executável

```bash
mvn clean package
java -jar target/agenda-swing.jar
```

---

## 📚 Documentação

Toda a documentação técnica está disponível em [`docs/`](./docs/):

| Documento | Descrição |
|-----------|-----------|
| [DAS v1.2](./docs/Agenda_Swing_DOCUMENTO_ARQUITETURA_DE_SOFTWARE_DAS1.2.docx.pdf) | Documento de Arquitetura de Software — modelo 4+1 |
| [ADR 0001](./docs/ADR%200001%20-%20Bot%C3%A3o%20Excluir.docx.pdf) | Decisão: Soft Delete no botão Excluir |
| [ADR 0002](./docs/ADR%200002%20-%20Controller%20-%20First.docx.pdf) | Decisão: Estratégia Controller-First |
| [ADR 0003](./docs/ADR%200003%20-%20Camadas%20Service%20e%20Repository.docx.pdf) | Decisão: Extração das camadas Service e Repository |
| [Guia de Instalação](./docs/instalacao.md) | Passo a passo para configurar e rodar o projeto |
| [Diagramas UML](./docs/diagramas/) | Diagrama de classes, sequência e implantação |

---

## 👥 Equipe

| Nome | GitHub |
|------|--------|
| Alexander Nogueira | [@Alexsanei](https://github.com/Alexsanei) |
| Caio Nunes de Abreu | [@Caio4breu](https://github.com/Caio4breu) |
| Cassiano Nunes de Abreu | [@Nomscodes](https://github.com/Nomscodes) |
| Gabriel Naoki Uto Turigoe | [@GabrielNaokiUT](https://github.com/GabrielNaokiUT) |
| Wyllian Mariano Nogueira | [@wyllianmn](https://github.com/wyllianmn) |

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo [LICENSE](./LICENSE) para mais detalhes.

---

<p align="center">
  Desenvolvido com ☕ no Projeto Integrador — FATESG SENAI · ADS 3º Semestre · 2026
</p>
