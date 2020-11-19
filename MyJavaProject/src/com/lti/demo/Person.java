package com.lti.demo;

public class Person 
{
	private int pAge;
	private String pName;
	private double pSal;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pAge, String pName, double pSal) {
		super();
		this.pAge = pAge;
		this.pName = pName;
		this.pSal = pSal;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpSal() {
		return pSal;
	}
	public void setpSal(double pSal) {
		this.pSal = pSal;
	}
	@Override
	public String toString() {
		return "Person [pAge=" + pAge + ", pName=" + pName + ", pSal=" + pSal + "]";
	}
	
}
