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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.entity.Car;
import com.jsp.repository.CarRepo;


@Controller
public class CarController {

	@Autowired
	private CarRepo carRepo;
	
	@GetMapping("/")
	public String get() {
		
		return "home";
	}
	
	@GetMapping("/search")
	public String redirectToDisplay(@RequestParam("ser") String ser) {
		
		
		return "redirect:https://www.google.com/search?q="+ser;
	}
	
	@PostMapping("/save")
	public String getMethodName(@ModelAttribute Car car) {
		
		Car car1 = new Car(car.getBrand(), car.getModel());
		
		carRepo.save(car1);
		return "home";
	}
	
	@GetMapping("/dis")
	public String display(Model model) {
		
        List<Car> list = carRepo.findAll();
        model.addAttribute("cars", list);
		return "dis";
	}
	
	@GetMapping("/update")
	public String redirectToUpdate() {
		
		
		return "update";
	}
	
	@PostMapping("/dis")
	public String redirectToUpdate(@ModelAttribute Car c) {

		carRepo.save(c);
		
		return "redirect:/dis";
	}
	
	@GetMapping("/delete")
	public String redirectToDelete(@RequestParam("id") int id) {
		
		carRepo.deleteById(id);
		return "redirect:/dis";
	}
	
	@GetMapping("/new")
	public String display(
	        @RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "5") int size,
	        Model model) {

	    Page<Car> carPage = carRepo.findAll(
	            PageRequest.of(page, size, Sort.by("id").descending())
	    );

	    model.addAttribute("cars", carPage.getContent());
	    model.addAttribute("currentPage", page);
	    model.addAttribute("totalPages", carPage.getTotalPages());

	    return "pagination";
	}





}
