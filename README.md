# 🚀 API Gestão de Tarefas - Spring Boot

Uma API REST para gestão de tarefas e usuários, desenvolvida em Java Spring Boot com PostgreSQL.

## 🛠️ Tecnologias

- **Java 17**
- **Spring Boot 3.5.7**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Git**

## 📋 Funcionalidades

- ✅ **CRUD de Tarefas** (COMPLETO - Create, Read, Update, Delete)
- ✅ **Gestão de Usuários** (Create e Read)
- ✅ **Relação Usuário-Tarefa**
- ✅ **Status de Tarefa** (PENDENTE, EM_ANDAMENTO, CONCLUÍDA)
- ✅ **API RESTful** com endpoints documentados

## 🗂️ Estrutura do Projeto

gestao-tarefas/
├── src/main/java/com/marcos4lves/gestao_tarefas/
│ ├── entity/ # Entidades JPA (Usuario, Tarefa, StatusTarefa)
│ ├── repository/ # Interfaces JPA (UsuarioRepository, TarefaRepository)
│ ├── controller/ # Endpoints REST (UsuarioController, TarefaController)
│ └── GestaoTarefasApplication.java
├── src/main/resources/
│ └── application.properties
├── database-script.sql # Script de criação do banco
└── README.md

## 🚀 Como Executar

1. **Clone o repositório:**
   git clone https://github.com/marcos4lves/gestao-tarefas-api.git

2. Configure o PostgreSQL:
   Execute o script database-script.sql
   Configure conexão em application.properties

3. Execute a aplicação:
   ./mvnw spring-boot:run

📡 Endpoints da API
👥 Usuários
GET /usuarios - Lista todos os usuários

POST /usuarios - Cria novo usuário

✅ Tarefas
GET /tarefas - Lista todas as tarefas

GET /tarefas/{id} - Busca tarefa por ID

POST /tarefas - Cria nova tarefa

PUT /tarefas/{id} - Atualiza tarefa existente

DELETE /tarefas/{id} - Remove tarefa

🗃️ Modelo de Dados
Usuario
id: Long (auto-increment)
nome: String
email: String

Tarefa
id: Long (auto-increment)
titulo: String
descricao: String
dataCriacao: LocalDateTime
status: StatusTarefa (PENDENTE, EM_ANDAMENTO, CONCLUÍDA)
usuario: Usuario (Many-to-One)

🧪 Testes
Use Postman para testar os endpoints:
Porta: 8080
Collection: Disponível nos commits
