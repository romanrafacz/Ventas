package com.ventas.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ventas.domain.Course;
import com.ventas.repository.CourseRepository;

@Controller
public class CourseController extends WebMvcConfigurerAdapter {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@RequestMapping("/course")
	public ModelAndView getCourse(){
		return new ModelAndView("course/course", "courses", courseRepository.findAll());
	}
	
	@RequestMapping(value="/course/new", method=RequestMethod.GET)
	public String addCoursePage(Course course){
		return "course/addcourse";
	}
	
	@RequestMapping(value="/course/add", method=RequestMethod.POST)
	public String addCourse(@Valid Course course, BindingResult bindingResult, Model model){
		
		if (bindingResult.hasErrors()){
			return "course/addcourse";
		}
		
		courseRepository.save(course);
		return "redirect:/course";
	}

}
