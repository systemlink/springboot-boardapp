package com.example.web;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Event_Class;
import com.example.repository.Event_ClassRepository;
import com.example.service.Event_ClassService;

import lombok.Data;

@Data
public class BillBoardsForm {
	@Autowired
	Event_ClassService event_classService;
	
	private String title;
	
	private String note;
	
	private Integer billboard_group_id;
	
	private Integer user_id;
	
	private List<Event_Class> list;
	
}
