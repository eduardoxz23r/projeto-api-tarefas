# API de Gerenciamento de Tarefas

API REST desenvolvida com Java e Spring Boot para gerenciamento de tarefas, com persistência de dados em H2 Database via Spring Data JPA.

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Postman

## 📁 Estrutura do Projeto

src/
├── controller/ # Recebe as requisições HTTP
├── model/      # Entidades do banco de dados
├── repository/ # Acesso ao banco via JPA
└── service/    # Regras de negócio

## ⚙️ Como rodar localmente

### Pré-requisitos

- Java 17+
- Maven

### Configuração

1. Clone o repositório:
   git clone https://github.com/eduardoxz23r/projeto-api-tarefas.git

2. Rode o projeto:
   ./mvnw spring-boot:run

3. Acesse o H2 Console:
   http://localhost:8082/h2-console

4. Acesse as tarefas:
   http://localhost:8082/tarefas

## 📬 Testando com o Postman

POST /tarefas — corpo exemplo:
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar controladores e repositórios",
  "status": "PENDENTE"
}
