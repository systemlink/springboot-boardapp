package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
	@Column(name = "billboard_group_id", nullable = false, insertable = false, updatable = false)
	private Integer billboard_group_id;
	@Column(name = "user_id")
	private Integer user_id;
	@Column(name = "del_flg")
	private Integer del_flg;
	@Column(name = "created_at", updatable = false)
	private String created_at;
	@Column(name = "updated_at")
	private String updated_at;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "billboard_group_id", referencedColumnName = "id")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonIdentityReference(alwaysAsId = true)
	private Event_Class event_class;
}
