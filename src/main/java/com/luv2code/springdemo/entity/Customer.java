package com.luv2code.springdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int Id;

	@NotNull(message = "is required")
	@Size(max = 10, min = 1, message = "Size must be between 1 and 10 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "enter just letters please!")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "is required")
	@Size(max = 10, min = 1, message = "Size must be between 1 and 10 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "enter just letters please!")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "Please enter a date")
	@DateTimeFormat(pattern = "dd/MM/YY")
	@Past(message = "Only the past date is valid")
	@Column(name = "birthday")
	private Date birthday;

	@Email(message="enter valid email")
	@Column(name = "email")
	private String email;
	
	@NotNull(message = "Please enter a salary")
	@NumberFormat(style = Style.NUMBER)
	@Min(value=1,message="min value is 1")
	@Max(value=2147483647,message="@Max value is 2147483647 ${value}")
	//@DecimalMin(value=  ,inclusive=)
	@Column(name = "salary")
	private Double salary;

	@Column(name = "bruto_salary")
	private double brutoSalary;
	
	@Min(value=1000000000000l,message="JiB have egzact 13 digits")
	@Max(value=9999999999999l,message="JiB have egzact 13 digits")
     @Column(name = "jib")
	private long jib;

	@Size(max = 17, message = "max is 17 caracters")
	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "register_date")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date registrationDate;

	@Column(name = "team")
	private String team;

	public Customer() {

		registrationDate = new Date();

	}

	public double getBrutoSalary() {
		return brutoSalary;
	}

	public void setBrutoSalary(double brutoSalary) {
		this.brutoSalary = brutoSalary;
	}

	public long getJib() {
		return jib;
	}

	public void setJib(long jib) {
		this.jib = jib;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
