
INSERT INTO storage_cellar (name, code, address, active, state) VALUES ('test product', '123e4567-e89b-12d3-a456-426614174000', 'test address', true, 'CREATED')

INSERT INTO product (name, code, stock, price, state, storage_cellar_id) VALUES ('test', '123e4567-e89b-12d3-a456-426614174000', 10, 10, 'CREATED', 1)