package com.example.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
	@Id
	@GeneratedValue
	private Integer id;
	private String staff_no;
	private String k_name;
	private String name;
	private String del_flg;
	private String created_at;
	private String updated_at;
}
