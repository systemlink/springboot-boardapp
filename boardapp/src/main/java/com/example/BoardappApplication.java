package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.BillBoards;
import com.example.service.BillBoardsService;

@SpringBootApplication
@RestController
public class BoardappApplication implements CommandLineRunner {
	@Autowired
	BillBoardsService billboardsService;

	@Override
	public void run(String... strings) throws Exception {
		billboardsService.create(new BillBoards(1, "aaa", "test", 1, 1, "2014-12-23 13:12:23", "2014-12-24 14:15:12"));
		billboardsService.create(new BillBoards(null, "aaa", "test", 1, 1, "2014-12-23 13:12:23", "2014-12-24 14:15:12"));
		billboardsService.create(new BillBoards(null, "aaa", "test", 1, 1, "2014-12-23 13:12:23", "2014-12-24 14:15:12"));
	}

	public static void main(String[] args) {
		SpringApplication.run(BoardappApplication.class, args);
	}
}
