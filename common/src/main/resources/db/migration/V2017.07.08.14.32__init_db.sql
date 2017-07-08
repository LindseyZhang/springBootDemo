CREATE TABLE user (
  id bigint(20) AUTO_INCREMENT PRIMARY KEY,
  username varchar(128) NOT NULL,
  password varchar(128) NOT NULL,
  address varchar(128),
  phone varchar(128)
) ENGINE = InnoDB DEFAULT CHARSET=utf8;