package com.example.user;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "userdetails")
public class userdetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Automatically generate the ID (works for MySQL, PostgreSQL, etc.)
	private int id;
	@Column(name="User Name",nullable=false)
	private String name;
	@Column(name="User type")
	private String type;
	@Column(name="User password")
	private String password;
	public userdetails() {
		super();
	}
	public userdetails(int id, String name, String type,String password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password= password;
	}
	public long getId() {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
	

