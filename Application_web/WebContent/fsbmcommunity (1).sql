-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 02 Juillet 2021 à 17:44
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `fsbmcommunity`
--

-- --------------------------------------------------------

--
-- Structure de la table `commentaire`
--

CREATE TABLE IF NOT EXISTS `commentaire` (
  `IdCommentaire` int(11) NOT NULL,
  `Id` int(11) NOT NULL,
  `IdPublication` int(11) DEFAULT NULL,
  `contenuComm` varchar(254) DEFAULT NULL,
  `Date_cmt` datetime DEFAULT NULL,
  PRIMARY KEY (`IdCommentaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `evenement`
--

CREATE TABLE IF NOT EXISTS `evenement` (
  `IdEvenement` int(11) NOT NULL AUTO_INCREMENT,
  `Id` int(11) NOT NULL,
  `IdGroupe` int(11) NOT NULL,
  `contenuEven` varchar(254) DEFAULT NULL,
  `Date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `Urlimg` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`IdEvenement`),
  KEY `AK_Identifiant_1` (`IdEvenement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `fichier`
--

CREATE TABLE IF NOT EXISTS `fichier` (
  `IdPublication` int(11) NOT NULL,
  `IdFicihier` int(11) NOT NULL,
  `URLPieceJointe` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`IdPublication`,`IdFicihier`),
  KEY `AK_Identifiant_1` (`IdFicihier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `hashtag`
--

CREATE TABLE IF NOT EXISTS `hashtag` (
  `IdHashtag` int(11) NOT NULL,
  `Id` int(11) NOT NULL,
  `nomHashtag` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`IdHashtag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `image`
--

CREATE TABLE IF NOT EXISTS `image` (
  `IdPublication` int(11) NOT NULL,
  `IdImage` int(11) NOT NULL,
  `URL` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`IdPublication`,`IdImage`),
  KEY `AK_Identifiant_1` (`IdImage`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

CREATE TABLE IF NOT EXISTS `message` (
  `idmsg` int(150) NOT NULL AUTO_INCREMENT,
  `idr` int(11) NOT NULL,
  `ide` int(250) NOT NULL,
  `text` varchar(200) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idmsg`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Contenu de la table `message`
--

INSERT INTO `message` (`idmsg`, `idr`, `ide`, `text`, `date`) VALUES
(1, 1, 4, 'salut', '2021-07-01 16:52:04'),
(2, 4, 1, 'salam', '2021-07-01 16:52:32'),
(3, 1, 4, 'cv', '2021-07-01 16:52:32'),
(4, 4, 1, 'saluut cv?', '2021-07-02 03:36:06'),
(5, 4, 1, 'saluut cv?', '2021-07-02 03:36:09'),
(6, 4, 1, 'saluut cv?', '2021-07-02 03:36:10'),
(7, 4, 1, 'saluut cv?', '2021-07-02 03:36:10'),
(8, 4, 1, 'saluut cv?', '2021-07-02 03:36:10'),
(9, 4, 1, 'saluut cv?', '2021-07-02 03:36:11'),
(10, 4, 1, 'saluut cv?', '2021-07-02 03:36:11'),
(11, 4, 1, 'saluut cv?', '2021-07-02 03:36:11'),
(12, 4, 1, 'saluut cv?', '2021-07-02 03:36:13'),
(13, 4, 1, 'saluut cv?', '2021-07-02 03:36:13'),
(14, 9, 1, 'saluut cv?', '2021-07-02 03:36:27'),
(15, 9, 1, 'saluut cv?', '2021-07-02 03:36:27'),
(16, 9, 1, 'saluut cv?', '2021-07-02 03:36:27'),
(17, 9, 1, 'saluut cv?', '2021-07-02 03:36:28'),
(18, 9, 1, 'saluut cv?', '2021-07-02 03:36:28'),
(19, 12, 0, 'salut', '2021-07-02 14:47:06'),
(20, 12, 0, 'salut', '2021-07-02 14:47:07'),
(21, 12, 0, 'salut', '2021-07-02 14:47:08'),
(22, 12, 0, 'salut', '2021-07-02 14:47:08'),
(23, 12, 0, 'salut', '2021-07-02 14:47:09'),
(24, 4, 1, 'bonjour', '2021-07-02 14:48:05'),
(25, 4, 1, 'bonjour', '2021-07-02 14:48:07'),
(26, 4, 1, 'saluut cv?', '2021-07-02 15:14:18');

-- --------------------------------------------------------

--
-- Structure de la table `offre`
--

CREATE TABLE IF NOT EXISTS `offre` (
  `IdOffre` int(11) NOT NULL AUTO_INCREMENT,
  `Id` int(11) NOT NULL DEFAULT '0',
  `nom` varchar(254) DEFAULT NULL,
  `description` varchar(254) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Date` timestamp NULL DEFAULT NULL,
  `Contrainte` varchar(254) DEFAULT NULL,
  `type_de_contrat` varchar(200) DEFAULT NULL,
  `salaire` int(250) NOT NULL DEFAULT '0',
  `type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdOffre`),
  KEY `AK_Identifiant_1` (`IdOffre`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `offre`
--

INSERT INTO `offre` (`IdOffre`, `Id`, `nom`, `description`, `Date`, `Contrainte`, `type_de_contrat`, `salaire`, `type`) VALUES
(8, 2, ' la deuxieme offre emploi', 'sans', NULL, 'de 8h a 14h', '6mois', 4500, 'emploi'),
(9, 0, 'medcin generale', 'sans', NULL, 'de 8h a 20h', 'sans', 5000, 'emploi');

-- --------------------------------------------------------

--
-- Structure de la table `offreetudiant`
--

CREATE TABLE IF NOT EXISTS `offreetudiant` (
  `Id` int(11) NOT NULL,
  `IdEtudiant` int(11) NOT NULL,
  `IdOffre` int(11) NOT NULL,
  `IdOffEtud` int(11) NOT NULL,
  PRIMARY KEY (`Id`,`IdEtudiant`,`IdOffre`,`IdOffEtud`),
  KEY `AK_Identifiant_1` (`IdOffEtud`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `offre_d_emploi`
--

CREATE TABLE IF NOT EXISTS `offre_d_emploi` (
  `IdOffre` int(11) NOT NULL,
  `IdOffre_d_emploi` int(11) NOT NULL,
  `Type_de_contrat` varchar(254) DEFAULT NULL,
  `Salaire` decimal(8,0) DEFAULT NULL,
  PRIMARY KEY (`IdOffre`,`IdOffre_d_emploi`),
  KEY `AK_Identifiant_1` (`IdOffre_d_emploi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `profil`
--

CREATE TABLE IF NOT EXISTS `profil` (
  `IdProfil` int(11) NOT NULL,
  `Status` varchar(254) DEFAULT NULL,
  `UrlmgProfil` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`IdProfil`),
  KEY `AK_Identifiant_1` (`IdProfil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `publication`
--

CREATE TABLE IF NOT EXISTS `publication` (
  `IdPublication` int(11) NOT NULL AUTO_INCREMENT,
  `Id` int(11) DEFAULT NULL,
  `IdHashtag` int(11) DEFAULT NULL,
  `DatePu` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `caption` varchar(254) DEFAULT NULL,
  `urlimg` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`IdPublication`),
  KEY `AK_Identifiant_1` (`IdPublication`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Contenu de la table `publication`
--

INSERT INTO `publication` (`IdPublication`, `Id`, `IdHashtag`, `DatePu`, `caption`, `urlimg`) VALUES
(15, NULL, NULL, '2021-07-02 02:15:23', 'null', 'annonce1625192123136.PNG');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `IdProfil` int(11) NOT NULL DEFAULT '0',
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `login` varchar(254) DEFAULT NULL,
  `password` varchar(254) DEFAULT NULL,
  `date_naissance` varchar(100) NOT NULL DEFAULT '0',
  `adresse` varchar(254) DEFAULT NULL,
  `tele` int(100) NOT NULL DEFAULT '0',
  `tempdispo` varchar(200) DEFAULT NULL,
  `cne` varchar(20) DEFAULT NULL,
  `code_ap` int(100) NOT NULL DEFAULT '0',
  `cin` varchar(15) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `AK_Identifiant_1` (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`Id`, `IdProfil`, `nom`, `prenom`, `login`, `password`, `date_naissance`, `adresse`, `tele`, `tempdispo`, `cne`, `code_ap`, `cin`, `role`) VALUES
(1, 0, 'Dounia', 'atfi', 'dounia@gmail.com', '2012', '2000-07-06', 'tit Melil', 0, '', 'R139280218', 18508305, 'BB181090', 'etudiant'),
(2, 0, 'hp', '', 'hp@gmail.com', 'hp2020', '0000-00-00', 'france', 522369875, '9h a 16h30', '', 0, '', 'entreprise'),
(3, 0, 'sanaa', 'elfilali', 'sanaa@gmail.com', '147', '1980-01-01', 'fsbm', 0, '', '', 0, 'BM191097', 'admin'),
(4, 0, 'Amal', 'Sakhi', 'aa@gmail.com', '44', 'null', 'uythngbfvd', 0, NULL, 'null', 1, '147', 'etudiant'),
(9, 0, 'nawal', 'el herache', 'coc@gmail.com', '4521', '2012-06-21', 'el mohamadia', 0, NULL, '1de452', 0, 'hh452163', 'etudiant'),
(10, 0, 'khadija', 'bouydou', 'khadija@gmail.com', '7485', '2021-05-06', 'bournazil', 0, NULL, '1de452', 4152, 'bb415263', 'etudiant'),
(11, 0, 'hghh', 'dfghj', 'has@gmail.com', '123', '2017-05-14', 'rabat', 0, NULL, NULL, 0, 'aa1452663', 'professeur'),
(12, 0, 'Ikram', 'Atfi', 'ikram@gmail.com', 'f45ffd', '1999-05-21', 'sidi moumen', 0, NULL, 'F748596132', 785469, 'MC857496', 'etudiant'),
(14, 0, 'mohamed', 'azouazi', 'mohamedAzouazi@gmail.com', '123', '1995-08-24', 'faculte des sciences', 0, NULL, NULL, 0, 'MC453698', 'professeur'),
(15, 0, 'sara', 'Bouydou', 'saraBouydou@gmail.com', '123abc', '2002-10-17', 'faculte des sciences', 0, NULL, 'R125478963', 4152896, 'BM125463', 'etudiant');

-- --------------------------------------------------------

--
-- Structure de la table `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `IdPublication` int(11) NOT NULL,
  `IdVideo` int(11) NOT NULL,
  `URL` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`IdPublication`,`IdVideo`),
  KEY `AK_Identifiant_1` (`IdVideo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
