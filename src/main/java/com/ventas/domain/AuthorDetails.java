package com.ventas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_details")
public class AuthorDetails {
	
	@Id
	@Column(name="author_details_id")
	private Integer authorId;
	
	@Column(name="author_details_email")
	private String email;
	
	public void AuthorDetails() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getAuthorId() {
		return authorId;
	}
	
	
	

}
