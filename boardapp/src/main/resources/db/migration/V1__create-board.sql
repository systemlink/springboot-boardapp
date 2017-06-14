CREATE TABLE billboards (id INT PRIMARY KEY NOT NULL,
						　title VARCHAR(50) NOT NULL,
						 note TEXT NOT  NULL,
						 billboard_group_id INT NOT NULL,
						 user_id INT NOT NULL,
						 created_at TIMESTAMP NOT NULL,
						 updated_at TIMESTAMP NOT NULL);