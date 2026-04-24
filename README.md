# 📋 API de Gestão de Tarefas

API REST desenvolvida com Java e Spring Boot para gerenciamento de tarefas,
com persistência de dados em MySQL via Spring Data JPA.

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman (testes)

## 📁 Estrutura do Projeto

src/
├── controller/   # Recebe as requisições HTTP
├── model/        # Entidades do banco de dados
├── repository/   # Acesso ao banco via JPA
└── service/      # Regras de negócio

## ⚙️ Como rodar localmente

### Pré-requisitos
- Java 17+
- MySQL rodando localmente
- Maven

### Configuração

1. Clone o repositório:
git clone https://github.com/eduardoxz23r/projeto-api-tarefas.git

2. Configure o banco no application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/tarefas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

3. Rode o projeto:
./mvnw spring-boot:run

4. Acesse:
http://localhost:8080/tarefas

## 📬 Testando com Postman

POST /tarefas — body exemplo:
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar controllers e repositories",
  "status": "PENDENTE"
}

## 👨‍💻 Autor

Carlos Eduardo — github.com/eduardoxz23r
