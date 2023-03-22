CREATE TABLE IF NOT EXISTS net.roles
(
    id_role SERIAL PRIMARY KEY,
    role    VARCHAR(10) NOT NULL
);


CREATE TABLE IF NOT EXISTS net.login
(
    id_login SERIAL PRIMARY KEY,
    login    VARCHAR(20) UNIQUE NOT NULL,
    password VARCHAR(20) UNIQUE NOT NULL,
    role     INTEGER            NOT NULL,
    FOREIGN KEY (role) REFERENCES net.roles (id_role)
);

CREATE TABLE IF NOT EXISTS net.telephone_number
(
    id_number SERIAL PRIMARY KEY,
    number    text NOT NULL,
    id_login  INTEGER NOT NULL,
    FOREIGN KEY (id_login) REFERENCES net.login (id_login)
);

CREATE TABLE IF NOT EXISTS net.users
(
    id_user    SERIAL PRIMARY KEY,
    firstname  VARCHAR(15) NOT NULL,
    lastname   VARCHAR(15) NOT NULL,
    secondname VARCHAR(15),
    login      INTEGER     NOT NULL,
    FOREIGN KEY (login) REFERENCES net.login (id_login)
);

CREATE TABLE IF NOT EXISTS net.friends
(
    id        SERIAL PRIMARY KEY,
    id_friends INTEGER NOT NULL,
    id_user   INTEGER NOT NULL,
    FOREIGN KEY (id_user) REFERENCES net.users (id_user)
);

CREATE TABLE IF NOT EXISTS net.message
(
    id      SERIAL PRIMARY KEY,
    message text      NOT NULL,
    date    TIMESTAMP NOT NULL,
    id_user INTEGER   NOT NULL,
    FOREIGN KEY (id_user) REFERENCES net.users (id_user)
);

CREATE TABLE IF NOT EXISTS net.foto
(
    id       SERIAL PRIMARY KEY,
    ref_foto text      NOT NULL,
    date     TIMESTAMP NOT NULL,
    id_user  INTEGER   NOT NULL,
    FOREIGN KEY (id_user) REFERENCES net.users (id_user)
);


CREATE TABLE IF NOT EXISTS net.post
(
    id       SERIAL PRIMARY KEY,
    date     TIMESTAMP NOT NULL,
    ref_post text      NOT NULL,
    user_id  INTEGER   NOT NULL,
    FOREIGN KEY (user_id) REFERENCES net.users (id_user)
);
