INSERT INTO `member` (`id`, `email`, `password`, `nickname`, `join_type`, `status`, `tier`, `create_timestamp`, `update_timestamp`) 
VALUES (1, 'test@email.com', '123', 'test', 'basic', 'active', '1', '2020-01-01 00:00:00', '2020-01-01 00:00:00');

INSERT INTO `goal` (`id`, `member_id`, `name`, `description`, `status`, `type`, `goal_order`, `create_timestamp`, `update_timestamp`) 
VALUES (1, 1, 'test', 'test', 'active', 'basic', 1, '2020-01-01 00:00:00', '2020-01-01 00:00:00');
INSERT INTO `goal` (`id`, `member_id`, `name`, `description`, `status`, `type`, `goal_order`, `create_timestamp`, `update_timestamp`) 
VALUES (2, 1, 'test2', 'test2', 'active', 'basic', 1, '2020-01-01 00:00:00', '2020-01-01 00:00:00');

INSERT INTO `level_basic` (`goal_id`, `seq`, `member_id`, `label`, `value`) 
VALUES (1, 1, 1, 'test', 1);

INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (1, 1, 1, 1, '2020-01-01 00:00:00', '2020-01-01 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (2, 1, 1, 1, '2020-01-02 00:00:00', '2020-01-02 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (3, 1, 1, 1, '2020-01-03 00:00:00', '2020-01-03 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (4, 1, 1, 1, '2020-01-04 00:00:00', '2020-01-04 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (5, 1, 1, 1, '2020-01-05 00:00:00', '2020-01-05 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (6, 1, 1, 1, '2020-01-06 00:00:00', '2020-01-06 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (7, 1, 1, 1, '2020-01-07 00:00:00', '2020-01-07 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (8, 1, 1, 1, '2020-01-08 00:00:00', '2020-01-08 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (9, 1, 1, 1, '2020-01-09 00:00:00', '2020-01-09 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (10, 1, 1, 1, '2020-01-10 00:00:00', '2020-01-10 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (11, 1, 1, 1, '2020-01-11 00:00:00', '2020-01-11 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (12, 1, 1, 1, '2020-01-12 00:00:00', '2020-01-12 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (13, 1, 1, 1, '2020-01-13 00:00:00', '2020-01-13 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (14, 1, 1, 1, '2020-01-14 00:00:00', '2020-01-14 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (15, 1, 1, 1, '2020-01-15 00:00:00', '2020-01-15 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (16, 1, 1, 1, '2020-01-16 00:00:00', '2020-01-16 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (17, 1, 1, 1, '2020-01-17 00:00:00', '2020-01-17 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (18, 1, 1, 1, '2020-01-18 00:00:00', '2020-01-18 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (19, 1, 1, 1, '2020-01-19 00:00:00', '2020-01-19 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (20, 1, 1, 1, '2020-01-20 00:00:00', '2020-01-20 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (21, 1, 1, 1, '2020-01-21 00:00:00', '2020-01-21 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (22, 1, 1, 1, '2020-01-22 00:00:00', '2020-01-22 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (23, 1, 1, 1, '2020-01-23 00:00:00', '2020-01-23 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (24, 1, 1, 1, '2020-01-24 00:00:00', '2020-01-24 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (25, 1, 1, 1, '2020-01-25 00:00:00', '2020-01-25 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (26, 1, 1, 1, '2020-01-26 00:00:00', '2020-01-26 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (27, 1, 1, 1, '2020-01-27 00:00:00', '2020-01-27 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (28, 1, 1, 1, '2020-01-28 00:00:00', '2020-01-28 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (29, 1, 1, 1, '2020-01-29 00:00:00', '2020-01-29 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (30, 1, 1, 1, '2020-01-30 00:00:00', '2020-01-30 00:00:00');
INSERT INTO `achieve` (`id`, `goal_id`, `level_seq`, `member_id`, `create_timestamp`, `update_timestamp`)  VALUES (31, 1, 1, 1, '2020-01-31 00:00:00', '2020-01-31 00:00:00');
