CREATE TABLE billboards(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL, 
 						title VARCHAR(50) NOT NULL, 
 						note VARCHAR(255) NOT NULL, 
 						billboard_group_id INT NOT NULL, 
 						user_id INT NOT NULL, 
						created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, 
						updated_at TIMESTAMP NOT NULL);
