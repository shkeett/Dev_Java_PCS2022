CREATE DATABASE shop ENCODING 'UTF-8';

CREATE SCHEMA IF NOT EXISTS shop.public;

CREATE TABLE IF NOT EXISTS public.goods
(
    id           SERIAL PRIMARY KEY,
    title        VARCHAR(32) NOT NULL,
    price        integer     NOT NULL,
    info         VARCHAR(50),
    date_created TIMESTAMP   NOT NULL
);

CREATE TABLE IF NOT EXISTS public.basket
(
    id       SERIAL PRIMARY KEY,
    goods_id INTEGER NOT NULL,
    count    INTEGER,
    FOREIGN KEY (goods_id) REFERENCES public.goods (id)
);

INSERT INTO shop.public.goods (id, title, price, info, date_created)
VALUES (1, 'AUDI', 2500, 'В наличии', now());
INSERT INTO shop.public.goods (id, title, price, info, date_created)
VALUES (2, 'FORD', 1700, 'В наличии', now());
INSERT INTO shop.public.goods (id, title, price, info, date_created)
VALUES (3, 'BMW', 3500, 'В наличии', now());
INSERT INTO shop.public.goods (id, title, price, info, date_created)
VALUES (4, 'FERRARY', 6800, 'В наличии', now());
INSERT INTO shop.public.goods (id, title, price, info, date_created)
VALUES (5, 'HUMMER', 2700, 'В наличии', now());
