package com.daycare;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setContactID(int contactID){
		this.contactID = contactID;
	}

	public int getContactID(){
		return contactID;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setStudents(List<StudentsItem> students){
		this.students = students;
	}

	public List<StudentsItem> getStudents(){
		return students;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setBaptized(String baptized){
		this.baptized = baptized;
	}

	public String getBaptized(){
		return baptized;
	}

	public void setDob(String dob){
		this.dob = dob;
	}

	public String getDob(){
		return dob;
	}

	public void setRelationshipToStudent(String relationshipToStudent){
		this.relationshipToStudent = relationshipToStudent;
	}

	public String getRelationshipToStudent(){
		return relationshipToStudent;
	}

	public void setEmployer(String employer){
		this.employer = employer;
	}

	public String getEmployer(){
		return employer;
	}

	public void setWorkPhone(String workPhone){
		this.workPhone = workPhone;
	}

	public String getWorkPhone(){
		return workPhone;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setCellPhone(String cellPhone){
		this.cellPhone = cellPhone;
	}

	public String getCellPhone(){
		return cellPhone;
	}

	public void setHoursWorked(String hoursWorked){
		this.hoursWorked = hoursWorked;
	}

	public String getHoursWorked(){
		return hoursWorked;
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