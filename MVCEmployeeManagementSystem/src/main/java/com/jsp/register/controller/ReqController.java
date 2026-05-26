package com.jsp.register.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.register.entity.Person;
import com.jsp.register.repo.PersonRepo;

@Controller
public class ReqController {

	@Autowired
	private PersonRepo personRepo;

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@GetMapping("/reg")
	public String reg() {
		return "reg";
	}

	@GetMapping("/log")
	public String login1() {
		return "redirect:/";
	}

	@PostMapping("/read")
	public String receive(@RequestParam String fname, @RequestParam String lname, @RequestParam String password,
			@RequestParam int age) {

		Person person = new Person();
		person.setFname(fname);
		person.setLname(lname);
		person.setPassword(password);
		person.setAge(age);

		personRepo.save(person);

		System.out.println("------done");
		return "redirect:/";
	}

//    @PostMapping("/login/validate")
//    public String validateLogin(
//            @RequestParam String fname,
//            @RequestParam String lname,
//            @RequestParam String password,
//            Model model) {
//        
//        // Fetch all employees and check credentials
//        List<Person> persons = personRepo.findAll();
//        
//        for (Person person : persons) {
//            // Check if credentials match
//            if (person.getFname().equalsIgnoreCase(fname) &&
//                person.getLname().equalsIgnoreCase(lname) &&
//                person.getPassword().equals(password)) {
//                
//                // Login successful
//                System.out.println("Login successful for: " + fname + " " + lname);
//                model.addAttribute("loggedInUser", person);
//                return "redirect:/list";
//            }
//        }
//        
//        // Login failed - redirect back to login with error
//        System.out.println("Login failed for: " + fname + " " + lname);
//        return "redirect:/?error=invalid";
//    }

	@PostMapping("/login/validate")
	public String validateLogin(@RequestParam String fname, @RequestParam String lname, @RequestParam String password) {

		Optional<Person> person = personRepo.findByFnameIgnoreCaseAndLnameIgnoreCaseAndPassword(fname, lname, password);

		if (person.isPresent()) {
			return "redirect:/list";
		}

		return "redirect:/?error=invalid";
	}

	@GetMapping("/list")
	public String showList(Model model) {
		List<Person> list = personRepo.findAll();
		model.addAttribute("persons", list);
		System.out.println("kkkkkkkkkkkk");
		return "list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam String id) {
		personRepo.deleteById(id);
		return "redirect:/list";
	}

	@GetMapping("/update")
	public String updatePage(@RequestParam String id, Model model) {
		Person person = personRepo.findById(id).orElse(null);
		model.addAttribute("person", person);
		return "update";
	}

//    @GetMapping("/update/save")
//    public String updateSave(Person person) {
//        personRepo.save(person);
//        return "redirect:/list";
//    }

	@PostMapping("/update/save")
	public String updateSave(Person formPerson) {

		Person existing = personRepo.findById(formPerson.getId())
				.orElseThrow(() -> new RuntimeException("User not found"));

		existing.setFname(formPerson.getFname());
		existing.setLname(formPerson.getLname());
		existing.setAge(formPerson.getAge());

		personRepo.save(existing);

		return "redirect:/list";
	}

	@GetMapping("/*")
	public String notFound() {

		return "notFound";
	}

}
