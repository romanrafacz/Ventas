package com.ventas.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ventas.domain.Author;
import com.ventas.domain.AuthorDetails;
import com.ventas.repository.AuthorDetailsRepository;
import com.ventas.repository.AuthorRepository;

@Transactional
@Controller
public class AuthorController {
	
	@PersistenceContext EntityManager entityManager;
	
	@Autowired
	private AuthorRepository authorRepository;
	private AuthorDetailsRepository authorDetailsRepository;
	
	@RequestMapping("/authors")
	public String allAuthors(Model model){
		model.addAttribute("authors", authorRepository.findAll());
		return "author/authors";
	}
	
	@RequestMapping("/author/new")
	public String newAuthor(Author author, AuthorDetails authorDetails){
		return "author/addauthor";
	}
	
	@RequestMapping(value="/author/add", method=RequestMethod.POST)
	public String addAuthor(@Valid Author author, @Valid AuthorDetails authorDetails, BindingResult bindingResult, Model model){
		
		entityManager.persist(author);
		authorDetails.setId(author.getId());
		entityManager.persist(authorDetails);
		return "redirect:/authors";
	}

}
