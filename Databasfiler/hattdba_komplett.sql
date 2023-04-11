-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: mibdb
-- ------------------------------------------------------
-- Server version	8.0.15


 SET NAMES utf8mb4 ;


--
--  Create database
--
CREATE DATABASE hattdba CHARACTER SET utf8mb4 COLLATE utf8mb4_sv_0900_ai_ci;
USE hattdba;
/*This code is to create the database to enable the creation of a user for connecting to the database and the creation of the tables and example data*/
--
-- Create user for connecting to the database
--
CREATE USER hattdba@localhost IDENTIFIED BY 'hattkey';
GRANT ALL PRIVILEGES ON hattdba.* TO hattdba@localhost;
/*This code is to enable a connection to the database hattdba*/

--
-- Table structure for table `Employee`
--

DROP TABLE IF EXISTS `Employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Employee` (
  `EmployeeID` varchar(50) NOT NULL,
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
INSERT INTO `Employee` VALUES (1,'Otto','otto@hatt.com','ottoHatt');
/*!40000 ALTER TABLE `Employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Kund`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Customer` (
  `CustomerID` Varchar(11) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Phone` varchar(30) DEFAULT NULL,
  `Address` varchar(20) NOT NULL,
  `Mail` varchar(20) NOT NULL,
  `Head_measurement` int(6) NOT NULL,
  PRIMARY KEY (`CustomerID`))
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES ('C1','Ulla','070-1111','skostigen 2','ulla@gmail.com',50);
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;




DROP TABLE IF EXISTS `Article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Article` (
  `ArticleID` varchar(6) NOT NULL,
  `Article_Name` varchar(40) NOT NULL,
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
-- Table structure for table `Order_Contains_Of_Article`
--




DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Order` (
  `OrderID` varchar(11) NOT NULL,
  `Datum` varchar(8) DEFAULT NULL,
  `EmployeeID`varchar (10) NOT NULL,
 `CustomerID` varchar (20) NOT NULL,
 `ProductionID` VARCHAR(20) NOT NULL,
 `ArticleID` VARCHAR (20) NOT NULL,
  PRIMARY KEY (`OrderID`),
  FOREIGN KEY (`EmployeeID`) REFERENCES `Employee` (`EmployeeID`),
  FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`CustomerID`),
  FOREIGN KEY (`ProductionID`) REFERENCES `Production` (`ProductionID`),
  FOREIGN KEY (`ArticleID`) REFERENCES `Article` (`ArticleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
INSERT INTO `Order` VALUES ('O1', '23-08-22', 'E1', 'C1', 'P1', 'A1');
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
INSERT INTO `Order` VALUES ('O2','23-08-21', 'E2', 'C2', 'P2', 'A2');
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `Production`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Production` (
  `ProductionID` varchar(20) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `ArticleID` varchar(20) not null ,
  `EmployeeID` varchar(20) not null,
  PRIMARY KEY (`ProductionID`),
  FOREIGN KEY (`ArticleID`) REFERENCES `Article`(`ArticleID`),
  FOREIGN KEY (`EmployeeID`) REFERENCES `Employee` (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Production`
--

LOCK TABLES `Production` WRITE;
/*!40000 ALTER TABLE `Production` DISABLE KEYS */;
INSERT INTO `Production` VALUES ('P1', 'Lagd', 'A1', 'E1');
/*!40000 ALTER TABLE `Production` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `Order_Contains_Of_Article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Order_Contains_Of_Article` (
  `OrderID` varchar(10) NOT NULL,
  `ArticleID` varchar(6) NOT NULL,
  PRIMARY KEY (`OrderID`,`ArticleID`),
  /*KEY `ArticleID` (`ArticleID`),*/
  FOREIGN KEY (`OrderID`) REFERENCES `Order` (`OrderID`),
  FOREIGN KEY (`ArticleID`) REFERENCES `Article` (`ArticleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order_Contains_Of_Article`
--

LOCK TABLES `Order_Contains_Of_Article` WRITE;
/*!40000 ALTER TABLE `Order_Contains_Of_Article` DISABLE KEYS */;
INSERT INTO `Order_Contains_Of_Article` VALUES ('O1', 'A1');
/*!40000 ALTER TABLE `Order_Contains_Of_Article` ENABLE KEYS */;
UNLOCK TABLES;




