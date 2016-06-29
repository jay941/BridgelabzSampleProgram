package com.bridgelab.task;
import javax.security.auth.callback.Callback;


import Utility.Utility;

public class LeapYear  
{
	
	public static void main(String[] args){
		Utility u1=new Utility();
	LeapYear l=new LeapYear();
	
	
	          //asking for user input
		System.out.println("Enter year in number formate to check wether year is leap year or not");
		int y=u1.inputInteger();
		int c=y;
		int numdgits = 0;
        do
        {
           y = y / 10;
           numdgits++;
        } while (y > 0);
		
		if(numdgits==4)
		{
			
			if(c%400==0 && c%4==0)
			{
				System.out.println("Year is leap yaer");
			}
			else
			{
				System.out.println("Year is  not leap yaer");	
			}
		}
		else
		{
			System.out.println("Please enter 4 digit number");
			
		}
	
	}

	

}
