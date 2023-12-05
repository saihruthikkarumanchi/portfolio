-- MariaDB dump 10.19  Distrib 10.11.2-MariaDB, for osx10.18 (arm64)
--
-- Host: localhost    Database: campus_survey
-- ------------------------------------------------------
-- Server version	10.11.2-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `survey`
--

DROP TABLE IF EXISTS `survey`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `survey` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `street_address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `zip` varchar(255) NOT NULL,
  `telephone_number` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date_of_survey` timestamp NOT NULL,
  `liked_most_about_campus` varchar(255) NOT NULL,
  `how_became_interested` varchar(255) NOT NULL,
  `likelihood_of_recommending` varchar(255) NOT NULL,
  `additional_comments` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `survey`
--

LOCK TABLES `survey` WRITE;
/*!40000 ALTER TABLE `survey` DISABLE KEYS */;
INSERT INTO `survey` VALUES
(12,'Adam','Johnson','2222 Elm St','Los Angeles','CA','90001','555-6789','adam.johnson@example.com','2022-05-04 13:45:00','Campus, Sports','Other','Very Likely','The professors were amazing and the facilities were top-notch'),
(11,'Rahul','Sharma','1111 Main St','Bangalore','KA','560001','555-3456','rahul.sharma@example.com','2022-05-02 09:30:00','Location, Atmosphere, Sports','Internet','Very Likely','Had a fantastic visit and can\'t wait to apply'),
(10,'Emily','Jones','789 Oak St','New York','NY','10001','555-9012','emily.jones@example.com','2022-05-03 11:15:00','Location, Campus, Dorm Rooms','Television','Likely','Had a great tour and learned a lot about the programs offered'),
(9,'Anjali','Kumar','456 Park Ave','Mumbai','MH','400001','555-5678','anjali.kumar@example.com','2022-05-01 14:00:00','Atmosphere, Sports','Friends','Very Likely','Loved the facilities and friendly staff'),
(13,'Aakash','Singh','4444 Park Ave','Delhi','DL','110001','555-7890','aakash.singh@example.com','2022-05-06 10:30:00','Students, Dorm Rooms','Television','Very Likely','The campus was beautiful and the staff were very welcoming'),
(14,'Ajay','Reddy','MLA Colony','Hyderabad','Telangana','500000','9999999999','ajay@gmail.com','2023-04-18 00:00:00','campus,location,students,atmosphere','internet','veryLikely',NULL);
/*!40000 ALTER TABLE `survey` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-26 11:41:13
