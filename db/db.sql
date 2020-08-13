
DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer`(
    `id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `consumer_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'consumerName',
    `consumer_phone` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'consumerPhone',
    `create_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    `update_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`consumer`';


DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`(
    `id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `consumer_id` INT (11) NOT NULL DEFAULT -1 COMMENT 'consumerId',
    `product_id` INT (11) NOT NULL DEFAULT -1 COMMENT 'productId',
    `order_price` DECIMAL (15,6) NOT NULL DEFAULT -1 COMMENT 'orderPrice',
    `order_remark` VARCHAR (300) NOT NULL DEFAULT '' COMMENT 'orderRemark',
    `status` BIT (1) NOT NULL DEFAULT 0 COMMENT 'status',
    `create_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    `update_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`order`';


DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`(
    `id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `product_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'productName',
    `product_price` DECIMAL (15,6) NOT NULL DEFAULT -1 COMMENT 'productPrice',
    `description` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'description',
    `status` BIT (1) NOT NULL DEFAULT 0 COMMENT 'status',
    `del_flag` BIT (1) NOT NULL DEFAULT 0 COMMENT 'delFlag',
    `create_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    `update_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`product`';
