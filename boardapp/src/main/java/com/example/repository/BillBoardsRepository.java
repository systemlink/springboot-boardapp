package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.domain.BillBoards;
import com.example.domain.Event_Class;

@Repository
public interface BillBoardsRepository extends JpaRepository<BillBoards, Integer> {
	@Query("SELECT b FROM billboards b WHERE b.del_flg = 0 ORDER BY b.created_at desc, b.id desc")
	List<BillBoards> findAllOrderById();
}
