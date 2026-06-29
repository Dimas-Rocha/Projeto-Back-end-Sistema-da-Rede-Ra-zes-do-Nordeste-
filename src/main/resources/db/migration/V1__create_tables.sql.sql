CREATE TABLE usuario (

id BIGSERIAL PRIMARY KEY,

nome VARCHAR(100),

email VARCHAR(150) UNIQUE,

senha VARCHAR(255),

role VARCHAR(30),

ativo BOOLEAN

);



CREATE TABLE unidade (

id BIGSERIAL PRIMARY KEY,

nome VARCHAR(100),

cidade VARCHAR(100),

estado VARCHAR(50)

);



CREATE TABLE produto (

id BIGSERIAL PRIMARY KEY,

nome VARCHAR(100),

descricao TEXT,

preco NUMERIC(10,2),

ativo BOOLEAN

);



CREATE TABLE pedido (

id BIGSERIAL PRIMARY KEY,

canal_pedido VARCHAR(20),

status VARCHAR(30),

valor_total NUMERIC(10,2),

data_criacao TIMESTAMP

);