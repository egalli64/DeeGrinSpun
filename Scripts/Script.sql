DROP TABLE green_ristoranti;
create table green_ristoranti (
ristorante_id integer
constraint ristoranti_pk primary key,
nome varchar2(20)
constraint ristoranti_nome_nn not null,
posizione varchar2(20),
posti_disponibili integer,
tipo_cucina varchar2(20),
email varchar2(20));

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (1, 'Trattoria da Vince', '39.14,16.90',100,'cucina calabrese','vinx@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (2, 'Trattoria da Luca', '40.83,14.31',100,'cucina campana','luk@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (3, 'Trattoria da Tony', '36.81,14.96',100,'cucina sicula','tony@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (4, 'Trattoria da Tommy', '44.70,10.56',100,'cucina emiliana','tom@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (5, 'Pizzeria da Enzo', '45.70,10.56',100,'pizza','enz@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (6, 'Pizzeria da Luca', '38.70,15.56',100,'pizza','lulu@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (7, 'Pizzeria da Tony', '42.70,14.56',100,'pizza','tonytony@live.it');

insert into green_ristoranti (ristorante_id, nome, posizione, posti_disponibili,tipo_cucina,email)
VALUES (8, 'Pizzeria da Tommy', '40.75,13.56',100,'pizza','tommasino@live.it');

