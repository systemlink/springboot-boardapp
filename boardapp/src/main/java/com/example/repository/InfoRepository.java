package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.domain.Info;
@Repository
public interface InfoRepository extends JpaRepository<Info, Integer>{
	@Query("SELECT created_at, billboard_group_id, title, user_id FROM billboards")
	List<Info> findAll();
}
