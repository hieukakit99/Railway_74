/**
 * 
 */
package com.vti.entity;

/**
 * 
 */
public class Manager extends User{

	
	/**
	 * @param id
	 * @param email
	 * @param full_name
	 */
	
	private Integer ExpInYear;
	private String ProjectId;
	
	/**
	 * @return the expInYear
	 */
	public Integer getExpInYear() {
		return ExpInYear;
	}

	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(Integer expInYear) {
		ExpInYear = expInYear;
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

	public Manager(int id, String email, String full_name) {
		super(id, email, full_name);
		// TODO Auto-generated constructor stub
	}

}
