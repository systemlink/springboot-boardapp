package com.example.web;

import java.util.List;

import org.thymeleaf.util.StringUtils;

import com.example.domain.Event_Class;

import lombok.Data;

@Data
public class BillBoardsForm {

	private String title;

	private String note;

	private Integer billboard_group_id;

	private Integer user_id;
	
	private Event_Class event_class;

	private List<Event_Class> list;

	public String getNoteNl2br() {
		return this.note.replaceAll("\n", "<br/>");
	}

}
