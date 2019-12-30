package com.tpf.mybatis.bean;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  Employee.java,v 1.0, 2019/12/27-12:32 tianpengfei Exp $
 */
public class Employee {

	private Integer id;
	private String lastName;
	private String email;
	private String gender;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email="
				+ email + ", gender=" + gender + "]";
	}


}
