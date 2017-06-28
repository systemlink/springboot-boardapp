CREATE TABLE billboards(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
 						title VARCHAR(50) NOT NULL, 
 						note VARCHAR(255) NOT NULL, 
 						billboard_group_id INT NOT NULL, 
 						user_id INT NOT NULL DEFAULT '1', 
 						del_flg INT NOT NULL DEFAULT '0', 
						created_at DATE NOT NULL, 
						updated_at DATE NOT NULL);
