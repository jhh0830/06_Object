package com.kh.chap02_encapsulation.model.vo;

public class Person {

	
	private String id;
	private String pwd;
	private String name;
	private int  age;
	private char gender;
	private String phone;
	private String email;
	
	public void setId(String id) {
		this.id = id;
		
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public void setGender(char gender) {
		this.gender = gender;
		
	}public void setPhone(String phone) {
		this.phone = phone;
		
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getemail() {
		return email;
	}
	
	public String information() {
		return "id : "+id+" pwd : "+pwd+" 이름은 : "+name+" 나이는 : "+
	age+" 성별은 "+ gender+", 전화번호는 : "+phone+" 이메일은 "+ email +" 입니다.";
	}
	
}
