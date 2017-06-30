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
	@ResponseStatus(HttpStatus.CREATED)
	BillBoards create(@RequestBody BillBoards billboard) {
		BillBoards billboards = new BillBoards();
		BeanUtils.copyProperties(billboard, billboards);
		Event_Class event_class = event_classService.findOne(billboard.getBillboard_group_id());
		billboards.setEvent_class(event_class);
		return billboardsService.create(billboards);

	}

	@PutMapping(path = "{id}")
	BillBoards edit(@PathVariable Integer id, @RequestBody BillBoards billboard) {
		BillBoards billboards = new BillBoards();
		BeanUtils.copyProperties(billboard, billboards);
		billboards.setId(id);
		billboards.setDel_flg(0);
		Event_Class event_class = event_classService.findOne(billboard.getBillboard_group_id());
		billboards.setEvent_class(event_class);
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
