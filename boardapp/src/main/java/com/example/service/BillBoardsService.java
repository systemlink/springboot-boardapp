package com.example.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.domain.BillBoards;
import com.example.repository.BillBoardsRepository;
import com.example.repository.Event_ClassRepository;

@Service
@Transactional
public class BillBoardsService {
	@Autowired
	BillBoardsRepository billboardsRepository;

	@Autowired
	Event_ClassRepository event_classRepository;
	Date d = new Date();
	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	String hiniti = date.format(d);

	public List<BillBoards> findList() {
		List<BillBoards> billboardsList = findAll();
		return billboardsList;
	}

	public List<BillBoards> findAll() {
		return billboardsRepository.findAllOrderById();
	}

	public BillBoards findOne(Integer id) {
		return billboardsRepository.findOne(id);
	}

	public BillBoards create(BillBoards billboards) {
		billboards.setCreated_at(hiniti);
		billboards.setUpdated_at(hiniti);
		billboards.setUser_id(1);
		billboards.setDel_flg(0);
		return billboardsRepository.save(billboards);
	}

	public BillBoards update(BillBoards billboards) {
		billboards.setUpdated_at(hiniti);
		billboards.setUser_id(1);
		return billboardsRepository.save(billboards);
	}

	public void delete(BillBoards billboards) {
		billboards.setDel_flg(1);
		update(billboards);
	}
}
