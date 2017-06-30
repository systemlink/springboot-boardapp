package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.BillBoards;
import com.example.domain.Event_Class;
import com.example.service.BillBoardsService;
import com.example.service.Event_ClassService;

@SpringBootApplication
@RestController
public class BoardappApplication {
	@Autowired
	BillBoardsService billboardsService;
	@Autowired
	Event_ClassService event_classService;

	public static void main(String[] args) {
		SpringApplication.run(BoardappApplication.class, args);
	}
}
