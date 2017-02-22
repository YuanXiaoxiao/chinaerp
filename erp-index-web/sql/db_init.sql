CREATE TABLE IF NOT EXISTS chinaerp;
USE chinaerp;

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` INT(10) PRIMARY KEY AUTO_INCREMENT,
  `username` VARCHAR(40) NOT NULL COMMENT '登录账户的用户名',
  `password` VARCHAR(40) NOT NULL COMMENT '登录账户的密码'
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO account(username, password) VALUES ("lixiang", "passwordofli");
INSERT INTO account(username, password) VALUES ("shaoyangli", "passwordofshao");