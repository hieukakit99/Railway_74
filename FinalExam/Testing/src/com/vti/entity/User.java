/**
 * 
 */
package com.vti.entity;

/**
 * 
 */
public abstract class User {
	private int id;
	private String email;
	private String full_name;
	private String password;
	/**
	 * @return the id
	 */
	
	
	public int getId() {
		return id;
	}
	public User(int id, String email, String full_name) {
		super();
		this.id = id;
		this.email = email;
		this.full_name = full_name;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the full_name
	 */
	public String getFull_name() {
		return full_name;
	}
	/**
	 * @param full_name the full_name to set
	 */
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
