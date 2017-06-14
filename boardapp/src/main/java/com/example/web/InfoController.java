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

import com.example.domain.Info;


@Controller
@RequestMapping("infos")
public class InfoController {
	

	@ModelAttribute
	InfoForm setUpForm() {
		return new InfoForm();
	}

	@GetMapping
	String list(Model model) {
		return "infos/list";
	}

	@PostMapping(path = "add")
	String add(@Validated InfoForm form, BindingResult result, Model model) {
		return "infos/add";
	}

	@GetMapping(path = "edit", params = "form")
	String editForm(InfoForm form) {
		return "infos/edit";
	}

	@PostMapping(path = "edit")
	String edit(@Validated InfoForm form, BindingResult result) {
		return "redirect:/infos";
	}
	
	
	
	@GetMapping(path="add", params = "goToTop")
	String goToTop() {
		return "redirect:/list";
	}
	
	@PostMapping(path="detail")
	String detail(@Validated InfoForm form, BindingResult result, Model model) {
		return "infos/detail";
	}
	
	@PostMapping(path = "delete")
	String delete(Integer id) {
		return "redirect:/infos";
	}
}
