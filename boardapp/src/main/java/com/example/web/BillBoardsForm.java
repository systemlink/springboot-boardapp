package com.example.web;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Event_Class;
import com.example.repository.Event_ClassRepository;

import lombok.Data;

@Data
public class BillBoardsForm {
	
	private String title;
	
	private String note;
	
	private Integer billboard_group_id;
	
	private Integer user_id;
	
	private List<Event_Class> event_class;
	
}
