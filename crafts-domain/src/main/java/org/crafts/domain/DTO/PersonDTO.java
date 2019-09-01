package org.crafts.domain.DTO;

public class PersonDTO {

	private String firstName;
	private String lastName;
	private Integer age;

	public PersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "{\nfirstName:"+firstName+",\n lastName:"+lastName+",\n age:"+age+"}";
	}

}
