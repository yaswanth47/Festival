package com.cts.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="firstName")
	private String firstname;
    @Column(name="lastName")
    private String lastname;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;
    @Column(name="phonenumber")
    private long phonenumber;
    @Column(name="address")
    private String address;
    public Registration() {
		
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
			return "Registration [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
					+ username + ", password=" + password + ", email=" + email + ", phonenumber=" + phonenumber
					+ ", address=" + address + "]";
		}

}
