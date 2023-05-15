CREATE DATABASE `vendas`;

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `preco` decimal(16,2) NOT NULL,
  `sku` varchar(20) NOT NULL,
  `data_cadastro` date NOT NULL,
  PRIMARY KEY (`id`)
) ;
