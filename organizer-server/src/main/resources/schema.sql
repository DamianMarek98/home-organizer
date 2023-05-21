create table if not exists shopping_product
(
    id   serial unique primary key not null,
    name varchar(255)              not null
);