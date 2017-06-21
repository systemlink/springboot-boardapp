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
public class BoardappApplication implements CommandLineRunner {
	@Autowired
	BillBoardsService billboardsService;
	@Autowired
	Event_ClassService event_classService;
	@Override
	public void run(String... strings) throws Exception {
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String hiniti = date.format(d);
		
		event_classService.create(new Event_Class(1, "1", "通達/連絡", 1, hiniti.toString(), "2014-03-12 12:32:56"));
		event_classService.create(new Event_Class(2, "2", "会議開催について", 1, hiniti.toString(), "2014-03-12 12:32:56"));
		event_classService.create(new Event_Class(3, "3", "スケジュール", 1, hiniti.toString(), "2014-03-12 12:32:56"));
		event_classService.create(new Event_Class(4, "4", "イベント", 1, hiniti.toString(), "2014-03-12 12:32:56"));
		event_classService.create(new Event_Class(9, "9", "その他", 1, hiniti.toString(), "2014-03-12 12:32:56"));
	}

	public static void main(String[] args) {
		SpringApplication.run(BoardappApplication.class, args);
	}
}
