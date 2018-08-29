package com.jackrututorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="id_App")
	private Integer id_App;
	
	@Column(name="title")
	private String title;
	
	@Column(name="subTitle")
	private String subTitle;
	
	@Column(name="description")
	private String description;
	
	@Column(name="multimedia")
	private String multimedia;
	
	@Column(name="status")
	private Boolean status;
	
	public Customer() {
		super();
	}

	public Customer(
			Integer id,
			Integer id_App,
			String title,
			String subTitle,
			String description,
			String multimedia,
			Boolean status) {
		super();
		this.id = id;
		this.id_App = id_App;
		this.title = title;
		this.subTitle = subTitle;
		this.description = description;
		this.multimedia = multimedia;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_App() {
		return id_App;
	}

	public void setId_App(Integer id_App) {
		this.id_App = id_App;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(String multimedia) {
		this.multimedia = multimedia;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

	
		
}
