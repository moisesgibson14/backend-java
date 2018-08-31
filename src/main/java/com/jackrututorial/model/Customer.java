package com.jackrututorial.model;
import java.time.LocalDateTime;

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
	
	@Column(name="send_date")
	private LocalDateTime send_date;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="action_notification")
	private String action_notification;
	
	@Column(name="id_campaing")
	private Integer id_campaing;
	
	@Column(name="type_notification")
	private String type_notification;
	
	@Column(name="id_device")
	private Integer id_device;
	
	@Column(name="id_os")
	private Integer id_os;
	
	@Column(name="version_os")
	private String version_os;
	
	@Column(name="validity_notification")
	private String validity_notification;
	
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
			Boolean status,
			String action_notification,
			Integer id_campaing,
			String type_notification,
			Integer id_device,
			Integer id_os,
			String version_os,
			String validity_notification
			) {
		
		super();
		this.id = id;
		this.id_App = id_App;
		this.title = title;
		this.subTitle = subTitle;
		this.description = description;
		this.multimedia = multimedia;
		this.status = status;
		this.action_notification = action_notification;
		this.id_campaing = id_campaing;
		this.type_notification = type_notification;
		this.id_device = id_device;
		this.id_os = id_os;
		this.version_os = version_os;
		this.validity_notification = validity_notification;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getAction_notification() {
		return action_notification;
	}

	public void setAction_notification(String action_notification) {
		this.action_notification = action_notification;
	}

	public Integer getId_campaing() {
		return id_campaing;
	}



	public LocalDateTime getSend_date() {
		return send_date;
	}

	public void setSend_date(LocalDateTime send_date) {
		this.send_date = send_date;
	}

	public void setId_campaing(Integer id_campaing) {
		this.id_campaing = id_campaing;
	}

	public String getType_notification() {
		return type_notification;
	}

	public void setType_notification(String type_notification) {
		this.type_notification = type_notification;
	}

	public Integer getId_device() {
		return id_device;
	}

	public void setId_device(Integer id_device) {
		this.id_device = id_device;
	}

	public Integer getId_os() {
		return id_os;
	}

	public void setId_os(Integer id_os) {
		this.id_os = id_os;
	}

	public String getVersion_os() {
		return version_os;
	}

	public void setVersion_os(String version_os) {
		this.version_os = version_os;
	}

	public String getValidity_notification() {
		return validity_notification;
	}

	public void setValidity_notification(String validity_notification) {
		this.validity_notification = validity_notification;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", id_App=" + id_App + ", title=" + title + ", subTitle=" + subTitle
				+ ", description=" + description + ", multimedia=" + multimedia + ", status=" + status
				+ ", action_notification=" + action_notification + ", id_campaing=" + id_campaing
				+ ", type_notification=" + type_notification + ", id_device=" + id_device + ", id_os=" + id_os
				+ ", version_os=" + version_os + ", validity_notification=" + validity_notification + "]";
	}
	
	

	
		
}
