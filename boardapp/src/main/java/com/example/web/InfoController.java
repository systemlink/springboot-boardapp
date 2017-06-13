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
import com.example.service.InfoService;

@Controller
@RequestMapping("infos")
public class InfoController {
	@Autowired
	InfoService infoService;

	@ModelAttribute
	InfoForm setUpForm() {
		return new InfoForm();
	}

	@GetMapping
	String list(Model model) {
		List<Info> infos = infoService.findAll();
		model.addAttribute("infos", infos);
		return "infos/list";
	}

	@PostMapping(path = "create")
	String create(@Validated InfoForm form, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return list(model);
		}
		Info info = new Info();
		BeanUtils.copyProperties(form, info);
		infoService.create(info);
		return "infos/add";
	}

	@GetMapping(path = "edit", params = "form")
	String editForm(@RequestParam Integer id, InfoForm form) {
		Info info = infoService.findOne(id);
		BeanUtils.copyProperties(info, form);
		return "infos/edit";
	}

	@PostMapping(path = "edit")
	String edit(@RequestParam Integer id, @Validated InfoForm form, BindingResult result) {
		if (result.hasErrors()) {
			return editForm(id, form);
		}
		Info info = new Info();
		BeanUtils.copyProperties(form, info);
		info.setId(id);
		infoService.update(info);
		return "redirect:/infos";
	}
	
	@RequestMapping(params = "goToTop")
	String goToTop() {
		return "redirect:/infos";
	}
	
	@PostMapping(path = "delete")
	String delete(@RequestParam Integer id) {
		infoService.delete(id);
		return "redirect:/infos";
	}
}
