INSERT INTO social_net.net.roles (id_role, role) VALUES (1, 'admin');
INSERT INTO social_net.net.roles (id_role, role) VALUES (2, 'user');
INSERT INTO social_net.net.roles (id_role, role) VALUES (3, 'devops');

INSERT INTO social_net.net.login (id_login, login, password, role) VALUES (1, 'login1', 'password1', 1);
INSERT INTO social_net.net.login (id_login, login, password, role) VALUES (2, 'login2', 'password2', 2);
INSERT INTO social_net.net.login (id_login, login, password, role) VALUES (3, 'login3', 'password3', 3);
INSERT INTO social_net.net.login (id_login, login, password, role) VALUES (4, 'login4', 'password4', 2);
INSERT INTO social_net.net.login (id_login, login, password, role) VALUES (5, 'login5', 'password5', 2);

INSERT INTO social_net.net.telephone_number(id_number, number, id_login) VALUES (1, '7(921)888-55-77', 1);
INSERT INTO social_net.net.telephone_number(id_number, number, id_login) VALUES (2, '7(911)123-45-67', 2);
INSERT INTO social_net.net.telephone_number(id_number, number, id_login) VALUES (3, '7(901)987-13-14', 3);

INSERT INTO social_net.net.users (id_user, firstname, lastname, secondname, login) VALUES (1, 'Pavel', 'Ivaanov',null, 2);
INSERT INTO social_net.net.users (id_user, firstname, lastname, secondname, login) VALUES (2, 'Ivan', 'Petrov', 'Alekseevich', 1);
INSERT INTO social_net.net.users (id_user, firstname, lastname, secondname, login) VALUES (3, 'Maks', 'Kraynov', 'Petrovich', 3);
INSERT INTO social_net.net.users (id_user, firstname, lastname, secondname, login) VALUES (4, 'Aleks', 'Fedorov', null, 3);
INSERT INTO social_net.net.users (id_user, firstname, lastname, secondname, login) VALUES (5, 'Nikolay', 'Ushakov', null, 3);
INSERT INTO social_net.net.users (id_user, firstname, lastname, secondname, login) VALUES (6, 'Michail', 'Usov', null, 3);

INSERT INTO social_net.net.friends (id, id_frends, id_user) VALUES (1, 2, 1);
INSERT INTO social_net.net.friends (id, id_frends, id_user) VALUES (2, 4, 1);
INSERT INTO social_net.net.friends (id, id_frends, id_user) VALUES (3, 5, 1);
INSERT INTO social_net.net.friends (id, id_frends, id_user) VALUES (4, 2, 3);
INSERT INTO social_net.net.friends (id, id_frends, id_user) VALUES (5, 2, 5);
INSERT INTO social_net.net.friends (id, id_frends, id_user) VALUES (6, 3, 4);

INSERT INTO social_net.net.message (id, message, date, id_user) VALUES (1, 'Hello', now(), 1);
INSERT INTO social_net.net.message (id, message, date, id_user) VALUES (2, 'Hi', now(), 1);
INSERT INTO social_net.net.message (id, message, date, id_user) VALUES (3, 'buter', now(), 2);
INSERT INTO social_net.net.message (id, message, date, id_user) VALUES (4, 'text', now(), 3);
INSERT INTO social_net.net.message (id, message, date, id_user) VALUES (5, 'sell', now(), 4);
INSERT INTO social_net.net.message (id, message, date, id_user) VALUES (6, 'buy', now(), 5);

INSERT INTO social_net.net.foto (id, ref_foto, date, id_user) VALUES (1, 'http://local.foto1', now(), 1);
INSERT INTO social_net.net.foto (id, ref_foto, date, id_user) VALUES (2, 'http://local.foto2', now(), 1);
INSERT INTO social_net.net.foto (id, ref_foto, date, id_user) VALUES (3, 'http://local.foto3', now(), 4);
INSERT INTO social_net.net.foto (id, ref_foto, date, id_user) VALUES (4, 'http://local.foto4', now(), 6);
INSERT INTO social_net.net.foto (id, ref_foto, date, id_user) VALUES (5, 'http://local.foto5', now(), 2);
INSERT INTO social_net.net.foto (id, ref_foto, date, id_user) VALUES (6, 'http://local.foto6', now(), 1);

INSERT INTO social_net.net.post (id, date, ref_post, user_id) VALUES (1, now(), 'http://local.post', 3);
INSERT INTO social_net.net.post (id, date, ref_post, user_id) VALUES (2, now(), 'http://local.post45', 3);
INSERT INTO social_net.net.post (id, date, ref_post, user_id) VALUES (3, now(), 'http://local.post13', 2);
INSERT INTO social_net.net.post (id, date, ref_post, user_id) VALUES (4, now(), 'http://local.post78', 6);
INSERT INTO social_net.net.post (id, date, ref_post, user_id) VALUES (5, now(), 'http://local.post99', 1);
INSERT INTO social_net.net.post (id, date, ref_post, user_id) VALUES (6, now(), 'http://local.post7', 4);
