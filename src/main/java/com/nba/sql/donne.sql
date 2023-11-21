insert into action(action) values
('RD'),
('PD'),
('TIR'),
('LF');

insert  into equipe (nom) values
('Equipe 1'),
('Equipe 2'),
('Equipe 3'),
('Equipe 4');

insert into joueur (nom, dtn) values
('E1 J1', '2000-10-10'),
('E1 J2', '2000-10-10'),
('E1 J3', '2000-10-10'),
('E2 J1', '2000-10-10'),
('E2 J2', '2000-10-10'),
('E2 J3', '2000-10-10'),
('E3 J1', '2000-10-10'),
('E3 J2', '2000-10-10'),
('E3 J3', '2000-10-10'),
('E4 J1', '2000-10-10'),
('E4 J2', '2000-10-10'),
('E4 J3', '2000-10-10');


insert into contrat (id_joueur, id_equipe, numero_joueur, date_contrat, date_fin) values
('J1', 'E1', 1, '2010-10-10', '2029-10-10'),
('J2', 'E1', 2, '2010-10-10', '2029-10-10'),
('J3', 'E1', 3, '2010-10-10', '2029-10-10'),
('J4', 'E2', 1, '2010-10-10', '2029-10-10'),
('J5', 'E2', 2, '2010-10-10', '2029-10-10'),
('J6', 'E2', 3, '2010-10-10', '2029-10-10'),
('J7', 'E3', 1, '2010-10-10', '2029-10-10'),
('J8', 'E3', 2, '2010-10-10', '2029-10-10'),
('J9', 'E3', 3, '2010-10-10', '2029-10-10'),
('J10', 'E4', 1, '2010-10-10', '2029-10-10'),
('J11', 'E4', 2, '2010-10-10', '2029-10-10'),
('J12', 'E4', 3, '2010-10-10', '2029-10-10');

insert into matchs (date_match, temps) values
(now()::date, '14:30:00');

insert  into matchs_fille(id_match, id_equipe) values
('M1','E1'),
('M1','E2');

insert into action_match_joueur(point, temps, id_action, id_match, id_joueur) values
(3, '14:31:00','A3','M1','J1'),
(0,'14:31:00', 'A1', 'M1','J1' );



