package com.cts.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name="registration")
public class People {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="firstName")
    @NotNull
   @NotEmpty(message="{Name must be specified}")
	private String firstname;
    @Column(name="lastName")
    @NotNull
    @NotEmpty
    private String lastname;
    @Column(name="username")
    @NotNull
    @NotEmpty
    private String username;
    @Column(name="password")
   
    @NotEmpty
   //@Size(max=10,min=2)	

    private String password;
    
    @NotEmpty    
    private String cmpassword;
    public String getCmpassword() {
		return cmpassword;
	}



	public void setCmpassword(String cmpassword) {
		this.cmpassword = cmpassword;
	}
	@Column(name="email")
    @NotNull
    @NotEmpty
    @Email(message="{People.email.invalid}")
    private String email;
    @Column(name="phonenumber")
    @NotNull
    //@NotEmpty
    //@Size(max=10)
    //@Pattern(regexp = "^\\\\+(?:[0-9] ?){6,14}[0-9]$\"\r\n")
    private long phonenumber;
    @Column(name="address")
    private String address;
    
	
    public People() {
    	
	}



	public int getId() {
  		return id;
  	}



  	public void setId(int id) {
  		this.id = id;
  	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "People [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", cmpassword=" + cmpassword + ", email=" + email + ", phonenumber="
				+ phonenumber + ", address=" + address + "]";
	}
	  


}
