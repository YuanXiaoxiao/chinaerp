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


CREATE TABLE `user` (
  `id` INT(10) PRIMARY KEY,
  `username` VARCHAR(40) NOT NULL COMMENT '登录账户的用户名',
  `password` VARCHAR(40) NOT NULL COMMENT '登录账户的密码',
  `telphone` VARCHAR(40) NOT NULL COMMENT '电话号码'
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO user(id, username, password, telphone) VALUES (11111111, "lixiang", "passwordofli", 15858104414);
INSERT INTO user(id, username, password, telphone) VALUES (22222222, "shaoyangli", "passwordofshao", 15858109914);