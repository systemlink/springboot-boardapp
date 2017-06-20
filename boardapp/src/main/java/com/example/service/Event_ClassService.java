package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.domain.BillBoards;
import com.example.domain.Event_Class;
import com.example.repository.BillBoardsRepository;
import com.example.repository.Event_ClassRepository;

@Service
@Transactional
public class Event_ClassService {
	@Autowired
	Event_ClassRepository event_classRepository;

	public List<Event_Class> findAll() {
		return event_classRepository.findAllOrderById();
	}

	public Event_Class findOne(Integer id) {
		return event_classRepository.findOne(id);
	}

	public Event_Class create(Event_Class event_class) {
		return event_classRepository.save(event_class);
	}

	public Event_Class update(Event_Class event_class) {
		return event_classRepository.save(event_class);
	}

	public void delete(Integer id) {
		event_classRepository.delete(id);
	}
}
