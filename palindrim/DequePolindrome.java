
package com.bridgelabz.sortings;
import com.bridgelabz.utility.Polindromeutility;
import com.bridgelabz.utility.Utility;
public class DequePolindrome {

	   public static  void Polindrome()
	    { //creating utility object
		   Utility u1= new Utility();
        //creating dqueue object
	       	Polindromeutility<Character> deqobj =new Polindromeutility<Character>();
         //asking input frim user
	        System.out.println("Enter a String to Check Polyndrome");
	        String checkString = u1.inputString();
        //adding data to the queue
	        for(int i=0; i<checkString.length();i++)
	        {
	            char c = checkString.charAt(i);
	            deqobj.addRear(c);
	        }
	        int count=0;
       //comparing  data from queue
	        while(deqobj.size() > 1)
	        {
	            if(deqobj.removeFront() != deqobj.removeRear())
	            {
	                count++;
	                break;
	            }
	        }
	        if(count==0)
	        {
	            System.out.println("String is Polyndrome");
	        }
	        else
	        {
	            System.out.println("String is Not Palindrome");
	        }
	    }

			public static void main(String [] args)
{
				DequePolindrome.Polindrome();
	}
	

	}
