create database expense;
use expense;
CREATE TABLE `expenses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL,
  `amount` decimal(15,2) NOT NULL,
  `details` VARCHAR(256)  NULL,
  `created_on` datetime  NULL,
  `created_by` int(11)  NULL,
  `updated_on` datetime  NULL,
  `updated_by` int(11)  NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` int(11) NOT NULL,
  `amount` decimal(15,2) NOT NULL,
  `details` VARCHAR(256) NOT NULL,
  `created_on` datetime NOT NULL,
  `created_by` int(11) NOT NULL,
  `updated_on` datetime NOT NULL,
  `updated_by` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `expense_category_mapping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `expense_id` int(11) NOT NULL,
  `category_id` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`expense_id`) REFERENCES expenses(`id`),
  FOREIGN KEY (`category_id`) REFERENCES category(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

