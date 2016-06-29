package com.bridgelab.task;
import java.util.Scanner;

import Utility.stackOperation;

public class BalancedParentheses 
 {
   public static void main(String[] args) 
   
   {
	  
     Scanner sc=new Scanner(System.in);
	 
	 String expression;
     
     System.out.println("Please type a string containing various kinds");
     System.out.println("of parentheses ( ) { } [ ]. I'll check whether");
     System.out.println("the parentheses are balanced.");

     
     { //taking input from user
    	 System.out.print("Your string: ");
             expression = sc.nextLine( );
             //check expression is balanced or not
          if (isBalanced(expression))
                System.out.println("That is balanced.");
             else
                System.out.println("That is not balanced.");
          }
          while (query(sc, "Another string?"));

          System.out.println("Thanks for that balancing act.");
       }

       private static boolean isBalanced(String expression) 
       {   
    	   int s=50;
    	   //creating stack 
    	   stackOperation sp=new stackOperation( s);
    	   {
    		      // Meaningful names for characters
    		      final char LEFT_NORMAL  = '(';
    		      final char RIGHT_NORMAL = ')';
    		      final char LEFT_CURLY   = '{';
    		      final char RIGHT_CURLY  = '}';
    		      final char LEFT_SQUARE  = '[';
    		      final char RIGHT_SQUARE = ']';
    		      
    		      stackOperation store = new stackOperation( s); // Stores parens
    		      int i;                              // An index into the string
    		      boolean failed = false;             // Change to true for a mismatch
    		      
    		      for (i = 0; !failed && (i < expression.length( )); i++)
    		      {
    		         switch (expression.charAt(i))
    		         {
    		            case LEFT_NORMAL:
    		            case LEFT_CURLY:
    		            case LEFT_SQUARE: 
    		               store.push(expression.charAt(i));
    		               break;
    		            case RIGHT_NORMAL:
    		               if (store.isEmpty( ) || (store.pop( ) != LEFT_NORMAL))
    		                  failed = true;
    		               break;
    		            case RIGHT_CURLY:
    		               if (store.isEmpty( ) || (store.pop( ) != LEFT_CURLY))
    		                  failed = true;
    		               break;
    		            case RIGHT_SQUARE:
    		               if (store.isEmpty( ) || (store.pop( ) != LEFT_SQUARE))
    		                  failed = true;
    		               break;
    		         }
    		      }
    		      
    		      return (store.isEmpty( ) && !failed);
    		   }

    		
       }   
    	   
    public static boolean query(Scanner input, String prompt)
       {
          String answer;
    	
          System.out.print(prompt + " [Y or N]: ");
          answer = input.nextLine( ).toUpperCase( );
          while (!answer.startsWith("Y") && !answer.startsWith("N"))
          {
    	 System.out.print("Invalid response. Please type Y or N: ");
    	 answer = input.nextLine( ).toUpperCase( );
          }

          return answer.startsWith("Y");
       }
}

