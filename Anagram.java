package com.bridgelab.task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
    public static void  isAnagram(String s,String s1)
    
   {   
    	//removing all whitespace f
	 String s2=s.replaceAll("\\s", "");
	 String s3=s.replaceAll("\\s", "");
	 
	 //Initially setting status as true
	 boolean same=true;
	 if(s2.length()!=s3.length())
	 { //
		//setting status as false if s2 an s3 not have same length
		 same=false;
	 }
	 else
	 {   //converting all uparcase latter to lowercase
		 char[] sa=s2.toLowerCase().toCharArray();
		 char[] sb=s3.toLowerCase().toCharArray();
	//sorting
	 Arrays.sort(sa);
	 Arrays.sort(sb);
	 //Checking whether sa and s2Array are equal
	 
     same = Arrays.equals(sa, sb);
	 }
	 // checking string are same or not
	if(same)
	{
		 System.out.println(s+" and "+s1+" are anagrams");
		
	}
	else{
		 System.out.println(s+" and "+s1+" are  not anagrams");
	}
		
  }
    public static void main(String[] args) 
   {
	Anagram a= new Anagram();
	Scanner sc=new Scanner(System.in);
	//taking user input
	System.out.println("Enter two string");
	String s11=sc.nextLine();
	System.out.println("\n");
	String s12=sc.nextLine();
	//calling anagram function
	a.isAnagram(s11, s12);
  }
  }
