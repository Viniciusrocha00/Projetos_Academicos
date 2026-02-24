CREATE DATABASE IF NOT EXISTS sql_psystem1;

USE sql_psystem1;

CREATE TABLE `aluno` (
  `id_aluno` INT NOT NULL AUTO_INCREMENT,
  `nome_aluno` VARCHAR(100) NOT NULL,
  `cpf_aluno` VARCHAR(11) NOT NULL,
  `idade` INT NOT NULL,
  `altura` INT NOT NULL,
  `peso` FLOAT NOT NULL,
  `imc` DECIMAL(5, 2) NOT NULL,
  `id_professor` INT NOT NULL,  -- Chave estrangeira
  PRIMARY KEY (`id_aluno`),
  UNIQUE INDEX `cpf_aluno_UNIQUE` (`cpf_aluno` ASC),
  FOREIGN KEY (`id_professor`) REFERENCES `professor`(`id_professor`)
);

ALTER TABLE `sql_psystem1`.`aluno` 
CHANGE COLUMN `id` `aluno_id` INT NOT NULL AUTO_INCREMENT;

CREATE TABLE `professor` (
  `id_professor` INT NOT NULL AUTO_INCREMENT,
  `nome_professor` VARCHAR(100) NOT NULL,
  `cpf_professor` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`id_professor`),
  UNIQUE INDEX `cpf_professor_UNIQUE` (`cpf_professor` ASC)
);

CREATE TABLE `dieta` (
  `id_dieta` INT NOT NULL AUTO_INCREMENT,
  `tipo_dieta` TEXT NOT NULL,
  `comida` TEXT NOT NULL,
  `id_aluno` INT NOT NULL,
  PRIMARY KEY (`id_dieta`),
  FOREIGN KEY (`id_aluno`) REFERENCES `aluno`(`id_aluno`)
);

CREATE TABLE `treino` (
  `id_treino` INT NOT NULL AUTO_INCREMENT,
  `grupo_muscular` VARCHAR(100),
  `exercicios` TEXT,
  `id_aluno` INT NOT NULL,
  PRIMARY KEY (`id_treino`),
  FOREIGN KEY (`id_aluno`) REFERENCES `aluno`(`id_aluno`)
);
