package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.domain.BillBoards;
import com.example.repository.BillBoardsRepository;

@Service
@Transactional
public class BillBoardsService {
	@Autowired
	BillBoardsRepository billboardsRepository;

	public List<BillBoards> findAll() {
		return billboardsRepository.findAllOrderById();
	}

	public BillBoards findOne(Integer id) {
		return billboardsRepository.findOne(id);
	}

	public BillBoards create(BillBoards billboards) {
		return billboardsRepository.save(billboards);
	}

	public BillBoards update(BillBoards billboards) {
		return billboardsRepository.save(billboards);
	}

	public void delete(Integer id) {
		billboardsRepository.delete(id);
	}
}
