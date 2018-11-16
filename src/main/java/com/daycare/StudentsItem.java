package com.daycare;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setStudentID(int studentID){
		this.studentID = studentID;
	}

	public int getStudentID(){
		return studentID;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setBaptized(String baptized){
		this.baptized = baptized;
	}

	public String getBaptized(){
		return baptized;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setDob(String dob){
		this.dob = dob;
	}

	public String getDob(){
		return dob;
	}

	public void setPrimaryAddress(String primaryAddress){
		this.primaryAddress = primaryAddress;
	}

	public String getPrimaryAddress(){
		return primaryAddress;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setChurchAffiliation(String churchAffiliation){
		this.churchAffiliation = churchAffiliation;
	}

	public String getChurchAffiliation(){
		return churchAffiliation;
	}

	public void setEmail(String email){
		this.email = email;
	}

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