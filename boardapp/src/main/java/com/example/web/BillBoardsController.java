package com.example.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.BillBoards;
import com.example.domain.Event_Class;
import com.example.service.BillBoardsService;
import com.example.service.Event_ClassService;

@Controller
@RequestMapping("billboards")
public class BillBoardsController {
	@Autowired
	BillBoardsService billboardsService;

	@Autowired
	Event_ClassService event_classService;

	@ModelAttribute
	BillBoardsForm setUpForm() {
		return new BillBoardsForm();
	}

	@GetMapping()
	String list(Model model) {
		List<BillBoards> billboards = billboardsService.findList();
		model.addAttribute("billboards", billboards);
		return "billboards/list";
	}

	@GetMapping(path = "create")
	String createForm(@Validated BillBoardsForm form, Model model) {
		List<Event_Class> list = event_classService.findAll();
		model.addAttribute("list", list);
		form.setList(list);
		return "billboards/create";
	}

	@PostMapping(path = "create")
	String create(@Validated BillBoardsForm form, BindingResult result, Model model) {
		BillBoards billboards = new BillBoards();
		BeanUtils.copyProperties(form, billboards);
		Event_Class event_class = event_classService.findOne(form.getBillboard_group_id());
		billboards.setEvent_class(event_class);
		billboardsService.create(billboards);
		return "redirect:/billboards";
	}

	@GetMapping(path = "edit", params = "form")
	String editForm(@RequestParam Integer id, @Validated BillBoardsForm form, Model model) {
		BillBoards billboards = billboardsService.findOne(id);
		BeanUtils.copyProperties(billboards, form);
		List<Event_Class> list = event_classService.findAll();
		model.addAttribute("list", list);
		form.setList(list);
		BeanUtils.copyProperties(list, form);
		return "billboards/edit";
	}

	@PostMapping(path = "edit")
	String edit(@RequestParam Integer id, @Validated BillBoardsForm form, BindingResult result) {
		BillBoards billboards = new BillBoards();
		BeanUtils.copyProperties(form, billboards);
		billboards.setId(id);
		billboards.setDel_flg(0);
		Event_Class event_class = event_classService.findOne(form.getBillboard_group_id());
		billboards.setEvent_class(event_class);
		billboardsService.update(billboards);
		return "redirect:/billboards";
	}

	@GetMapping(path = { "edit", "detail", "create" }, params = "goToTop")
	String goToTop() {
		return "redirect:/billboards";
	}

	@PostMapping(path = "detail")
	String detail(@RequestParam Integer id, @Validated BillBoardsForm form, BindingResult result) {
		BillBoards billboards = new BillBoards();
		BeanUtils.copyProperties(form, billboards);
		billboards.setId(id);
		return "billboards/detail";
	}

	@GetMapping(path = "detail", params = "form")
	String detailForm(@RequestParam Integer id, @Validated BillBoardsForm form) {
		BillBoards billboards = billboardsService.findOne(id);
		BeanUtils.copyProperties(billboards, form);
		return "billboards/detail";
	}

	@PostMapping(path = "delete")
	String delete(@RequestParam Integer id, BillBoardsForm form) {
		BillBoards billboards = billboardsService.findOne(id);
		BeanUtils.copyProperties(billboards, form);
		billboardsService.delete(billboards);
		return "redirect:/billboards";
	}
}
