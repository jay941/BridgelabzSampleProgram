package com.bridgelab.task;
import java.util.Scanner;
public class Replace{

public static final String st="Hello UserName";

	public static void main(String args[]){
		     String Uname=new String();
		 Scanner sc=new Scanner(System.in);
		do
		{
			
		System.out.println("Enter The UserName: ");
			
		Uname=sc.nextLine();
			
			
		}while(check(Uname));
           stringReplacer(Uname);	//calling replace method for replacing 	
		
		}

	//
	public static boolean check(String UserName){
		if(UserName.length()<3){
			System.out.println("UserName lenght should grater then 3");
		return true;
		}
		else{
			return false;
		}
	}
	
	
	public static void stringReplacer(String userName){
		System.out.println(st.replaceAll("UserName",userName));
	}
}
