package com.bridgelab.task;

import java.util.Arrays;
import java.util.Scanner;



import Utility.Utility;
public class SearchLogic
{   public static long startstopwatch=0;
	public static long endstopwatch=0;
	public static long elapsed;
public static void main(String[] args)
{  Utility uu=new Utility();
	Scanner sc=new Scanner(System.in);
	
	
	
	char ch;
do{
	System.out.println("Enter Your choice");
	System.out.println("1 BinarySearch  For Integer");
	System.out.println("2 BinarySearch  For String");
	System.out.println("3 InsertionSort  For Integer");
	System.out.println("4 InsertionSort  For String");
	System.out.println("5 BubbleSort For Integer");
	System.out.println("6 BubbleSort For String");
	int c=sc.nextInt();
	
	
		switch (c) 
		{ 
		
		case 1:
			//retriving current time
			startstopwatch=System.currentTimeMillis();
			
			System.out.println("You selected  BinarySearch  For Integer");
			System.out.println("Enter Array Size");
			int arraySize=uu.inputInteger();
			int array[]=uu.input1DArray(arraySize);
			Arrays.sort(array);
			uu.print2DArray(array);
			System.out.println("Enter Key");
			int position=uu.binarySearch(array,uu.inputInteger());
			if(position==-1)
				System.out.println("Not Found");
			else
				System.out.println("Found at "+position+"Position");
			//timer
			 endstopwatch=System.currentTimeMillis();
			 elapsed=endstopwatch-startstopwatch;
			 System.out.println("Total ealpse time is:-  "+elapsed);
			break;
		case 2:
			
			startstopwatch=System.currentTimeMillis();
			
			System.out.println("You selected  BinarySearch  For String");
			System.out.println("Enter Array Size");
			int arraySize1=uu.inputInteger();
			String array1[]=uu.input1DStringArray(arraySize1);
			Arrays.sort(array1);
			uu.print1DStringArray(array1);
			System.out.println("Enter Key");
			int position1=uu.binarySearchString(array1,uu.inputWord());
			if(position1==-1)
				System.out.println("Not Found");
			else
				System.out.println("Found at "+position1+"Position");
			//timer
			 endstopwatch=System.currentTimeMillis();
			 elapsed=endstopwatch-startstopwatch;
			 System.out.println("Total ealpse time is:- "+elapsed);
		break;
		case 3:
			startstopwatch=System.currentTimeMillis();
			
			System.out.println("You selected  InsertionSort  For Integer");
			System.out.println("Enter Array Size");
			int arraySize5=uu.inputInteger();
			int array5[]=uu.input1DArray(arraySize5);
			uu.print2DArray(array5);
			System.out.println("Enter Key");
			int po3[]=uu.bubbleSortInteger(array5);
			System.out.println("Sorted Array is");
			for(int i=0;i<po3.length;i++)
			{
				System.out.println(po3[i]);
			}
			//timer
			 endstopwatch=System.currentTimeMillis();
			 elapsed=endstopwatch-startstopwatch;
			 System.out.println("Total ealpse time is:- "+elapsed);
			break;
		case 4 :
			
			startstopwatch=System.currentTimeMillis();
			
			System.out.println("You selected  InsertionSort  For String");
			System.out.println("Enter Array Size");
			int arraySize4=uu.inputInteger();
			
			String array4[]=uu.input1DStringArray(arraySize4);
			uu.print1DStringArray(array4);
			System.out.println("Enter Key");
			String po2[]=uu.insertionSort(array4);
			System.out.println("Sorted Array is");
			for(int i=0;i<po2.length;i++)
			{
				System.out.println(po2[i]);
			}
			//timer
			 endstopwatch=System.currentTimeMillis();
			 elapsed=endstopwatch-startstopwatch;
			 System.out.println("Total ealpse time is:-"+elapsed);
			break;
		case 5:
			startstopwatch=System.currentTimeMillis();
			
			System.out.println("You selected BubbleSort  For Integer");
			System.out.println("Enter Array Size");
			int arraySize2=uu.inputInteger();
			int array2[]=uu.input1DArray(arraySize2);
			uu.print2DArray(array2);
			System.out.println("Enter Key");
			int po[]=uu.bubbleSortInteger(array2);
			System.out.println("Sorted Array is");
			for(int i=0;i<po.length;i++)
			{
				System.out.println(po[i]);
			}
			//timer
			 endstopwatch=System.currentTimeMillis();
			 elapsed=endstopwatch-startstopwatch;
			 System.out.println("Total ealpse time is:-"+elapsed);
			
			break;
		case 6:
			startstopwatch=System.currentTimeMillis();
			
			System.out.println("You selected  BubbleSort  For String");
			
			System.out.println("Enter Array Size");
			int arraySize3=uu.inputInteger();
			String array3[]=uu.input1DStringArray(arraySize3);
			uu.print1DStringArray(array3);
			System.out.println("Enter Key");
			String po1[]=uu.bubbleSortString(array3);
			System.out.println("Sorted Array is");
			for(int i=0;i<po1.length;i++)
			{
				System.out.println(po1[i]);
			}
			//timer
			 endstopwatch=System.currentTimeMillis();
			 elapsed=endstopwatch-startstopwatch;
			 System.out.println("Total ealpse time is:-"+elapsed);
			break;
	

		default:
			System.out.println("Wrong Input");
			break;
		}
		
		System.out.println("\nDo you want to continue (Type y or n) \n");
        ch = sc.next().charAt(0); 
}while(ch=='Y'|| ch=='y');
}
}
