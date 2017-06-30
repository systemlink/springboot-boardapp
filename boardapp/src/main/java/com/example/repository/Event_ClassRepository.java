package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.domain.Event_Class;

@Repository
public interface Event_ClassRepository extends JpaRepository<Event_Class, Integer> {
	@Query("SELECT e FROM event_class e ORDER BY e.id")
	List<Event_Class> findAllOrderById();
}
