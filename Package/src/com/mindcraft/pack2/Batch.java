package com.mindcraft.pack2;


public class Batch {
	private String CourseName;
	private int BatchStrength;
	
	public Batch() {
		CourseName="Java";
		BatchStrength=20;
	}
	
	public Batch(String CourseName, int BatchStrength) {
		this.CourseName = CourseName;
		this.BatchStrength = BatchStrength;
	}
	
	public void show() {
		System.out.println(CourseName+" "+BatchStrength);
	}

	
	}



