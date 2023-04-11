-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: hattdb
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
--  Create database
--
CREATE DATABASE hattdb CHARACTER SET utf8mb4 COLLATE utf8mb4_sv_0900_ai_ci;
USE hattdb;
/*This code is to create the database to enable the creation of a user for connecting to the database and the creation of the tables and example data*/
--
-- Create user for connecting to the database
--
CREATE USER hattdba@localhost IDENTIFIED BY 'hattkey';
GRANT ALL PRIVILEGES ON hattdb.* TO hattdba@localhost;
/*This code is to enable a connection to the database hattdb*/

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS `Employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Employee` (
  `EmployeeID` varchar(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Mail` varchar(30) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Employee`
--

LOCK TABLES `Employee` WRITE;
/*!40000 ALTER TABLE `Employee` DISABLE KEYS */;
INSERT INTO `Employee` VALUES ('E1','Otto','otto@hatt.com','ottoHatt');
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Customer` (
  `CustomerID` varchar(11) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Phone` varchar(30) DEFAULT NULL,
  `Address` varchar(20) NOT NULL,
  `Mail` varchar(20) NOT NULL,
  `Head_measurement` int(6) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES ('C1','Ulla Berg','070-1111','skostigen 2','ulla@gmail.com',50);
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Article`
--

DROP TABLE IF EXISTS `Article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Article` (
  `ArticleID` varchar(10) NOT NULL,
  `Article_Name` varchar(40) DEFAULT NULL,
  `Price` int(10) NOT NULL,
  `Material_Spec` varchar(400) NOT NULL,
  PRIMARY KEY (`ArticleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Article`
--

LOCK TABLES `Article` WRITE;
/*!40000 ALTER TABLE `Article` DISABLE KEYS */;
INSERT INTO `Article` VALUES ('A1', 'Blå cowboyhatt', 500, '2 två meter blått tyg, blått snöre, läder');
/*!40000 ALTER TABLE `Article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order`
--

DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Order` (
  `OrderID` varchar(11) NOT NULL,
  `Datum` varchar(10) DEFAULT NULL,
  `EmployeeID` varchar(10) NOT NULL,
  `CustomerID` varchar(11) NOT NULL,
  PRIMARY KEY (`OrderID`),
  CONSTRAINT `Order_EmployeeID_fk` FOREIGN KEY (`EmployeeID`) REFERENCES `Employee` (`EmployeeID`),
  CONSTRAINT `Order_CustomerID_fk` FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
INSERT INTO `Order` VALUES ('O1', '2023-08-22', 'E1', 'C1');
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Production`
--

DROP TABLE IF EXISTS `Production`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Production` (
  `ProductionID` varchar(20) NOT NULL,
  `Status` varchar(100) DEFAULT NULL,
  `ArticleID` varchar(6) NOT NULL,
  `EmployeeID` varchar(10) NOT NULL,
  `OrderID` varchar(11) NOT NULL,
  PRIMARY KEY (`ProductionID`),
  CONSTRAINT `Production_ArticleID_fk` FOREIGN KEY (`ArticleID`) REFERENCES `Article` (`ArticleID`),
  CONSTRAINT `Production_EmployeeID_fk` FOREIGN KEY (`EmployeeID`) REFERENCES `Employee` (`EmployeeID`),
  CONSTRAINT `Production_OrderID_fk` FOREIGN KEY (`OrderID`) REFERENCES `Order` (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Production`
--

LOCK TABLES `Production` WRITE;
/*!40000 ALTER TABLE `Production` DISABLE KEYS */;
INSERT INTO `Production` VALUES ('P1', 'Lagd','A1', 'E1','O1');
/*!40000 ALTER TABLE `Production` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order_Contains_Of_Article`
--

DROP TABLE IF EXISTS `Order_Contains_Of_Article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Order_Contains_Of_Article` (
  `OrderID` varchar(11) NOT NULL,
  `ArticleID` varchar(10) NOT NULL,
  PRIMARY KEY (`OrderID`,`ArticleID`),
  CONSTRAINT `Order_Contains_Of_Article_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `Order` (`OrderID`),
  CONSTRAINT `Order_Contains_Of_Article_ibfk_2` FOREIGN KEY (`ArticleID`) REFERENCES `Article` (`ArticleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order_Contains_Of_Article`
--

LOCK TABLES `Order_Contains_Of_Article` WRITE;
/*!40000 ALTER TABLE `Order_Contains_Of_Article` DISABLE KEYS */;
INSERT INTO `Order_Contains_Of_Article` VALUES ('O1','A1');
/*!40000 ALTER TABLE `Order_Contains_Of_Article` ENABLE KEYS */;
UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-09 21:48:13
