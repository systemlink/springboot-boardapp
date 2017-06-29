package com.example.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.BillBoards;
import com.example.domain.Event_Class;
import com.example.service.BillBoardsService;
import com.example.service.Event_ClassService;

@RestController
@RequestMapping("json")
public class BillBoardsRestController {
	@Autowired
	BillBoardsService billboardsService;

	@Autowired
	Event_ClassService event_classService;

	@ModelAttribute
	BillBoardsForm setUpForm() {
		return new BillBoardsForm();
	}

	@GetMapping
	List<BillBoards> list() {
		List<BillBoards> billboards = billboardsService.findAll();
		return billboards;
	}

	@GetMapping(path = "{id}")
	BillBoards list(@PathVariable Integer id) {
		BillBoards billboards = billboardsService.findOne(id);
		return billboards;
	}

	@PostMapping(path = "create")
	BillBoards create(@RequestBody BillBoards billboards) {
		return billboardsService.create(billboards);

	}

	@PutMapping(path = "{id}")
	BillBoards edit(@PathVariable Integer id, @Validated BillBoardsForm form, @RequestBody BillBoards billboards) {
		BillBoards billboard = billboardsService.findOne(id);
		BeanUtils.copyProperties(billboard, form);
		billboards = new BillBoards();
		BeanUtils.copyProperties(form, billboards);
		billboards.setId(id);
		billboards.setDel_flg(0);
		return billboardsService.update(billboards);
	}

	@DeleteMapping(path = "{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void delete(@PathVariable Integer id, BillBoardsForm form) {
		BillBoards billboards = billboardsService.findOne(id);
		BeanUtils.copyProperties(billboards, form);
		billboardsService.delete(billboards);
	}
}
