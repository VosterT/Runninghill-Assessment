DROP SCHEMA IF EXISTS words CASCADE;

CREATE SCHEMA words;

CREATE TABLE IF NOT EXISTS words.sentences (
  id INT PRIMARY KEY,
  sentence VARCHAR
);

CREATE TABLE IF NOT EXISTS words.words (
  id INT PRIMARY KEY,
  sentence_id INT NOT NULL,
  word VARCHAR,
  CONSTRAINT fk_sentence_id FOREIGN KEY (sentence_id) REFERENCES words.sentences(id)
);
