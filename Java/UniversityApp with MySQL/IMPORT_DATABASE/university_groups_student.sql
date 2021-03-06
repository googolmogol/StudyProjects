CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `university`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: university
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `groups_student`
--

DROP TABLE IF EXISTS `groups_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groups_student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `secname` varchar(45) NOT NULL,
  `groupname` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_student`
--

LOCK TABLES `groups_student` WRITE;
/*!40000 ALTER TABLE `groups_student` DISABLE KEYS */;
INSERT INTO `groups_student` VALUES (1,'Віталька','Кличко','Павлович','ІПЗ-4.2.03'),(2,'Василь','Самійлюк','Васильович','РТТ-48'),(3,'Віталій','Кличко','Павлович','ОПГ-98'),(4,'Іван','Пєтухов','Сергійович','ІПЗ-4.2.03'),(5,'Андрій','Карасьок','Володимирович','РПЗ-42'),(7,'Андрій','Купріянов','Володимирович','ІПЗ-4.2.03'),(8,'Нестор','Васільченко','Петрович','РПЗ-42'),(9,'Василь','Пюрешкін','Іванович','ОПГ-98'),(10,'Василь','Дьомін','Семенович','РТТ-48'),(11,'Іван','Миколайович','Жолудєв','ОПГ-98'),(12,'Артем','Лєбідєв','Сергійович','РТТ-48'),(13,'Андрій','Вікторович','Сорокін','ІПЗ-4.2.03'),(14,'Олексій','Миколайович','Ватніков','ОПГ-98'),(15,'Антуан','Хосе','Сергійович','РТТ-48'),(16,'Віталій','Вікторович','Довбень','ІПЗ-4.2.03'),(17,'Дмитроr','Петрович','Созонов','ОПГ-98'),(18,'Олександр','Іванишин','Сергійович','РТТ-48'),(19,'Микола','Вікторович','Шеце','ІПЗ-4.2.03'),(20,'Ілля','Сергійович','Портніков','ОПГ-98'),(21,'Василь','Галушкін','Петрович','РТТ-48'),(22,'Володимир','Ігорович','Верещанка','ІПЗ-4.2.03'),(23,'Станіслав','Володимирович','Сухарик','ОПГ-98'),(24,'Віктор','Помідор','Сергійович','РТТ-48'),(25,'Ярослав','Семенович','Дмитрук','ІПЗ-4.2.03'),(26,'Андрій','Миколайович','Іванишин','РПЗ-42'),(27,'Крістіан','Тимченко','Васильович','РТТ-48'),(28,'Владислав','Григорович','Запашний','РПЗ-42'),(29,'Остап','Вікторович','Вишня','ІПЗ-4.2.03'),(30,'Степан','Сергійович','Бендер','ОПГ-98'),(31,'Іван','Захаров','Володимирович','РТТ-48'),(32,'Ігор','Григорович','Захарченко','РПЗ-42'),(33,'Андрій','Семенович','Дмитрук','ІПЗ-4.2.03'),(34,'Ярослав','Миколайович','Іванишин','ОПГ-98'),(35,'Віктор','Тимофієв','Іванович','РТТ-48'),(36,'Григорій','Григорович','Запашний','РПЗ-42'),(38,'Володимир','Миколайович','Іванишин','ОПГ-98'),(39,'Тимур','Бардак','Васильович','РТТ-48'),(40,'Володимир','Григорович','Запашний','РПЗ-42'),(41,'Ярослав','Вікторович','Дмитрук','ІПЗ-4.2.03'),(42,'Андрій','Володимирович','Іванишин','ОПГ-98'),(43,'Крістіан','Тимощук','Васильович','РТТ-48'),(44,'Владислав','Григорович','Зеленський','РПЗ-42'),(45,'Ярослав','Семенович','Чечуро','ІПЗ-4.2.03'),(46,'Андрій','Миколайович','Іванишин','ОПГ-98'),(47,'Крістіан','Петров','Віталійович','РТТ-48'),(48,'Владислав','Григорович','Ургант','ІПЗ-4.2.03'),(49,'Ярослав','Семенович','Залізний','РПЗ-42'),(50,'Андрій','Миколайович','Янукович','ОПГ-98'),(51,'Крістіан','Жадзь','Іванович','РТТ-48'),(52,'Владислав','Григорович','Кеннеді','ІПЗ-4.2.03'),(53,'Юлій','Семенович','Дмитрук','РПЗ-42'),(54,'Петро','Миколайович','Іванишин','ОПГ-98'),(55,'Нестор','Літописець','Васильович','РТТ-48'),(56,'Назар','Григорович','Запашний','ІПЗ-4.2.03'),(57,'Ярослав','Семенович','Дурнєв','РПЗ-42'),(58,'Андрій','Миколайович','Сабуров','ОПГ-98'),(59,'Крістіан','Васильович','Льовочкін','РТТ-48'),(60,'Владислав','Григорович','Кучма','ІПЗ-4.2.03'),(61,'Ярослав','Семенович','Кравчук','РПЗ-42'),(63,'Іван','Петрович','Бандерас','РТТ-48'),(64,'Владислав','Григорович','Отлічний','РПЗ-42'),(65,'Ярослав','Семенович','Кращий','ІПЗ-4.2.03'),(66,'Андрій','Миколайович','Пахучий','ОПГ-98'),(68,'Владислав','Григорович','Вічний','ІПЗ-4.2.03'),(71,'в','в','і','ІПЗ-4.2.03'),(72,'Ілля','Вандам','Петрович','РТТ-48');
/*!40000 ALTER TABLE `groups_student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-19 20:44:53
