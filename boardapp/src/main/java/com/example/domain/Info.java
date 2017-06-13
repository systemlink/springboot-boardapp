package com.example.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Info {
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String note;
	private Integer billboard_group_id;
	private Integer user_id;
	private String created_at;
	private String updated_at;
}
