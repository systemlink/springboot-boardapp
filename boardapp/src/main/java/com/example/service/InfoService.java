/*package com.example.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Info;
import com.example.repository.InfoRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Transactional
public class InfoService {
	@Autowired
	InfoRepository infoRepository;
	
	public List<Info> findAll() {
		return infoRepository.findAll();
	}
	
	public Info findOne(Integer id) {
		return infoRepository.findOne(id);
	}
	
	public Info create(Info info) {
		return infoRepository.save(info);
	}
	
	public Info update(Info info) {
		return infoRepository.save(info);
	}
	
	public Info delete(Integer id) {
		return infoRepository.delete(id);
	}
}*/
