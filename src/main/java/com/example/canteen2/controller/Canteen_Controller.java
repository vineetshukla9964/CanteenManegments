package com.example.canteen2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.canteen2.model.Canteen;
import com.example.canteen2.model.Menu;
import com.example.canteen2.model.Register;
import com.example.canteen2.model.StudentFeedback;
import com.example.canteen2.service.Canteen_Service;
import com.example.canteen2.service.Canteen_Service1;
import com.example.canteen2.service.Canteens_Service;
import com.example.canteen2.service.Feedback_Service;

@Controller
public class Canteen_Controller {
	@Autowired
	private Canteen_Service service;
	@PostMapping("/aaa")
	public String save(@ModelAttribute Register register, Model model) {
		List<Register> data = service.findAll();
		if (!data.isEmpty()) {
		for (Register i : data) {
			if (register.getEmail().equalsIgnoreCase(i.getEmail())) {
				if (register.getNumber().equals(i.getNumber())) {
					model.addAttribute("err", "User already registered");
					return "index";
				}
			}
		}
		}
		service.save(register);
		return "redirect:/login";
	}
	
	
    @PostMapping("/auth")
    public String login(@RequestParam String email,@RequestParam String pass,Model model) {
      List <Register> list= service.findAll();
      for ( Register r:list) {
    	   if (r.getEmail().equals(email)&& r.getPass().equals(pass)) {
    		   return "redirect:/canteen";
    	   }    	 
    	  }
      model.addAttribute("message", "credentials mismatch");
       return "login";
    }
    @RequestMapping("/menu")
     public String viewMenu() {
    	 return "viewmenu";
     }
    
	
	@RequestMapping("/canteen")
	public String getCanteen() {
		 return "canteen";
	}
	
	
	
	@RequestMapping("/login")
	public String getLogin() {
		 return "login";
	}
	
	
@RequestMapping("/reg")
 public String getRegister() {
	 return "register";
 }
@RequestMapping("/menuue")
public String getMenu() {
	 return "menu";
}
@RequestMapping("/contact")
public String getContact() {
	 return "contact";
}



// menu database
@Autowired
private Canteen_Service1 service1;
@PostMapping("/save")
public ResponseEntity<String> saveFood(@RequestBody Menu menu) {
    service1.save(menu);
    return ResponseEntity.ok("Food saved successfully");
}

@RequestMapping("/logouts")
public String getLogouts() {
	 return "canteen";
}


@RequestMapping("/logout")
public String getLogout() {
	 return "login";
}


//feedback
@Autowired
private Feedback_Service  service2;
@PostMapping("/feedback")
public String save(StudentFeedback entity) {
	service2.save(entity);
	return "feedback";
}

@RequestMapping("/feed")
public String getfeed() {
	 return "feedback";
}



public List<StudentFeedback> findAll() {
	return service2.findAll();
}


public Optional<StudentFeedback> findById(Integer id) {
	return service2.findById(id);
}


public void deleteById(Integer id) {
	service2.deleteById(id);
}







@RequestMapping("/con")
public String con()
{
	return "index";
}


@RequestMapping("/men")
public String menu()
{
	return "index";
}

@RequestMapping("/view")
public String viewmenu()
{
	return "index";
}


@RequestMapping("/logg")
public String log()
{
	return "index";
}

@RequestMapping("/rege")
public String reg()
{
	return "index";
}



//cantten
@Autowired
private Canteens_Service service3;
@PostMapping("/order")
public String save(Canteen entity, Model model) {
    service3.save(entity);
    model.addAttribute("message", "Order Confirmed");
    return "canteen";
}



@GetMapping("/delete/{id}")
public String deleteById(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
    service3.deleteById(id);
    redirectAttributes.addFlashAttribute("message", "✅ Order deleted successfully!");
    return "admin"; // Redirects after deletion
}


@RequestMapping("/sub")
public String order_details(){
	return "canteen";
}



 // Assuming this service fetches orders
@PostMapping("/adminlogin")
public String adminLogin(@RequestParam("email") String email,
                         @RequestParam("password") String password,
                         Model model) {
    if ("admin@gmail.com".equals(email) && "admin123@".equals(password)) {
        model.addAttribute("orders", service3.findAll());
        return "admin";
    } else {
        model.addAttribute("error", "Invalid email or password");
        return "adminlogin"; 
    }
}


@RequestMapping("/adminlogout")
public String Adminlogout()
{
	return "adminlogin";
}



@RequestMapping("/adminlogouts")
public String Adminlogouts()
{
	return "index";
}



@RequestMapping("/admin")
public String AdminLogin()
{
	return "adminlogin";
}








}
