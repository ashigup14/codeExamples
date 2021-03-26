/**
 * 
 */
package com.test.stream;

import java.util.List;

/**
 * @author z002y1ra
 *
 */
public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> phoneNmuners;
	
	public Customer(int id, String name, String email, List<String> phoneNmuners) {
	//	super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNmuners = phoneNmuners;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNmuners() {
		return phoneNmuners;
	}

	public void setPhoneNmuners(List<String> phoneNmuners) {
		this.phoneNmuners = phoneNmuners;
	}

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
