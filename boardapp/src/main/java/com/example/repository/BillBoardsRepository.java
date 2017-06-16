package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.domain.BillBoards;

@Repository
public interface BillBoardsRepository extends JpaRepository<BillBoards, Integer> {
	@Query("SELECT b FROM billboards b ORDER BY b.id")
	List<BillBoards> findAllOrderById();
}
