CREATE TABLE EVENT_CLASS(id INT PRIMARY KEY NOT NULL,
						event_class_id VARCHAR(5) NOT NULL,
						usage_class_id VARCHAR(20) NOT NULL,
						del_flg VARCHAR(1) NOT NULL,
						created_at TIMESTAMP NOT NULL,
						updated_at TIMESTAMP NOT NULL);
						