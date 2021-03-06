CREATE DATABASE  IF NOT EXISTS `kyivcityguide` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `kyivcityguide`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: kyivcityguide
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `routes`
--

DROP TABLE IF EXISTS `routes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `routes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` longtext NOT NULL,
  `image` longtext NOT NULL,
  `maproute` longtext NOT NULL,
  `likevar` int(11) NOT NULL,
  `dislike` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routes`
--

LOCK TABLES `routes` WRITE;
/*!40000 ALTER TABLE `routes` DISABLE KEYS */;
INSERT INTO `routes` VALUES (1,'Перлини печерська','Печерськ це архітектурний центр Києва! Свою назву він отримав від Києво-Печерської Лаври, де селилися ченці. У Х столітті тут знаходилася заміська резиденція Володимира Великого, тут були вбиті Аскольд і Дір, на Печерську завжди проходила боротьба за владу, і зараз це – найелітніший і найдорожчий район Києва. Під час нашої екскурсії ви не тільки почуєте історію та легенди цього аристократичного району, а й побачите справжні архітектурні шедеври.','http://sofia-tour.com/wp-content/uploads/2018/02/6-2.jpg','https://www.google.com.ua/maps/dir/Будинок+\"Плачущої+Вдови\",+вулиця+Лютеранська,+23,+Київ,+02000/Дом+с+химерами,+вулиця+Банкова,+10,+Київ,+02000/Шоколадный+домик,+вулиця+Шовковична,+17%2F2,+Київ,+01043/Особняк+Ковалевского,+вулиця+Шовковична,+1%2F15,+Київ,+02000/Національний+банк+України,+вулиця+Інститутська,+9,+Київ,+01601/Мариинский+дворец,+5A,+вулиця+Михайла+Грушевського,+Київ,+01008/@50.4458972,30.5284535,16z/data=!3m1!4b1!4m38!4m37!1m5!1m1!1s0x40d4ce54e0751389:0xb498c1b5a468543e!2m2!1d30.5279632!2d50.4436842!1m5!1m1!1s0x40d4ce549257acfb:0x8d2070a5d66c0e0b!2m2!1d30.5285887!2d50.445077!1m5!1m1!1s0x40d4cfab269a95af:0x6495192af818a86!2m2!1d30.5314431!2d50.4433105!1m5!1m1!1s0x40d4cfab39617347:0x33f58dc9b94c4add!2m2!1d30.5319174!2d50.443509!1m5!1m1!1s0x40d4ce53171987c9:0xaae7c272282cf549!2m2!1d30.5318132!2d50.4471535!1m5!1m1!1s0x40d4cfad45d00d9d:0xed19f61774e5a260!2m2!1d30.5376238!2d50.4483985!3e2?hl=ru',25,4),(2,'Що пидивитися в Києві за один день','Якщо ви до цього ніколи не були в столиці України, це ідеальний маршрут, пройшовши яким, ви побачите її найзнаменитіші місця: Володимирьский собор, Золоті Ворота, Хрещатик, Майдан Незалежності, Софіївську площу, Андріївський узвіз.. Якщо у кцінці прогулянки ви ще повні сил, радимо відвідати Києво-Печерську Лавру.','https://ua.igotoworld.com/frontend/webcontent/images/tours/2682089_800x600_maydan_6.jpg','https://www.google.com.ua/maps/dir/Владимирский+кафедральный+собор/Золоті+ворота/Монумент+Независимости+Украины/Собор+Софія+Київська/Софиевская+площадь/Памятник+Богдану+Хмельницкому/Андреевская+церковь,+Андріївський+узвіз,+23,+Київ,+04070/Андреевский+спуск,+Киев,+02000/@50.4522021,30.5083872,15z/data=!3m1!4b1!4m50!4m49!1m5!1m1!1s0x40d4cef7c7731ddd:0x37cc95586b807512!2m2!1d30.5087329!2d50.4449191!1m5!1m1!1s0x40d4ce59e3ab65a7:0x694b8565cab02eaf!2m2!1d30.5133317!2d50.4488319!1m5!1m1!1s0x40d4ce517316971f:0xa833208d07c2843e!2m2!1d30.5253759!2d50.4495484!1m5!1m1!1s0x40d4ce88e35e395f:0xc63774cf5da5a434!2m2!1d30.5143065!2d50.4529095!1m5!1m1!1s0x40d4ce5b1017eef5:0x994f1b04c8e8193e!2m2!1d30.5161753!2d50.4535724!1m5!1m1!1s0x40d4ce5b1a081cf3:0x6818082858453b9c!2m2!1d30.5165271!2d50.453593!1m5!1m1!1s0x40d4ce43925b6597:0xa40ae8f859121eaa!2m2!1d30.5179307!2d50.4590318!1m5!1m1!1s0x40d4ce43ccf910f1:0x86e14f4b5b274396!2m2!1d30.5161398!2d50.4598069!3e2?hl=ru',13,1),(3,'Путівник Києво-Печерською лаврою','Незалежно від того, чи є ви віруючою людиною, відвідати Києво-Печерську Лавру варто обов’язково. Причому не тільки прогулятися між її дивововижно гарних, немов повітряних храмів, але і обов’язково спуститися в печери, де зберігаються нетлінні мощі святих. Враження від подібної екскурсії порівняти абсолютно ні з чим – в печерах панує непередавана атмосфера.','http://ki.ill.in.ua/m/670x450/24387134.jpg','https://www.google.com.ua/maps/dir/Успенский+Собор,+вулиця+Лаврська,+15,+Київ,+01015/Троицкая+надвратная+церковь,+вулиця+Лаврська,+Київ,+01015/Церковь+всех+Святых,+Київ,+01015/Национальный+Киево-Печерский+историко-культурный+заповедник,+вулиця+Лаврська,+9,+Київ,+01015/Большая+лаврская+колокольня,+вулиця+Лаврська,+13+к.81,+Київ,+02000/Киево-Печерская+лавра,+вулиця+Лаврська,+15,+Київ,+01015/@50.434144,30.5553681,16.75z/data=!4m38!4m37!1m5!1m1!1s0x40d4cfa1cad139ef:0xde56a1790562124f!2m2!1d30.5573897!2d50.4351578!1m5!1m1!1s0x40d4cfa05b9f54ab:0xc1208a64b3a7ccbf!2m2!1d30.555076!2d50.4347376!1m5!1m1!1s0x40d4cfa1a8c8f043:0x2c858429b46dd9ec!2m2!1d30.5560621!2d50.436368!1m5!1m1!1s0x40d4cfa1ced591d1:0x3cd1df3d25b4bcc8!2m2!1d30.556346!2d50.434994!1m5!1m1!1s0x40d4cfa04811dc89:0x419897065fbbe0ad!2m2!1d30.5562391!2d50.4347847!1m5!1m1!1s0x40d4cfa04a0c8e5b:0x3b40a2bcbca08807!2m2!1d30.5572558!2d50.4346375!3e2?hl=ru',9,3),(4,'Київ: слідами революції','Будівлі Верховної Ради, Кабінету Міністрів України, Адміністрації Президента, вулиць Грушевського та Інститутській кілька місяців не сходили з екранів світових ЗМІ. Тому особливо цікаво пройтися місцями, де вершилася історія країни. Барикади палаючі покришки, численні агітаційні матеріали.. Що залишилося від усього цього? Прогуляйтеся і дізнаєтеся!','https://ichef.bbci.co.uk/news/976/cpsprodpb/174FF/production/_103378459_63e43384-e9b5-43a8-a824-1922749fc008.jpg','https://www.google.com.ua/maps/dir/Klub+Kabinetu+Ministriv+Ukrayiny,+вулиця+Інститутська,+7,+Київ,+02000/Верховная+Рада+Украины,+вулиця+Михайла+Грушевського,+5,+Київ,+01008/Національний+банк+України,+вулиця+Інститутська,+9,+Київ,+01601/Администрация+Президента+Украины,+вулиця+Банкова,+11,+Київ,+02000/ул.+Крещатик,+Киев,+02000/Майдан+Независимости,+Киев,+02000/@50.4471656,30.5249007,16z/data=!3m1!4b1!4m38!4m37!1m5!1m1!1s0x40d4ce53a6374a6b:0xb30813d08db84305!2m2!1d30.5301689!2d50.4478515!1m5!1m1!1s0x40d4cfad233ecb25:0xbe4a6a87072f3a75!2m2!1d30.536877!2d50.447334!1m5!1m1!1s0x40d4ce53171987c9:0xaae7c272282cf549!2m2!1d30.5318132!2d50.4471535!1m5!1m1!1s0x40d4ce54c1e48105:0x74d1d95832eb2407!2m2!1d30.5289231!2d50.4444179!1m5!1m1!1s0x40d4ce56b2456d3b:0xd062ae171b57e947!2m2!1d30.5220257!2d50.4475854!1m5!1m1!1s0x40d4ce50f8b6e3c3:0xb528dc4d6dadc4f8!2m2!1d30.5229899!2d50.4505318!3e2?hl=ru',17,4),(5,'Кращі музеї Києва','В цьому маршруті ми зібрали для вас найцікавіші музеї Києва: музей Гетьманства, Національний музей «Чорнобиль», будинок Петра І, музей однієї вулиці, музей Булгакова, відразу два музеї Тараса Шевченка, Національний музей мистецтв імені Богдана та Вравари Ханенків – найвизначніша збірка предметів зарубіжного мистецтва в Україні…','https://ever.travel/uploads/post/cover/1150/big_landscape_Muzey_mistetstv_imeni_Bogdana_ta_Varvari_Hanenkiv_Kiyiv.jpg','https://www.google.com.ua/maps/dir/Национальный+музей+Чернобыль/Музей+Гетьманства/Домик+Петра+I/Музей+однієї+вулиці/Музей+Михаила+Булгакова/Национальный+музей+истории+Украины/Литературно-мемориальный+дом-музей+Тараса+Шевченко/Национальный+музей+Тараса+Шевченко/Музей+Ханенко,+вулиця+Терещенківська,+15,+Київ,+01004/@50.4543787,30.5005324,14z/data=!3m1!4b1!4m56!4m55!1m5!1m1!1s0x40d4ce6aad7ae271:0x27ce7e3429075a!2m2!1d30.5174498!2d50.4663494!1m5!1m1!1s0x40d4ce3fe82266b9:0x904adac0e3b22edf!2m2!1d30.5205572!2d50.4670614!1m5!1m1!1s0x40d4ce6aecf956cd:0xa26d9bfbce2d41c!2m2!1d30.5146508!2d50.4654761!1m5!1m1!1s0x40d4ce4199297647:0xa5c9079830e80530!2m2!1d30.5174651!2d50.4621465!1m5!1m1!1s0x40d4ce423b1c602b:0xb1f8142f4707c542!2m2!1d30.5146214!2d50.4607047!1m5!1m1!1s0x40d4cef817b05e8f:0xcd79d6b215ccfdcf!2m2!1d30.5161835!2d50.4583218!1m5!1m1!1s0x40d4ce50840c90fd:0xf3c4f84779307546!2m2!1d30.5203307!2d50.451088!1m5!1m1!1s0x40d4ce5102781b5b:0x4250f606a3c03c9a!2m2!1d30.5154402!2d50.4434547!1m5!1m1!1s0x40d4cef91a3c0861:0xf19741345ee1d474!2m2!1d30.5145914!2d50.4411509!3e2?hl=ru',8,1),(6,'Прогулянка уздовж Дніпра','Запрошуємо вас прогулятися вздовж берега Дніпра від Поштової площі до знаменитого монумента «Батьківщина-мати». Крім прекрасних видів, на шляху нам зустрінеться ще й чимало пам’яток: Володимирська гірка, Аскольдова могила, Парк Вічної Слави, Києво-Печерська Лавра, Музей Івана Гончара…','https://ever.travel/uploads/post/cover/1151/big_landscape_1.jpg','https://www.google.com.ua/maps/dir/Памятник+Владимиру+Великому/Церковь+Рождества+Христова/Володимирська+Гірка/Арка+Дружбы+народов/Аскольдова+могила/Церковь+Спаса+на+Берестове/Национальный+музей+\"Мемориал+жертв+голодомора\"/Парк+Вечной+Славы/Киево-Печерская+лавра/Музей+истории+Украины+во+Второй+мировой+войне,+вулиця+Лаврська,+24,+Київ,+01015/@50.4434251,30.5273324,14z/data=!3m1!4b1!4m62!4m61!1m5!1m1!1s0x40d4ce4f6f9f69f9:0x220fd187954af85!2m2!1d30.527069!2d50.4561392!1m5!1m1!1s0x40d4ce467b082e7f:0x70040b2b3bb91de4!2m2!1d30.525284!2d50.459083!1m5!1m1!1s0x40d4ce458f2e3e89:0x60cb77771a7f9c19!2m2!1d30.5255203!2d50.4565251!1m5!1m1!1s0x40d4ce4ef9be01b7:0xcd7dcf2eba57eba2!2m2!1d30.5299656!2d50.4544624!1m5!1m1!1s0x40d4cfa55e701b81:0x87faded7b880ab6!2m2!1d30.5514571!2d50.444245!1m5!1m1!1s0x40d4cf9f9c04c76d:0x3aab5c8a82ba3129!2m2!1d30.5548926!2d50.4373535!1m5!1m1!1s0x40d4cfa14d864295:0x65795d704fb58089!2m2!1d30.5539846!2d50.4382357!1m5!1m1!1s0x40d4cfa68240ef9d:0x2655f503e23269d2!2m2!1d30.551096!2d50.439619!1m5!1m1!1s0x40d4cfa04a0c8e5b:0x3b40a2bcbca08807!2m2!1d30.5572558!2d50.4346375!1m5!1m1!1s0x40d4cf76fb53f3d7:0xee2de90672f6d60e!2m2!1d30.5647041!2d50.427904!3e2?hl=ru',14,2);
/*!40000 ALTER TABLE `routes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-23  0:50:10
