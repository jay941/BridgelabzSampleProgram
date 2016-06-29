package com.bridgelab.task;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrom {
   public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter string: ");
      String str = sc.nextLine();
 //creating dqueue
      Deque<Character> queue = new LinkedList<Character>();
 
      for(int i=0; i<str.length(); i++){
         queue.addFirst(str.charAt(i));
      }
 
      String str2 = "",reverse = ""; 
      while( queue.peek() != null ){
        str2 = str2 + queue.remove(); 
        System.out.println(str2); 
      
      
     
      
      }
      int s=str2.length();
      for ( int i =s - 1; i >= 0; i-- )
          reverse = reverse + str.charAt(i);
  
       if (str.equals(reverse))
          System.out.println("Entered string is a palindrome.");
       else
          System.out.println("Entered string is not a palindrome.");
      
      
   }
   
   
   
   
   
}
