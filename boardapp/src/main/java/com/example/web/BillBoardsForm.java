package com.example.web;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class BillBoardsForm {
	
	private String title;
	
	private String note;
	
	private Integer billboard_group_id;
	
	private Integer user_id;
}
