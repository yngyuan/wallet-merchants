CREATE TABLE `merchants` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'MERCHANTS NAME',
  `logo_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'MERCHANTS LOGO',
  `business_license_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'MERCHANTS LICENCE',
  `phone` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'MERCHANTS PHONE NUMBER',
  `address` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'MERCHANTS ADDRESS',
  `is_audit` BOOLEAN NOT NULL COMMENT 'WHETHER PASSED LICENSE CHECK',
  PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;