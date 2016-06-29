package com.bridgelab.sorting;

/*

*Perpose:ask the user what type element you wants,sort the integers,strings and doubles.
* this BubbleSort program is Generic type.
**/

public class BubbleSort
{
	public void sorting()
	{
			Utility u1=new Utility();
			SortingFunctions sf=new SortingFunctions();
			//ask the user what type of data he wants
			System.out.println("press 1 for integers data");
			System.out.println("press 2 for strings data");
			System.out.println("press 3 for doubles data");
			int data=u1.inputInteger();
			switch(data)
			{
			case 1:
			//int integer=u1.inputInteger();
			System.out.print("Enter array size :");
		  	int arraysize1=u1.inputInteger();
			Integer[] intArray=new Integer[arraysize1];
			for(int i=0;i<arraysize1;i++)
			{
					System.out.print("Enter array["+i+"] : ");
					intArray[i]=u1.inputInteger();
			}
			Integer[] inputArray=(Integer[])sf.elementSort(intArray);
			System.out.println("...Integers sorting...");
			for(Integer el:inputArray)
			{
				System.out.print(el+" ");
			}
			System.out.println();
			break;
			case 2:
			System.out.print("Enter array size :");
			int arraysize2=u1.inputInteger();
			String[] inputstring=new String[arraysize2];
			for(int i=0;i<arraysize2;i++)
			{
					System.out.print("Enter array["+i+"] : ");
					inputstring[i]=u1.inputString();
			}
			String[] arrayString=(String[])sf.elementSort(inputstring);
			System.out.println("...Strings sorting...");
			for(String ss:arrayString)
			{
			System.out.print(ss+" ");
			}
			System.out.println();
			break;
			case 3:
			System.out.print("Enter array size :");
			int arraysize3=u1.inputInteger();
			Double[] inputdouble=new Double[arraysize3];
			for(int i=0;i<arraysize3;i++)
			{
					System.out.print("Enter array["+i+"] : ");
					inputdouble[i]=u1.inputDouble();
			}
			Double[] arrayDouble=(Double[])sf.elementSort(inputdouble);
			System.out.println("...doubles sorting...");
			for(Double dd:arrayDouble)
			{
			System.out.print(dd+" ");
			}
			System.out.println();
			break;
	   }//end of switch
}
	public static void main(String[] args)
	{
		BubbleSort bs=new BubbleSort();
		bs.sorting();
	}//end of main
}
