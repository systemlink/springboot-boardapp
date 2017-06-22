package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "event_class")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event_Class {
	@Id
	private Integer id;
	@Column(name = "event_class_id", length = 5)
	private String event_class_id;
	@Column(name = "usage_class_id", length = 20)
	private String usage_class_id;
	@Column(name = "del_flg", length = 1)
	private Integer del_flg;
	@Column(name = "created_at")
	private String created_at;
	@Column(name = "updated_at")
	private String updated_at;
}
