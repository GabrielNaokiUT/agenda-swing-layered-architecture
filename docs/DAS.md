# 🏛️ Documento de Arquitetura de Software (DAS) - Agenda

Este documento detalha a estrutura técnica da Agenda, utilizando o padrão de **Arquitetura em Camadas**.

## 1. Tecnologias Utilizadas
* **Linguagem:** Java
* **Interface Gráfica:** Java Swing
* **Banco de Dados:** SQLite
* **Driver JDBC:** SQLite JDBC Driver (localizado em `/lib`)

## 2. Divisão de Camadas
O sistema é dividido em três pastas principais dentro de `src/`, seguindo a separação de responsabilidades:

### 📱 UI (User Interface) - `src/ui/`
* Contém os formulários (`JFrame`) e componentes visuais.
* Responsável apenas por exibir os dados e capturar os cliques do usuário.

### 🧠 Business - `src/business/`
* Onde ficam as regras de negócio.
* Exemplo: Validação se o nome do contato está vazio antes de salvar.

### 💾 Data (DAO) - `src/data/`
* Camada de acesso aos dados (**Data Access Object**).
* Contém as instruções SQL (`INSERT`, `SELECT`, etc.) e a classe de conexão com o banco em `/database/agenda.db`.

## 3. Fluxo de Dados
1. O usuário clica em "Salvar" na **UI**.
2. A **UI** chama uma função na **Business**.
3. A **Business** valida os dados e, se estiver tudo certo, chama a **Data**.
4. A **Data** executa o SQL no SQLite.
