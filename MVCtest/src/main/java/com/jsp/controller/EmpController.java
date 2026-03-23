package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.entity.Employee;
import com.jsp.repo.EmpRepo;

import jakarta.persistence.Entity;

@Controller
public class EmpController {

    @Autowired
    private EmpRepo empRepo;

//    @GetMapping("/home")
//    public String home() {
//        return "home";
//    }
//    @GetMapping("/")
//    public String homeAlso() {
//    	return "home";
//    }

    @GetMapping("/reg")
    public String goToRegister() {
        return "register";
    }

    @GetMapping("/search")
    public String redirectToDisplay(@RequestParam("ser") String ser) {
        return "redirect:https://www.google.com/search?q=" + ser;
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee emp) {

        Employee employee =new Employee(emp.getName(), emp.getSalary(), emp.getSkill());

        empRepo.save(employee);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String display(Model model) {

        List<Employee> list = empRepo.findAll();
        model.addAttribute("employees", list);

        return "home";
    }
    @GetMapping("/up")
    public String toUpdate() {
    	return "update";
    }

    @GetMapping("/update")
    public String redirectToUpdate() {
        return "redirect:/up";
    }

    @PostMapping("/saveMe")
    public String updateSave(@ModelAttribute Employee emp) {

        empRepo.save(emp);
        return "redirect:/home";
    }
    

    @GetMapping("/delete")
    public String redirectToDelete(@RequestParam("id") int id) {

        empRepo.deleteById(id);
        return "redirect:/home";
    }

//	▗▄▄▖  ▗▄▖  ▗▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▖▗▄▄▄▖▗▄▄▄▖ ▗▄▖ ▗▖  ▗▖
//	▐▌ ▐▌▐▌ ▐▌▐▌     █  ▐▛▚▖▐▌▐▌ ▐▌ █    █  ▐▌ ▐▌▐▛▚▖▐▌
//	▐▛▀▘ ▐▛▀▜▌▐▌▝▜▌  █  ▐▌ ▝▜▌▐▛▀▜▌ █    █  ▐▌ ▐▌▐▌ ▝▜▌
//	▐▌   ▐▌ ▐▌▝▚▄▞▘▗▄█▄▖▐▌  ▐▌▐▌ ▐▌ █  ▗▄█▄▖▝▚▄▞▘▐▌  ▐▌
	
	PageRequest of = PageRequest.of(0, 3);

//	Page<Mobile> all = jpaRepo.findAll(of);
//	all.getContent().forEach(System.out::println);
//	
//	
//	
//	PageRequest of2 = PageRequest.of(1, 3,Sort.by("id"));
//	Page<Mobile> all2 = jpaRepo.findAll(of2);
//	all2.forEach(System.out::println);
//	
//	
//	PageRequest of3 = PageRequest.of(2, 3,Sort.by("price").descending());
//	Page<Mobile> all3 = jpaRepo.findAll(of3);
//	all3.forEach(System.out::println);
	
    @GetMapping("/new")
    public String pagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            Model model) {

        Page<Employee> empPage = empRepo.findAll(
                PageRequest.of(page, size, Sort.by("id").descending())
        );

        model.addAttribute("employees", empPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", empPage.getTotalPages());

        return "home";
    }
}

	

