package com.bridgelab.task;

import java.io.*;


import Utility.Utility;
public class sum{

	public static void main(String args[])
{
		Utility utility=new Utility();
sum s=new sum();
		System.out.println("Enter Size of Array (N):");
		int arraySize=utility.inputInteger();
		int array[]=utility.input1DArray(arraySize);
		utility.print2DArray(array);
              

		s.findDistinctTriples(array);

	}

	public static int findDistinctTriples(int array[])
	{   int s=0,n=0;
		      // Fix the first element as A[i]
			for(int i=0;i<array.length;i++)
			{
			 // Fix the second element as A[j]
			for(int j=i+1;i<array.length;j++)
			{
				 // Now look for the third number
			for(int k=j+1;k<array.length;k++)
			{
					
			if(array[i]+array[j]+array[k]==s)
			{
						
			System.out.println(i+" "+j+" "+k+" = "+"0");
						
			n++;	
			}
				}
			}
		}
// If we reach here, then no triplet was found
		return n;

	}

	
}
