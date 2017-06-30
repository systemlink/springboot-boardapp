package com.example.view.model;

import lombok.Data;

@Data
public class BillBoardsList {

	private Integer id;
	private String title;
	private String note;
	private String billboard_group;
	private Integer user_id;
	private String created_at;
	private String updated_at;
}
