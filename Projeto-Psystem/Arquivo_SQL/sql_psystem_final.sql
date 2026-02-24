
CREATE TABLE `aluno` (
  `id_aluno` int NOT NULL AUTO_INCREMENT,
  `nome_aluno` varchar(100) NOT NULL,
  `cpf_aluno` varchar(11) NOT NULL,
  `idade` int NOT NULL,
  `altura` int NOT NULL,
  `peso` float NOT NULL,
  `imc` decimal(5,2) NOT NULL,
  `id_professor` int NOT NULL,
  PRIMARY KEY (`id_aluno`),
  UNIQUE KEY `cpf_aluno_UNIQUE` (`cpf_aluno`),
  KEY `id_professor` (`id_professor`),
  CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`id_professor`) REFERENCES `professor` (`id_professor`)
);

CREATE TABLE `professor` (
  `id_professor` int NOT NULL AUTO_INCREMENT,
  `nome_professor` varchar(100) NOT NULL,
  `cpf_professor` varchar(11) NOT NULL,
  PRIMARY KEY (`id_professor`),
  UNIQUE KEY `cpf_professor` (`cpf_professor`)
);

CREATE TABLE `dieta` (
  `id_dieta` int NOT NULL AUTO_INCREMENT,
  `tipo_dieta` text NOT NULL,
  `comida` text NOT NULL,
  `id_aluno` int NOT NULL,
  PRIMARY KEY (`id_dieta`),
  KEY `id_aluno` (`id_aluno`),
  CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`id_aluno`) REFERENCES `aluno` (`id_aluno`)
);

CREATE TABLE `treino` (
  `id_treino` int NOT NULL AUTO_INCREMENT,
  `grupo_muscular` varchar(100) DEFAULT NULL,
  `exercicios` text,
  `id_aluno` int NOT NULL,
  PRIMARY KEY (`id_treino`),
  KEY `id_aluno` (`id_aluno`),
  CONSTRAINT `treino_ibfk_1` FOREIGN KEY (`id_aluno`) REFERENCES `aluno` (`id_aluno`)
);




