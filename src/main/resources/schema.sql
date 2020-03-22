CREATE TABLE `member` (
  `id` BIGINT NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `password` VARCHAR(16) NOT NULL,
  `nickname` VARCHAR(16) NOT NULL,
  `join_type` ENUM('basic', 'other') NOT NULL DEFAULT 'basic',
  `status` ENUM('pending', 'active', 'deleted') NOT NULL DEFAULT 'active',
  `tier` ENUM('1', '2', '3') NOT NULL DEFAULT '1',
  `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE `goal` (
  `id` BIGINT NOT NULL COMMENT '			',
  `member_id` BIGINT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `status` ENUM('active', 'deleted') NOT NULL DEFAULT 'active',
  `type` ENUM('basic', 'time', 'free') NOT NULL DEFAULT 'basic',
  `goal_order` INT NOT NULL,
  `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE `level_basic` (
  `goal_id` BIGINT NOT NULL,
  `seq` BIGINT NOT NULL COMMENT '	',
  `member_id` BIGINT NOT NULL,
  `label` VARCHAR(45) NOT NULL,
  `value` INT NOT NULL,
  `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`goal_id`, `seq`)
);

CREATE TABLE `achieve` (
  `id` BIGINT NOT NULL,
  `goal_id` BIGINT NOT NULL,
  `level_seq` BIGINT NOT NULL,
  `member_id` INT NOT NULL,
  `create_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);