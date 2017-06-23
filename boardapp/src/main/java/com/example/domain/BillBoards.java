package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "billboards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillBoards {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "title", length = 50, nullable = false)
	private String title;
	@Column(name = "note", nullable = false)
	private String note;
	@Column(name = "billboard_group_id")
	private Integer billboard_group_id;
	@Column(name = "user_id")
	private Integer user_id;
	@Column(name = "created_at", updatable = false)
	private String created_at;
	@Column(name = "updated_at")
	private String updated_at;
}
