package com.daycare;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Students item.
 */
@Generated("com.robohorse.robopojogenerator")
public class StudentsItem{

	@JsonProperty("studentID")
	private int studentID;

	@JsonProperty("zip")
	private String zip;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("baptized")
	private String baptized;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("city")
	private String city;

	@JsonProperty("dob")
	private String dob;

	@JsonProperty("primaryAddress")
	private String primaryAddress;

	@JsonProperty("state")
	private String state;

	@JsonProperty("churchAffiliation")
	private String churchAffiliation;

	@JsonProperty("email")
	private String email;

	/**
	 * Set student id.
	 *
	 * @param studentID the student id
	 */
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}

	/**
	 * Get student id int.
	 *
	 * @return the int
	 */
	public int getStudentID(){
		return studentID;
	}

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
	 * Set gender.
	 *
	 * @param gender the gender
	 */
	public void setGender(String gender){
		this.gender = gender;
	}

	/**
	 * Get gender string.
	 *
	 * @return the string
	 */
	public String getGender(){
		return gender;
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
	 * Set primary address.
	 *
	 * @param primaryAddress the primary address
	 */
	public void setPrimaryAddress(String primaryAddress){
		this.primaryAddress = primaryAddress;
	}

	/**
	 * Get primary address string.
	 *
	 * @return the string
	 */
	public String getPrimaryAddress(){
		return primaryAddress;
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
	 * Set church affiliation.
	 *
	 * @param churchAffiliation the church affiliation
	 */
	public void setChurchAffiliation(String churchAffiliation){
		this.churchAffiliation = churchAffiliation;
	}

	/**
	 * Get church affiliation string.
	 *
	 * @return the string
	 */
	public String getChurchAffiliation(){
		return churchAffiliation;
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
			"StudentsItem{" + 
			"studentID = '" + studentID + '\'' + 
			",zip = '" + zip + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",baptized = '" + baptized + '\'' + 
			",gender = '" + gender + '\'' + 
			",city = '" + city + '\'' + 
			",dob = '" + dob + '\'' + 
			",primaryAddress = '" + primaryAddress + '\'' + 
			",state = '" + state + '\'' + 
			",churchAffiliation = '" + churchAffiliation + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}