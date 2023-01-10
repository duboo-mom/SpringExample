package com.duboomom.spring.ex.lifecycle.model;

public class Person {
	
	// 이름, 나이
	private String name;
	private int age;
	// 단순 데이터 저장용 클래스라면 getter setter로만 생성자따로 안하고
	
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
	
	

}
