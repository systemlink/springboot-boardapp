CREATE TABLE staff(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
				   staff_no VARCHAR(5) NOT NULL, 
				   k_name VARCHAR(40) NOT NULL,
				   name VARCHAR(40) NOT NULL,
				   del_flg VARCHAR(1) NOT NULL,
				   created_at DATE NOT NULL,
				   updated_at DATE NOT NULL);