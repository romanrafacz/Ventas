package com.ventas.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ventas.domain.User;
import com.ventas.repository.UserRepository;
import com.ventas.service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	private com.ventas.service.UserService userService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping("/user")
	public String users(Model model){;
		model.addAttribute("users", userRepository.findAll());
		return ("user/users");
	}
	
	@RequestMapping("/user/new")
	public String newUser(User user){
		return "user/adduser";
	}
	
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public String addUser(
			@Valid User newUser, BindingResult bindingResult, Model model
			){
		
		userRepository.save(newUser);
		//userService.addUser(newUser);
		return "redirect:/user";
	
	}
		
	/*MimeMessage mail = javaMailSender.createMimeMessage();
	
	 try {
         MimeMessageHelper helper = new MimeMessageHelper(mail, true);
         helper.setTo(email);
         helper.setReplyTo("roman32@gmail.com");
         helper.setFrom("shoemonkey481@gmail.com");
         helper.setSubject("springboot email");
         helper.setText("Lorem ipsum dolor sit amet [...]");
     } catch (MessagingException e) {
         e.printStackTrace();
     } finally {}
     javaMailSender.send(mail);*/
	
}
