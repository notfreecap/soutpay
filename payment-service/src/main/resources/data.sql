INSERT INTO user_tbl (first_name, last_name, email, phone_number, address)
VALUES ('pepe', 'tester', 'pepetester@epep.com', '31025456687', 'pepe home');

INSERT INTO payment (payment_UUID, payment_date, payment_method, amount, user_id)
VALUES (RANDOM_UUID(), '2022-05-29 11:20:26', 'CREDIT_CARD', 10.0, 1);