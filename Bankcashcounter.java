package com.bridgelab.task;
import java.util.LinkedList;
import java.util.Scanner;
import Utility.qutility;

 public class Bankcashcounter 
   { 
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		qutility qu=new qutility();
	   Bankcashcounter bcc=new Bankcashcounter();
	   
	   
	  System.out.println("**********welcom to Simulate Banking Cash Counter************");
	       char ch = 0;
	   do
	   {   System.out.println("Enter 1 for Deposit");
		   System.out.println("Enter 2 for Withdrow");
		   System.out.println("Enter 3 for People in the queue");
		   int a=sc.nextInt();
		  //calling switch case for multiple choice
		   switch (a) 
		   {
		case 1:
			  System.out.println("Enter the amount you want to Deposit");
			   qu.insert(sc.nextInt()); 
	           qu.display();
			   break;
		case 2:
			System.out.println("Enter the amount you want to Withdrow ");
			int w=sc.nextInt();
		    qu.remove();
			System.out.println("Available banance is"); 
			qu.display();
			break;
		case 3:
				int s=qu.getSize();
				System.out.println(s);
				break;
		default : 
               System.out.println("Wrong Entry \n ");
               break;
		   }
		   System.out.println("\nDo you want to continue (Type y or n) \n");
           ch = sc.next().charAt(0); 
	   }while(ch == 'Y'|| ch == 'y');
	   
	
	}		
}	
  
	   
	

