/**
 * 
 */
package com.vti.entity;

/**
 * 
 */
public class Employee extends User{

	/**
	 * @param id
	 * @param email
	 * @param full_name
	 */
	
	private String ProjectId;
	private String ProSkill;
	
	public Employee(int id, String email, String full_name) {
		super(id, email, full_name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return ProjectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return ProSkill;
	}

	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}
	
	
	
	
}
