# 🗄️ Pasta de Banco de Dados (/database)

Este diretório é responsável pela camada de persistência de dados da **Agenda**, contendo esquemas, migrações e configurações de conexão.

## 📂 Conteúdo desta pasta

* **Schema/Models:** Definição da estrutura das tabelas ou coleções (ex: Usuários, Compromissos).
* **Migrations:** Scripts para evolução da estrutura do banco de dados.
* **Seeds:** Dados iniciais para popular o sistema em ambiente de desenvolvimento.
* **Config:** Configurações de conexão (host, porta, credenciais).

## 🛠️ Arquivos Comuns

- `schema.sql` — Script de criação das tabelas.
- `connection.js` — Lógica de inicialização do cliente do banco de dados.
- `seed.json` — Dados de exemplo para testes.

---
> **Atenção:** Nunca faça commit de arquivos `.env` ou senhas reais nesta pasta. Utilize sempre variáveis de ambiente para gerenciar dados sensíveis.
