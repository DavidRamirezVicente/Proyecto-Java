CREATE TABLE `foro` (
  `id` int(7) NOT NULL auto_increment,
  `autor` varchar(200) NOT NULL default '',
  `titulo` varchar(200) NOT NULL default '',
  `mensaje` text NOT NULL,
  `fecha` datetime NOT NULL default '0000-00-00 00:00:00',
  `respuestas` int(11) NOT NULL default '0',
  `identificador` int(7) NOT NULL default '0',
  `ult_respuesta` datetime default NULL,
  KEY `id` (`id`)
) ENGINE=MyISAM;