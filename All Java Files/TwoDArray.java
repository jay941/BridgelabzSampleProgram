package com.bridgelab.task;


import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray
{
	
	
	
	
public static void main(String[] args) 
{
	char c1;
	
	  TwoDArray ta=new TwoDArray();
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Select Input type In Which You Want To Enter Number:-");
      System.out.println("1:-Enter the number in Integer ");
      System.out.println("2:-Enter the number in Double ");
      System.out.println("3:-Enter the number in Boolean ");
      int c=sc.nextInt();
      
      do{
      switch(c)
      {
      case 1:
			    	      System.out.println("Enter the m Number of row ");
			     		   	   int m=sc.nextInt();
			     		   	 System.out.println("Enter the n Number of Column ");
			     		   	   int n=sc.nextInt();
			     		   	  int arraym[][]=new int[m][n];
			     		   	   System.out.println("Enter values in  m*n  Number of row ");
			     		   	   for(int i=0;i<m;i++)
			     		   	   {
			     		   		   for(int j=0;j<n;j++)
			     		   		   {
			     		   		 arraym[i][j]=sc.nextInt();  
			     		   	   }
			     		   	   }
			     		System.out.println("----------------------------------");
			     		System.out.println("2 D Array Of Interger");
			     		for(int i=0;i<m;i++)
		     		   	   {
		     		   		   for(int j=0;j<n;j++)
		     		   		   {
		     		   		System.out.println(arraym[i][j]+ "\t" );
		     		   		
		     		   	   }
		     		   		System.out.println("\n");
		     		   	   }
break;
    	  
   	  case 2:
			   		  		
			   		
			   			
			    System.out.println("Enter the m Number of row ");
			   		   	   int m1=sc.nextInt();
			   		   	System.out.println("Enter the n Number of Column ");
			   			   int n1=sc.nextInt();
			   			   
			   			double arraym1[][]=new double[m1][n1];
			   			
			   		   	   System.out.println("Enter values in  m*n  ");
			   		   	 for(int i=0;i<m1;i++)
			   		 	   {
			   		 		   for(int j=0;j<n1;j++)
			   		 		 arraym1[i][j]=sc.nextDouble();  
			   		 	   }
			   		  System.out.println("----------------------------------");
			     		System.out.println("2 D Array Of double");
			     		for(int i=0;i<m1;i++)
		     		   	   {
		     		   		   for(int j=0;j<n1;j++)
		     		   		   { 
		     		   		System.out.println(arraym1[i][j]+ "\t" );
		     		   		
		     		   	   }
		     		   		System.out.println("\n");
		     		   	   }
			   		   	 
   		                   break;
      	  
      case 3:
				    	  System.out.println("Enter the m Number boolean value in row ");
				    	   int m2=sc.nextInt();
				    	System.out.println("Enter the n Number boolean value in column ");
				   	   int n2=sc.nextInt();
				   	
				   	boolean arr[][] = new boolean[m2][n2];
				   	
				   	for(int i=0;i<arr.length;i++)
				   	{
				   		Arrays.fill(arr[i], true);
				   	}
				   	
				   	System.out.println("----------------------------------");
		     		System.out.println("2 D Array Of boolean");
		     		for(int i=0;i<m2;i++)
	     		   	   {
	     		   		   for(int j=0;j<n2;j++)
	     		   		   {
	     		   		System.out.println(arr[i][j]+ "\t" );
	     		   		
	     		   	   }
	     		   		System.out.println("\n");
	     		   	   }
		     		 
    	            break;
      	   
    	  default:
    		 
   	  }
      System.out.println("You want to Continue:yes / No");
   	  
      c1 = sc.next().charAt(0);
      }while(c1 == 'Y'|| c1 == 'y');
      
	   

	   
	   
}







	

   	 
	
}

