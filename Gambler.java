package com.bridgelab.task;

import java.util.Scanner;

public class Gambler
{
public static void main(String[] args)
{  
 Scanner sc=new Scanner(System.in);
    //asking input from user
    System.out.println("Enter stake");

	int stake=sc.nextInt();
	System.out.println("Enter goal");
	int goal=sc.nextInt();
	System.out.println("Enter time");
			
	int numberOftime=sc.nextInt();

        int bets = 3;        
        int wins = 0;       
      for (int i = 0; i < numberOftime; i++) 
         {
        int cash = stake;
           while (cash > 0 && cash < goal) 
           { 
            bets++;
            if (Math.random() < 0.5)
							cash++;     
            
              else                     
                	cash--;     
                 }
            if (cash == goal) 
            	wins++;            
        }

       
     System.out.println(wins + " wins of " + numberOftime);
 	System.out.println("Percent of games won = " + 100.0 * wins / numberOftime);
 	System.out.println("Percent of game Loss = "+((100)-(100.0 * wins / numberOftime)));
    }

	
	
}

