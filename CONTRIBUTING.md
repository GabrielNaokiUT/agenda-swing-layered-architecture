# 🤝 Como Contribuir

Obrigado por considerar contribuir com o **Agenda Swing**! Este guia explica como participar do projeto da forma mais organizada possível.

---

## 📋 Pré-requisitos

- JDK 17+
- Apache Maven 3.8+
- Git configurado

---

## 🔀 Fluxo de Trabalho (Git Flow simplificado)

```
main           ← produção estável
└── develop    ← integração de features
    └── feature/nome-da-feature
    └── fix/nome-do-bug
```

### Passo a passo

1. **Fork** o repositório e clone localmente:
   ```bash
   git clone https://github.com/SEU_USUARIO/agenda-swing-layered-architecture.git
   ```

2. Crie uma **branch** a partir de `develop`:
   ```bash
   git checkout develop
   git pull origin develop
   git checkout -b feature/minha-nova-feature
   ```

3. Faça suas alterações seguindo os padrões abaixo.

4. **Commit** com mensagem clara (padrão Conventional Commits):
   ```bash
   git commit -m "feat: adiciona validação de CPF no formulário"
   git commit -m "fix: corrige NullPointerException ao abrir agenda vazia"
   git commit -m "refactor: extrai lógica de busca para ContatoService"
   git commit -m "docs: atualiza README com instruções de execução"
   ```

5. **Push** e abra um **Pull Request** para `develop`:
   ```bash
   git push origin feature/minha-nova-feature
   ```

---

## 📐 Padrões de Código

### Nomenclatura
- Classes: `PascalCase` (ex: `ContatoService`, `AgendaDAO`)
- Métodos e variáveis: `camelCase` (ex: `buscarPorNome`, `telefoneFormatado`)
- Constantes: `UPPER_SNAKE_CASE` (ex: `MAX_CONTATOS`)
- Pacotes: `lowercase` (ex: `com.agenda.dao`)

### Organização dos pacotes
```
com.agenda.view       ← Telas e componentes Swing
com.agenda.service    ← Regras de negócio
com.agenda.dao        ← Acesso ao banco de dados
com.agenda.model      ← Entidades (POJOs)
com.agenda.util       ← Utilitários e helpers
```

### Boas práticas
- Cada camada só deve conhecer a camada imediatamente abaixo dela
- A camada `view` **nunca** acessa diretamente a `dao`
- Valide dados na camada `service`, nunca na `view`
- Trate exceções de banco com mensagens claras ao usuário

---

## 🐛 Reportando Bugs

Use a aba [Issues](https://github.com/Nomscodes/agenda-swing-layered-architecture/issues) com o template:

```
**Descrição:** O que aconteceu?
**Como reproduzir:** Passos para reproduzir o bug
**Comportamento esperado:** O que deveria acontecer?
**Ambiente:** OS, versão do Java, versão do Maven
**Logs/Screenshot:** (se aplicável)
```

---

## 💡 Sugerindo Melhorias

Abra uma Issue com a label `enhancement` descrevendo:
- O problema que a melhoria resolve
- Como você imagina a solução
- Impacto esperado

---

## ✅ Checklist antes do PR

- [ ] O código compila sem erros (`mvn clean compile`)
- [ ] A feature segue a separação de camadas da arquitetura
- [ ] Nenhum arquivo de IDE ou binário foi commitado
- [ ] O PR tem uma descrição clara do que foi feito
