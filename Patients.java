package com.bridgelab.task;

import Utility.Utility;

public class Patients
{
	int pid;
	String pname;
	int age;
	int mobile;
//getter and setter
	public int getPid() 
{
		return pid;
	}
	public void setPid(int pid) 
{
		this.pid = pid;
	}
	public String getPname()
 {
		return pname;
	}
	public void setPname(String pname) 
{
		this.pname = pname;
	}
	public int getAge() 
{
		return age;
	}
	public void setAge(int age) 
{
		this.age = age;
	}
	public double getMobile() {
		return mobile;
	}
	public void setMobile(int mo) 
{
		this.mobile = mo;
	}
	//diplaying data in propar formate
	public String toString()
 {
		return "Patients [pid=" + pid + ", pname=" + pname + ", age=" + age + ", mobile=" + mobile + "]";
	}
	
	public void addPatient(){
		Utility u1;
		u1=new Utility();
		System.out.println("Enter Patient Details ...");

		System.out.print("Enter Name: ");
		this.pname=u1.inputString();
		System.out.println();

		System.out.print("Enter Id No: ");
		this.pid=u1.inputInteger();
		System.out.println();

		System.out.print("Enter age: ");
		this.age=u1.inputInteger();
		System.out.println();

		System.out.print("Enter Mobile Number");
		this.mobile=u1.inputInteger();
		System.out.println();
	}
	
}
