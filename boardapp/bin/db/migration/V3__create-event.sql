CREATE TABLE event_class(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
						event_class_id VARCHAR(5) NOT NULL,
						usage_class_id VARCHAR(20) NOT NULL,
						del_flg VARCHAR(1) NOT NULL,
						created_at TIMESTAMP NOT NULL,
						updated_at TIMESTAMP NOT NULL);
						