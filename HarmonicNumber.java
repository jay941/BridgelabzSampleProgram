package com.bridgelab.task;

import java.util.Scanner;

public class HarmonicNumber 
{
public static void main(String[] args)

{ 
  int n=0;
  HarmonicNumber h=new HarmonicNumber();
	Scanner sc=new Scanner(System.in);
	
	do
	{ //user to ask value
		System.out.println("Enter number to find Harmonic Value");
		n=sc.nextInt();
		
	}while(!h.check(n));
	  System.out.println("hi");
	  double d=h.CalHarmonic(n);
	  System.out.println(d);
}
//method for finding harmonic
private static double CalHarmonic(int n)
{ 
    double a=0;
	
	for(int i=1;i<=n;i++)
	{
		
		a=a+(1.0/i);
	}
	
	return a;
	
}
//for checking number is positive or not
private boolean check(int n) {
	
	if(n==0)
	
	return false;
	else
	
	return true;
}



}
