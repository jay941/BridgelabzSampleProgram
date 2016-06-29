package com.bridgelab.task;

import java.util.Random;
import java.util.Scanner;

public class CoupanNumber 
{
public static void main(String[] args) 
{
	CoupanNumber c1=new CoupanNumber();
	
	Scanner sc=new Scanner(System.in);
	//taking input from user
	System.out.println("Enter how many number of coupans You want to generate ");
	int c=sc.nextInt();
	RandomNumber(c);
	
	}

private static void RandomNumber(int c) 
{
	int ran=0;
	Random r=new  Random(454845);
	//generating random coupan
	for(int i=1;i<=c;++i)
	{
		ran=r.nextInt(50);
		System.out.println("coupans are: "+ran);
	}
	
	
}
}
