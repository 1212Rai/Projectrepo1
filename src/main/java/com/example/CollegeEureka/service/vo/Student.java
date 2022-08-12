package com.example.CollegeEureka.service.vo;

public class Student {
	
	private long id;
	private String name;
	private int age;
	private String gender;
	private String stream;
	private long coll_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getColl_id() {
		return coll_id;
	}
	public void setColl_id(long coll_id) {
		this.coll_id = coll_id;
	}
	public Student(String name, int age, String gender, String stream, long coll_id) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.stream = stream;
		this.coll_id = coll_id;
	}
	
	public Student() {
		super();
	}

}
