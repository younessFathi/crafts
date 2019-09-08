package org.crafts.domain.DTO;

/**
 * The Class CraftsDTO.
 */
public class CraftsDTO {

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The address. */
	private String address;

	/** The age. */
	private Integer age;

	/** The specialisation. */
	private String specialisation;

	/** The description. */
	private String description;

	/**
	 * Instantiates a new crafts.
	 */
	public CraftsDTO() {
	}

	/**
	 * Instantiates a new crafts DTO.
	 *
	 * @param firstName      the first name
	 * @param lastName       the last name
	 * @param address        the address
	 * @param age            the age
	 * @param specialisation the specialisation
	 * @param description    the description
	 */
	public CraftsDTO(String firstName, String lastName, String address, Integer age, String specialisation,
			String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.specialisation = specialisation;
		this.description = description;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Gets the specialisation.
	 *
	 * @return the specialisation
	 */
	public String getSpecialisation() {
		return specialisation;
	}

	/**
	 * Sets the specialisation.
	 *
	 * @param specialisation the new specialisation
	 */
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
