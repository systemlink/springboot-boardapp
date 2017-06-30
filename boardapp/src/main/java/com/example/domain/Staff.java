package com.example.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "staff")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false, length = 5)
	private String staff_no;
	@Column(nullable = false, length = 40)
	private String k_name;
	@Column(nullable = false, length = 40)
	private String name;
	@Column(nullable = false, length = 1)
	private String del_flg;
	@Column(nullable = false)
	private String created_at;
	@Column(nullable = false)
	private String updated_at;
}
