CREATE TABLE IF NOT EXISTS users(user_id serial PRIMARY KEY, username VARCHAR(255), exercises integer);

/**CREATE TABLE users(
	username varchar(100) UNIQUE NOT NULL,
	userId varchar(36) NOT NULL PRIMARY KEY,
	exercises integer NOT NULL
);
**/

/** INSERT INTO users(username, userId, exercises) 
VALUES
('Petra','9f2c560b-38bc-4a4a-9bdd-9562c6818523',0),
('Clara','50fa8095-0a2b-4236-8790-c6153eb125ab',0),
('Daniel','a3a9255b-b729-4c5d-8a76-6e88391f30f6',0)
**/