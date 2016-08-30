-- MySQL Script generated by MySQL Workbench
-- 08/30/16 11:02:33
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema stocklibrary
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema stocklibrary
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `stocklibrary` DEFAULT CHARACTER SET utf8 ;
USE `stocklibrary` ;

-- -----------------------------------------------------
-- Table `stocklibrary`.`material`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stocklibrary`.`material` (
  `idMaterial` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `texto` VARCHAR(8000) NOT NULL,
  `dt_postagem` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`idMaterial`))
ENGINE = InnoDB
AUTO_INCREMENT = 101
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `stocklibrary`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stocklibrary`.`usuario` (
  `idUsuario` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `tipo` CHAR(1) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
