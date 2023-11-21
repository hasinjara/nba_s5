create sequence seq_joueur increment by 1 minvalue 1 START 1;
CREATE TABLE joueur(
   id_joueur VARCHAR default 'J'||nextval('seq_joueur'),
   nom VARCHAR(50),
   dtn date,
   chemin VARCHAR,
   PRIMARY KEY(id_joueur)
);


create sequence seq_equipe increment by 1 minvalue 1 START 1;
CREATE TABLE equipe(
   id_equipe VARCHAR default 'E'||nextval('seq_equipe'),
   nom VARCHAR(50) ,
   PRIMARY KEY(id_equipe)
);

create sequence seq_contrat increment by 1 minvalue 1 START 1;
CREATE TABLE contrat(
    id_contrat VARCHAR default 'E'||nextval('seq_equipe'),
    id_joueur VARCHAR,
    id_equipe VARCHAR,
    numero_joueur int,
    date_contrat date,
    date_fin date,
    PRIMARY KEY(id_contrat),
    FOREIGN KEY (id_joueur) REFERENCES joueur(id_joueur),
    FOREIGN KEY (id_equipe) REFERENCES equipe(id_equipe)
);

create sequence seq_action increment by 1 minvalue 1 START 1;
CREATE TABLE action(
   id_action VARCHAR default 'A'||nextval('seq_action'),
   action VARCHAR(50) ,
   PRIMARY KEY(id_action)
);


create sequence seq_match increment by 1 minvalue 1 START 1;
CREATE TABLE matchs(
   id_match VARCHAR default 'M'||nextval('seq_match'),
   date_match date NOT NULL,
   temps time not null,
   PRIMARY KEY(id_match)
);


CREATE TABLE matchs_fille(
   id_match VARCHAR NOT NULL,
   id_equipe VARCHAR NOT NULL,
   FOREIGN KEY(id_equipe) REFERENCES equipe(id_equipe),
   FOREIGN KEY(id_match) REFERENCES matchs(id_match)
);


CREATE TABLE joueur_participant_match(
   id_match VARCHAR NOT NULL,
   id_joueur VARCHAR NOT NULL,
   PRIMARY KEY(id_match, id_joueur),
   FOREIGN KEY(id_match) REFERENCES matchs(id_match),
   FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur)
);


create sequence seq_a_m_j increment by 1 minvalue 1 START 1;
CREATE TABLE action_match_joueur(
   id_a_m_j VARCHAR  default 'AMJ'||nextval('seq_a_m_j'),
   point DOUBLE PRECISION,
   temps TIME,
   id_action VARCHAR NOT NULL,
   id_match VARCHAR NOT NULL,
   id_joueur VARCHAR NOT NULL,
   PRIMARY KEY(id_a_m_j),
   FOREIGN KEY(id_action) REFERENCES action(id_action),
   FOREIGN KEY(id_match) REFERENCES matchs(id_match),
   FOREIGN KEY(id_joueur) REFERENCES Joueur(id_joueur)
);

CREATE TABLE joueur_equipe(
   id_joueur VARCHAR,
   date_entre DATE,
   id_equipe VARCHAR,
   FOREIGN KEY(id_joueur) REFERENCES Joueur(id_joueur),
   FOREIGN KEY(id_equipe) REFERENCES equipe(id_equipe)
);
