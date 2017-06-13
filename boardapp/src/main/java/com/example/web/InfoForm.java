package com.example.web;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class InfoForm {
	@NotNull
	private String title;
	
	@NotNull
	private String note;
	
	@NotNull
	private Integer billboard_group_id;
	
	
}
