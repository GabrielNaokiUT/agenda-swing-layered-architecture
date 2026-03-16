# 📚 Documentação Técnica — Agenda Swing

<p align="center">
  <img src="https://img.shields.io/badge/DAS-v1.2-0057A8?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/ADRs-3%20decisões-6DB33F?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Modelo-4%2B1-ED8B00?style=for-the-badge"/>
</p>

> Este diretório contém toda a documentação técnica e de engenharia do projeto **Agenda Swing**. Os documentos seguem o modelo arquitetural **4+1** e registram as decisões de design através de **ADRs (Architecture Decision Records)**.

← [Voltar ao repositório principal](../README.md)

---

## 📂 Organização

```
docs/
│
├── diagramas/                                        # Diagramas UML
│   ├── diagrama-classes.png
│   ├── diagrama-sequencia.png
│   └── diagrama-implantacao.png
│
├── ADR 0001 - Botão Excluir.docx.pdf                # ADR: Soft Delete
├── ADR 0002 - Controller - First.docx.pdf           # ADR: Controller-First
├── ADR 0003 - Camadas Service e Repository.docx.pdf # ADR: Service + Repository
├── Agenda_Swing_DAS1.2.docx.pdf                     # Documento de Arquitetura
│
├── instalacao.md                                     # Guia de instalação
└── README.md                                         # Este arquivo
```

---

## 📄 Documentos

### 🏛️ Documento de Arquitetura de Software (DAS)

| Documento | Versão | Data | Descrição |
|-----------|--------|------|-----------|
| [DAS v1.2](./Agenda_Swing_DOCUMENTO_ARQUITETURA_DE_SOFTWARE_DAS1.2.docx.pdf) | 1.2 | 11/03/2026 | Arquitetura completa com visões lógica, de implementação, implantação e casos de uso |

**Histórico de versões do DAS:**

| Versão | Data | Descrição |
|--------|------|-----------|
| 1.0 | 11/02/2026 | Criação inicial — escopo e objetivos |
| 1.1 | 04/03/2026 | Adição das camadas Service e Repository |
| 1.2 | 11/03/2026 | Refatoração arquitetural, pacote `validation` e Soft Delete |

---

### 📋 ADRs — Architecture Decision Records

Os ADRs documentam **cada decisão arquitetural relevante**, incluindo contexto, alternativas consideradas e consequências.

| ADR | Título | Status | Data |
|-----|--------|--------|------|
| [ADR 0001](./ADR%200001%20-%20Bot%C3%A3o%20Excluir.docx.pdf) | Botão Excluir — Soft Delete | ✅ Aceito | 05/02/2026 |
| [ADR 0002](./ADR%200002%20-%20Controller%20-%20First.docx.pdf) | Controller-First | ✅ Aceito | 05/02/2026 |
| [ADR 0003](./ADR%200003%20-%20Camadas%20Service%20e%20Repository.docx.pdf) | Camadas Service e Repository | ✅ Aceito | 04/03/2026 |

#### Resumo das decisões

**ADR 0001 — Soft Delete**
Em vez de deletar fisicamente os registros, o sistema marca contatos como `inativo`, preservando o histórico e permitindo auditorias futuras.

**ADR 0002 — Controller-First**
Estratégia incremental de refatoração: criação de interfaces `FormController` e `ListController` para desacoplar a UI da lógica, com persistência temporária no Controller até extração para Repository.

**ADR 0003 — Camadas Service e Repository**
Extração das responsabilidades do Controller em duas camadas especializadas: `Service` (regras de negócio) e `Repository` (acesso a dados via interface), com injeção de dependência via construtor.

---

### 🗺️ Diagramas UML

Os diagramas estão disponíveis na pasta [`diagramas/`](./diagramas/):

| Diagrama | Descrição |
|----------|-----------|
| Diagrama de Classes | Estrutura e relacionamento das classes por camada |
| Diagrama de Sequência | Fluxo de cadastro de contato — da View ao Repository |
| Diagrama de Implantação | Nodos físicos: Workstation → JRE + SQLite + JAR |
| Casos de Uso | Interações do usuário: Cadastrar, Listar, Inativar |

---

### 🚀 Guia de Instalação

Consulte o [instalacao.md](./instalacao.md) para instruções detalhadas de configuração do ambiente e execução do projeto.

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

<p align="center">
  FATESG SENAI · Análise e Desenvolvimento de Sistemas · 3º Semestre · 2026
</p>
