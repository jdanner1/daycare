package com.daycare;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Contact results.
 */
@Generated("com.robohorse.robopojogenerator")
public class ContactResults{

	@JsonProperty("zip")
	private String zip;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("address")
	private String address;

	@JsonProperty("contactID")
	private int contactID;

	@JsonProperty("city")
	private String city;

	@JsonProperty("students")
	private List<StudentsItem> students;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("baptized")
	private String baptized;

	@JsonProperty("dob")
	private String dob;

	@JsonProperty("relationshipToStudent")
	private String relationshipToStudent;

	@JsonProperty("employer")
	private String employer;

	@JsonProperty("workPhone")
	private String workPhone;

	@JsonProperty("state")
	private String state;

	@JsonProperty("cellPhone")
	private String cellPhone;

	@JsonProperty("hoursWorked")
	private String hoursWorked;

	@JsonProperty("email")
	private String email;

	/**
	 * Set zip.
	 *
	 * @param zip the zip
	 */
	public void setZip(String zip){
		this.zip = zip;
	}

	/**
	 * Get zip string.
	 *
	 * @return the string
	 */
	public String getZip(){
		return zip;
	}

	/**
	 * Set last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	/**
	 * Get last name string.
	 *
	 * @return the string
	 */
	public String getLastName(){
		return lastName;
	}

	/**
	 * Set address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address){
		this.address = address;
	}

	/**
	 * Get address string.
	 *
	 * @return the string
	 */
	public String getAddress(){
		return address;
	}

	/**
	 * Set contact id.
	 *
	 * @param contactID the contact id
	 */
	public void setContactID(int contactID){
		this.contactID = contactID;
	}

	/**
	 * Get contact id int.
	 *
	 * @return the int
	 */
	public int getContactID(){
		return contactID;
	}

	/**
	 * Set city.
	 *
	 * @param city the city
	 */
	public void setCity(String city){
		this.city = city;
	}

	/**
	 * Get city string.
	 *
	 * @return the string
	 */
	public String getCity(){
		return city;
	}

	/**
	 * Set students.
	 *
	 * @param students the students
	 */
	public void setStudents(List<StudentsItem> students){
		this.students = students;
	}

	/**
	 * Get students list.
	 *
	 * @return the list
	 */
	public List<StudentsItem> getStudents(){
		return students;
	}

	/**
	 * Set first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	/**
	 * Get first name string.
	 *
	 * @return the string
	 */
	public String getFirstName(){
		return firstName;
	}

	/**
	 * Set baptized.
	 *
	 * @param baptized the baptized
	 */
	public void setBaptized(String baptized){
		this.baptized = baptized;
	}

	/**
	 * Get baptized string.
	 *
	 * @return the string
	 */
	public String getBaptized(){
		return baptized;
	}

	/**
	 * Set dob.
	 *
	 * @param dob the dob
	 */
	public void setDob(String dob){
		this.dob = dob;
	}

	/**
	 * Get dob string.
	 *
	 * @return the string
	 */
	public String getDob(){
		return dob;
	}

	/**
	 * Set relationship to student.
	 *
	 * @param relationshipToStudent the relationship to student
	 */
	public void setRelationshipToStudent(String relationshipToStudent){
		this.relationshipToStudent = relationshipToStudent;
	}

	/**
	 * Get relationship to student string.
	 *
	 * @return the string
	 */
	public String getRelationshipToStudent(){
		return relationshipToStudent;
	}

	/**
	 * Set employer.
	 *
	 * @param employer the employer
	 */
	public void setEmployer(String employer){
		this.employer = employer;
	}

	/**
	 * Get employer string.
	 *
	 * @return the string
	 */
	public String getEmployer(){
		return employer;
	}

	/**
	 * Set work phone.
	 *
	 * @param workPhone the work phone
	 */
	public void setWorkPhone(String workPhone){
		this.workPhone = workPhone;
	}

	/**
	 * Get work phone string.
	 *
	 * @return the string
	 */
	public String getWorkPhone(){
		return workPhone;
	}

	/**
	 * Set state.
	 *
	 * @param state the state
	 */
	public void setState(String state){
		this.state = state;
	}

	/**
	 * Get state string.
	 *
	 * @return the string
	 */
	public String getState(){
		return state;
	}

	/**
	 * Set cell phone.
	 *
	 * @param cellPhone the cell phone
	 */
	public void setCellPhone(String cellPhone){
		this.cellPhone = cellPhone;
	}

	/**
	 * Get cell phone string.
	 *
	 * @return the string
	 */
	public String getCellPhone(){
		return cellPhone;
	}

	/**
	 * Set hours worked.
	 *
	 * @param hoursWorked the hours worked
	 */
	public void setHoursWorked(String hoursWorked){
		this.hoursWorked = hoursWorked;
	}

	/**
	 * Get hours worked string.
	 *
	 * @return the string
	 */
	public String getHoursWorked(){
		return hoursWorked;
	}

	/**
	 * Set email.
	 *
	 * @param email the email
	 */
	public void setEmail(String email){
		this.email = email;
	}

	/**
	 * Get email string.
	 *
	 * @return the string
	 */
	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"ContactResults{" + 
			"zip = '" + zip + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",address = '" + address + '\'' + 
			",contactID = '" + contactID + '\'' + 
			",city = '" + city + '\'' + 
			",students = '" + students + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",baptized = '" + baptized + '\'' + 
			",dob = '" + dob + '\'' + 
			",relationshipToStudent = '" + relationshipToStudent + '\'' + 
			",employer = '" + employer + '\'' + 
			",workPhone = '" + workPhone + '\'' + 
			",state = '" + state + '\'' + 
			",cellPhone = '" + cellPhone + '\'' + 
			",hoursWorked = '" + hoursWorked + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}