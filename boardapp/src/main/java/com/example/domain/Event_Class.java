package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "event_class")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event_Class {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false, length = 5)
	private String event_class_id;
	@Column(nullable = false, length = 20)
	private String usage_class_id;
	@Column(nullable = false, length = 1)
	private String del_flg;
	@Column(nullable = false)
	private String created_at;
	@Column(nullable = false)
	private String updated_at;
}
