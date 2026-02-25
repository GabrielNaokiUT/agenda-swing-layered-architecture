# 🚀 Código Fonte (/src)

Este é o coração da **Agenda**. O projeto segue uma arquitetura em camadas para garantir que a interface seja independente da lógica e dos dados.

## 📂 Organização das Camadas

### 1. 🖥️ UI (User Interface)
Localizada em `src/ui/`.
- Contém todas as telas (JFrames) e componentes (JButtons, JTables) feitos em **Java Swing**.
- **Regra:** Não deve conter cálculos ou acesso direto ao banco de dados.

### 2. 🧠 Business (Regras de Negócio)
Localizada em `src/business/`.
- Contém a inteligência do sistema.
- Validações (ex: "não permitir agendamento no passado").
- Processamento de dados antes de salvar ou exibir.

### 3. 💾 Data (Persistência)
Localizada em `src/data/`.
- Contém as classes **DAO** (Data Access Object).
- Responsável por executar os comandos SQL no SQLite.
- Gerencia a abertura e fechamento de conexões.

---
> **Fluxo de Dados:** UI ➔ Business ➔ Data ➔ Banco de Dados
