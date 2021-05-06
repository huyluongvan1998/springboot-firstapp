package com.springbootfirstapp;

public class User {
	
	private int Id;
	private String Username;
	private int Age;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Username=" + Username + ", Age=" + Age + "]";
	}

}
