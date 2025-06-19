#🧩 micro-service-bff versão 1.0
Desenvolvimento de um bff para interagir com outros microsserviços nos repositórios.
Este projeto é um **Backend for Frontend (BFF)** construído com **Java 21 e Spring Boot 3**, responsável por receber requisições do frontend, validar e repassar para outros microserviços, tratando os erros de forma apropriada e padronizada.
A construção das validações no bff ainda serão feitas, a medida que forem surgindo novos microsserviços, deixando assim o bff mais completo.
---

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot 3.4.6
- Spring Web
- Spring Cloud OpenFeign
- Spring Validation
- MapStruct
- Swagger / Springdoc OpenAPI
- JUnit + Mockito
---

## 📁 Estrutura do Projeto
src
├── main
│ ├── java
│ │ └── com.bff.demo
│ │   ├── DemoApplication.java
│ │   ├── adapters
│ │   │    ├── exception
│ │   │    │ └── handle
│ │   │    ├── input # Controllers
│ │   │    │  ├── web
│ │   │    │  └── dto
│ │   │    ├── mapper # Interfaces do MapStruct
│ │   │    └── output
│ │   │     ├── dto
│ │   │     └── feign # Feign clients
│ │   ├── application # Regras de orquestração
│ │   │   └── ports
│ │   │       ├── input
│ │   │       └── output
│ │   ├── domain # Modelos de negócio (records, entidades)
│ │   └── config # Configurações (Swagger, Feign, ExceptionHandler)
│ └── resources
│ └── application.yml


---

## ⚙️ Como executar localmente
### Pré-requisitos
- Java 21
- Maven 3.8+
- Git
- Clone o projeto por padrão esta configurado para a porta 8081.
### Dicas adicionais
- Use sempre o path na url: /bff . Ela é a raiz para receber as request.
- Exemplo de request para que bate no bff e chama o microsserviço de e-mail: 🔍http://localhost:8081/bff/sendEmail
- Caso queira utilizar o microsserviço de e-mail acesse o link e baixe-o também. 🔍https://github.com/Rudges86/apiEmail

### 📬 Exemplo de request
  - POST /bff/sendEmail
  - Content-Type: application/json
    {
      "to": "destinatario@teste.com",
      "subject": "Assunto do E-mail",
      "body": "Corpo do e-mail aqui."
    }
### 🧭 Swagger
- Por padrão a aplicação sobe na porta 8081.
- Ao subir a aplicação utilize o endereço: http://localhost:8081/bff/swagger-ui/index.html#/email-controller/mailSender

  


