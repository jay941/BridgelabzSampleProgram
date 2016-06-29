package com;
import java.util.*;
public class RegexDemo{
	public static void main(String args[])
{
		
		

Utility u=new Utility();
		UserDetails userDetails=new UserDetails();
		//entering user first name	
		System.out.println("Enter FirstName:");
		userDetails.setfName(u.inputWord());
		//entring user last name
		System.out.println("Enter LastName:");
		userDetails.setlName(u.inputWord());
		//entering user mobile Number
		System.out.println("Enter MobileNumber:");
		userDetails.setmobileNo(u.inputWord());
		
		//Setting Currrent date
		userDetails.setdate(u.getFormatedDate(new Date()));
		//calling method of fetching the file 
		System.out.println(u.convertString(userDetails,u.getFileText("/home/bridgelabz4/jp/jay/src/com/file.txt")));

		
	}

}
