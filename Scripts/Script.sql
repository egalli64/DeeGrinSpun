DROP TABLE green_ristoranti;
DROP SEQUENCE green_ristoranti_seq;
CREATE SEQUENCE green_ristoranti_seq;
create table green_ristoranti (
ristorante_id integer
constraint ristoranti_pk primary key,
nome varchar2(222)
constraint ristoranti_nome_nn not null,
posizione varchar2(222),
posti_disponibili integer,
tipo_cucina varchar2(222),
email varchar2(222));

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
DROP SEQUENCE green_utenti_seq;
CREATE SEQUENCE green_utenti_seq;
CREATE TABLE Green_Utenti (
utente_id integer
constraint Green_Utenti_pk primary key,
nome varchar2(222)
constraint utenti_nome_nn not null,
cognome varchar2(222)
constraint utenti_cognome_nn not null,
email varchar2(222)
constraint utenti_email_nn not null,
user_id varchar2(222),
password_user varchar2(222)
constraint utenti_password_nn not null,
affidabilita varchar2(222));

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (green_utenti_seq.nextval, 'Vincenzo', 'Ammirati','vinx718@gmail.com','1','c140','5');

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (green_utenti_seq.nextval, 'Luca', 'Avino','luk@gmail.com','2','c140l','1');

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (green_utenti_seq.nextval, 'Antonio', 'Poidomani','poid@gmail.com','3','c140p','4');

insert into Green_Utenti(utente_id, nome, cognome, email,user_id,password_user,affidabilita)
VALUES (green_utenti_seq.nextval, 'Tommaso', 'Pavan','vtommy@gmail.com','4','c140t','3');



--TABELLA REVIEWS
DROP table reviews;
DROP SEQUENCE reviews_seq;
CREATE SEQUENCE reviews_seq;
create table reviews (
reviews_id integer
constraint reviews_pk primary key,
servizio integer
constraint servizio_ck check(servizio in (1, 2, 3, 4, 5)),
atmosfera integer
constraint atmosfera_ck check(atmosfera in (1, 2, 3, 4, 5)),
qualitaprezzo integer
constraint qualitaprezzo_ck check(qualitaprezzo in (1, 2, 3, 4, 5)),
pulizia integer
constraint pulizia_ck check(pulizia in (1, 2, 3, 4, 5)),
commento varchar2(222));


alter table reviews add constraint ristorante_id_fk ristorante_id references green_ristoranti(ristorante_id);



insert into reviews (reviews_id,ristorante_id, servizio, atmosfera, qualitaprezzo,pulizia,commento)
<<<<<<< HEAD
VALUES (1, 2, 4, 3, 5, 4, 'Posto ideale se si vuole ');
=======
VALUES (reviews_seq.nextval, 2, 4, 3, 5, 4, 'Posto ideale se si vuole spendere poco e mangiare bene, consigliato');
>>>>>>> branch 'master' of https://github.com/egalli64/DeeGrinSpun.git

insert into reviews (reviews_id,ristorante_id, servizio, atmosfera, qualitaprezzo,pulizia,commento)
VALUES (reviews_seq.nextval,5, 4, 3, 4, 4,'Ottimo servizio, proprietari gentili');

insert into reviews (reviews_id,ristorante_id, servizio, atmosfera, qualitaprezzo,pulizia,commento)
VALUES (reviews_seq.nextval,3, 4, 3, 4, 3, 'Ristorante nella media, da provare');

insert into reviews (reviews_id,ristorante_id, servizio, atmosfera, qualitaprezzo,pulizia,commento)
VALUES (reviews_seq.nextval,5, 5, 4, 5, 4, 'Ristorante eccellente, consigliato');





