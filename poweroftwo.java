package com.bridgelab.task;

public class poweroftwo 
{

	
	
	public static void main(String ar[])

{            //taking command line arguments
		int n=Integer.parseInt(ar[0]);
		if(n>0 && n<31)
		{
		for(int i=0;i<n;i++)
{
			System.out.println("2 ^ "+i+" "+Math.pow(2,i));
}
		}
		else
		{
			System.out.println("please Enter numbner range between 1 to 31");
		}
		
		
		
}
}
