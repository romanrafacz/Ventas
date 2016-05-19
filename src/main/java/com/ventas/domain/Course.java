package com.ventas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="venetas_course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="course_id")
	private Integer courseId;
	
	@NotNull
	@Size(min=1, max=30)
	@Column(name="course_code")
	private String courseCode;
	
	@NotNull
	@Size(min=1, max=30)
	@Column(name="course_name")
	private String courseName;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseId() {
		return courseId;
	}
	
	
}
