# 🌱 Raízes do Nordeste API

API REST para gerenciamento da rede de franquias **Raízes do Nordeste**.

O sistema contempla gerenciamento de usuários, autenticação, pedidos multicanal, estoque, fidelização, pagamento desacoplado via mock e auditoria, seguindo uma arquitetura em camadas com Spring Boot.

---

# 📌 Funcionalidades

- Cadastro e autenticação de usuários
- Controle de acesso por perfis (roles)
- Cardápio por unidade
- Criação e acompanhamento de pedidos
- Controle de estoque
- Programa de fidelidade
- Registro de consentimento LGPD
- Pagamento via gateway simulado (mock)
- Auditoria de operações sensíveis
- Documentação via Swagger/OpenAPI

---

# 🚀 Tecnologias Utilizadas

## Backend

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Security
- Hibernate
- Maven

## Banco de Dados

- PostgreSQL 16
- Flyway Migration

## Segurança

- JWT
- BCrypt
- Controle de acesso por roles

## Documentação

- Swagger / OpenAPI

## Ambiente

- Docker
- Docker Compose

---

# 📋 Requisitos do Ambiente

Antes de iniciar, instale:

| Ferramenta | Versão |
|---|---|
| Java | 17+ |
| Maven | 3.9+ |
| PostgreSQL | 16+ |
| Git | 2.40+ |
| Docker | Opcional |

Verifique:
java version


# 📥 Clonar o projeto
git clone https://github.com/seu-usuario/raizes-nordeste-api.git

##Entrar na pasta:

cd raizes-nordeste-api
⚙️ Configuração de Ambiente

O projeto utiliza variáveis de ambiente para dados sensíveis.

##Crie um arquivo:

.env

##Baseado no exemplo:

.env.example
Exemplo .env.example
DB_HOST=localhost

DB_PORT=5432

DB_NAME=raizes

DB_USERNAME=postgres

DB_PASSWORD=postgres


JWT_SECRET=raizes-secret-key

JWT_EXPIRATION=86400000
🗄️ Configuração do Banco de Dados

Criar banco no PostgreSQL:

CREATE DATABASE raizes;

O projeto utiliza Flyway para criar tabelas automaticamente.

# 🛠️ Migrations

##As migrations ficam em:

src/main/resources/db/migration

##Estrutura:

V1__create_tables.sql
V2__insert_seed.sql
V3__create_indexes.sql

Ao iniciar a aplicação:

tabelas são criadas;
índices são aplicados;
dados iniciais são inseridos.
# 🌱 Dados Iniciais (Seed)

Usuário administrador:

Email:
admin@raizes.com

Senha:
123456

O usuário possui perfil:

ADMIN
# 📦 Instalar dependências

Executar:

mvn clean install
# ▶️ Executar aplicação

Iniciar pelo Maven:

mvn spring-boot:run

Ou executar:

RaizesNordesteApplication.java

A API ficará disponível:

http://localhost:8080
# 🐳 Executar com Docker

Construir imagem:

docker build -t raizes-api .

Subir serviços:

docker compose up

##Serviços:

API
localhost:8080

PostgreSQL
localhost:5432
# 📚 Swagger / OpenAPI

Após iniciar a API:

Acesse:

http://localhost:8080/swagger-ui/index.html

##Documentação JSON:

http://localhost:8080/v3/api-docs
# 🔐 Autenticação

O sistema utiliza JWT.

##Fluxo:

Login
  ↓
Recebe Token JWT
  ↓
Enviar no Header

##Exemplo:

Authorization: Bearer TOKEN
👥 Perfis de Acesso
Perfil	Permissão
ADMIN	Administração completa
GERENTE	Produtos, estoque e relatórios
ATENDENTE	Criar pedidos
COZINHEIRO	Atualizar preparo
CLIENTE	Pedidos e fidelidade
# 💳 Pagamento Mock

O sistema não processa pagamentos reais.

Fluxo:

Pedido
   |
   ↓
PaymentGateway
   |
   ↓
MockPaymentGateway
   |
   ↓
Resposta

Possíveis retornos:

APROVADO
NEGADO
PROCESSANDO
# 🧪 Testes

##Executar testes:

mvn test

Cobertura:

criação de pedidos;
validação de estoque;
autenticação;
regras de negócio.
# 📂 Estrutura do Projeto
raizes-nordeste-api

src/main/java/com/raizes

├── controller
├── service
├── repository
├── entity
├── dto
├── enums
├── security
├── integration
├── audit
├── config
└── exception
# 🏗️ Arquitetura
Cliente
(APP / TOTEM / WEB / BALCÃO)

        ↓

Controller

        ↓

Service

        ↓

Repository

        ↓

PostgreSQL

Integrações externas:

PaymentGateway

        ↓

Mock / Gateway Real
# 📌 Regras Implementadas

✔ Pedido exige canal de origem
✔ Controle de estoque por unidade
✔ Bloqueio de venda sem estoque
✔ Atualização de status do pedido
✔ Auditoria de ações sensíveis
✔ Dados protegidos conforme LGPD
✔ Senhas armazenadas com hash
✔ API documentada
