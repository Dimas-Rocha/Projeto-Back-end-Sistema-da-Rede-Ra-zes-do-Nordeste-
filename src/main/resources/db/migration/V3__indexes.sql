CREATE INDEX idx_email
ON usuario(email);


CREATE INDEX idx_pedido_status
ON pedido(status);


CREATE INDEX idx_pedido_canal
ON pedido(canal_pedido);