package com.ventas.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="author_id")
	private Integer id;
	
	@Column(name="author_username")
	private String username;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private AuthorDetails authorDetails;
	
	public void Author(){};

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AuthorDetails getAuthorDetails() {
		return authorDetails;
	}

	public void setAuthorDetails(AuthorDetails authorDetails) {
		this.authorDetails = authorDetails;
	}

	public Integer getId() {
		return id;
	}
	
	

}
