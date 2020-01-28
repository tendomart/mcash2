package com.mcash.auth.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

public abstract class User {
	
	
	
	public User(String username, String password, String passwordConfirm, Set roles) {
		super();
		this.username = username;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
		this.roles = roles;
	}
	@Column(name = "username", unique = true)
	private String username;
	@Column(name = "password", unique = true)
	private String password;
	@Column(name = "password_confirm", unique = true)
	private String passwordConfirm;
	@Column(name = "roles", unique = true)
	private Set roles;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	public Set getRoles() {
		return roles;
	}
	public void setRoles(Set roles) {
		this.roles = roles;
	}


}
