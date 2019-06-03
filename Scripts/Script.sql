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



--TABELLA UTENTI
DROP TABLE Green_Utenti;
CREATE TABLE Green_Utenti (
utente_id integer
constraint Green_Utenti_pk primary key,
nome varchar2(20)
constraint utenti_nome_nn not null,
cognome varchar2(20)
constraint utenti_cognome_nn not null,
email varchar2(20)
constraint utenti_email_nn not null,
user_id varchar2(20),
password_user varchar2(20)
constraint utenti_password_nn not null,
affidabilita varchar2(20));

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (1, 'Vincenzo', 'Ammirati','vinx718@gmail.com','1','c140','5');

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (2, 'Luca', 'Avino','luk@gmail.com','2','c140l','1');

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (3, 'Antonio', 'Poidomani','poid@gmail.com','3','c140p','4');

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (4, 'Tommaso', 'Pavan','vtommy@gmail.com','4','c140t','3');