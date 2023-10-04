package com.mindcraft.pack1;

public class Student {
	private int RollNo;
	private String name;
	
	public Student() {
		RollNo=123;
		name="Nelson";
	}
	
	public Student(int RollNo, String name) {
		this.RollNo = RollNo;
		this.name = name;
	}
	
	public void show() {
		System.out.println(RollNo+" "+name);
	}

	
	}


