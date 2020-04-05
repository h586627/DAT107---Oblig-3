DROP SCHEMA IF EXISTS oving8jpa CASCADE;

CREATE SCHEMA oving8jpa;
SET search_path TO oving8jpa;

CREATE Table ansatt
(
	brukernavn VARCHAR(4) NOT NULL,
	fornavn VARCHAR (30) NOT NULL,
	etternavn VARCHAR (30) NOT NULL, 
	ansettelsesdato date NOT NULL,
	stilling VARCHAR NOT NULL,
	lonn DECIMAL NOT NULL,
	CONSTRAINT brukernavn_pk PRIMARY KEY (brukernavn)
	
);

