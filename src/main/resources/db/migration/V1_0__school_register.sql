CREATE TABLE `school_register`
              ( `id` BIGINT(100) NOT NULL AUTO_INCREMENT,
              `school_name` VARCHAR(200),
              `school_reg_no` VARCHAR(20),
              `school_contact` VARCHAR(15),
              `school_email` VARCHAR(30),
              `country` VARCHAR(30),
               `state` VARCHAR(30),
                `district` VARCHAR(30),
                `user_name` VARCHAR(50),
                `password` VARCHAR(200),
                `created_date` DATETIME, PRIMARY KEY (`id`) );