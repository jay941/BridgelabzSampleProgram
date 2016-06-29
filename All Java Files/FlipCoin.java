package com.bridgelab.task;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin 
{ //method for finding percentage
  private static double percentageoftail(int tails, int t) {
	
	
	
	return (100*tails)/t;
}


//checking number of tails
 private static int tnumberOfTails(int t) 

{ 
	 int tail=0;
	 Random r=new Random();
	for(int i=0;i<t;i++)
	{
		if(r.nextInt()<0.5)
			tail++;
		
	}
	return tail;
	}
//checking  the number
 public static boolean Nubercheck(int t)
    {
	if(t<0)
	{
		System.out.println("please enter positive integer");
       return false;
	  }
	else
		
	  return true;	
	}
public static void main(String[] args) 
{ 
	int t;
	FlipCoin h=new FlipCoin();
	Scanner sc=new Scanner(System.in);
	
	do{
		System.out.println("Enter the number of time to flip a coin");
		 t=sc.nextInt();
		
		
	}while(!Nubercheck(t));
	
	int tails=h.tnumberOfTails(t);
	double parcentagetail=h.percentageoftail(tails,t);
	System.out.println("Number of tail time "+tails);
	System.out.println("Number of head time"+(100-parcentagetail));
	
}


}
