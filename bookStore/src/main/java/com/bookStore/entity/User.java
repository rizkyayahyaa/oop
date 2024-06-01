package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String password;
    private String notelp;
	public User(int id, String name, String username, String password, String notelp) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.notelp = notelp;
	}
	public User() {
        super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNotelp() {
		return notelp;
	}
	public void setNotelp(String notelp) {
		this.notelp = notelp;
	}
}
