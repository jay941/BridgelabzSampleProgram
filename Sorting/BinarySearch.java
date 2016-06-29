package com.bridgelab.sorting;

/*
*
*Perpose:ask the user what type element you wants,you can sort the integers,strings and doubles.
* you can search the word or integer or double in the array.if it is found show the position.
* this BinarySearch program is Generic type.
**/

public class BinarySearch
{
  public void sort()
  {
    try
    {
          String temp=null;//It is used to store temporary data.
          Utility u1=new Utility();
          SortingFunctions sf=new SortingFunctions();
    		//ask the user what type of data you wants
          		System.out.println("...enter any type of data....");
    			System.out.print("Enter array size :");
    			int arraysize2=u1.inputInteger();
    			String[] wordsArray=new String[arraysize2];
    			for(int i=0;i<wordsArray.length;i++)
    			{
    					System.out.print("Enter array["+i+"] : ");
    					wordsArray[i]=u1.inputString();
    			}
          for (int i=0;i<wordsArray.length;i++) //sorting logic
    			{
    				for (int j=i+1; j<wordsArray.length;j++)
    				{
    					if (wordsArray[i].compareTo(wordsArray[j])>0)
    					{
    						temp = wordsArray[i];
    						wordsArray[i]=wordsArray[j];
    						wordsArray[j]=temp;
    					}
    				}
    			}
          System.out.print("Words are in Sorted Order:");
    			sf.printArray(wordsArray);
          System.out.print("Enter the word  do you search in the array :");
    			String key=u1.inputString();
    			Integer lower=0,upper=wordsArray.length;
          Integer k=(sf.binarySearch(wordsArray,key,lower,upper));
          //int k=ks.intValue();
    			if(k==-1)
    			System.out.println(wordsArray[k]+" not found.");
    			else
    			{
    			int z=k+1;
    			System.out.println(wordsArray[k]+" is found at position "+z);
    			}
    			System.out.println();
    }//end of try
    catch(NumberFormatException nfe)
    {
      System.out.println("try to enter numbers only");
    }
  catch (ArrayIndexOutOfBoundsException ae)
  {
    System.out.println("Not Found");
  }
  catch(ClassCastException c )
  {
    System.out.println(c);
  }
}
	 public static void main(String[] args)
	  {
		    BinarySearch is=new BinarySearch();
		                  is.sort();
    }
}
