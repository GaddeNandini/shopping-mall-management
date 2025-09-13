package com.example.usercont;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user.userdetails;
import com.example.usercls.userser;
@Controller
public class usercont {

	@Autowired
	private userser service;
	
	public usercont(userser service) {
		super();
		this.service = service;
	}

	@GetMapping("/userdetails")
	public String list(Model model)
	{
		model.addAttribute("userdetails", service.getAlluserdetails());
		return "userdetails";
	}
	@GetMapping("/userdetails/new")
	public String createUser(Model model) {
		//created an empty object to hold student data
		userdetails u=new userdetails();
		model.addAttribute("u", u);
		return "create_user";
		
	}
	@PostMapping("/userdetails")
	public String saveUser(@ModelAttribute("u") userdetails u, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
	        // Handle validation errors
	        return "create_user";
		}
		service.saveUser(u);
		return "redirect:/userdetails"; 
	}
	@GetMapping("/userdetails/edit/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("u",service.getUserdetailsById(id));
		return "edit_user";
	}
	@PostMapping("/userdetails/{id}")
	public String updateUserdetails(@PathVariable Long id, @ModelAttribute("u") userdetails u, Model model) {
		//get user from db by id
		userdetails existingUser=service.getUserdetailsById(id);
		//existingUser.setId(u.getId());
		existingUser.setName(u.getName());
		existingUser.setType(u.getType());
		existingUser.setPassword(u.getPassword());
		//save updated user object
		service.updateUserdetails(existingUser);
		return "redirect:/userdetails";
		
	}
	@GetMapping("/userdetails/{id}")
	public String deleteUser(@PathVariable Long id) {
		service.deleteUserById(id);
		return "redirect:/userdetails";
	
}
}




