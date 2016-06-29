package Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelab.task.stock;


public class Utility 

{ private final String NAME = "<<name>>";
	private final String FULLNAME = "<<full name>> ";
	private final String MOBILE_NO = "xxxxxxxxxx";
	private final String DATE = "01/01/2016";
	BufferedReader br;

public Utility()
{
	 
	br=new BufferedReader(new InputStreamReader(System.in));
}


//reading double Input
	public double inputDouble(){

			try{
				try{
					return Double.parseDouble(br.readLine());
				}
				catch(NumberFormatException e){
					System.out.println(e);
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		return 0.0;
	}
	 //reading input string
		public String inputString()
	  {
			try {
				   return br.readLine();
			     }
			catch(Exception e){
				System.out.println(e);
			}
			return "";
		}
	//reading Integer Input
 public int inputInteger() 
{ 
	try{
		
	
	try{
		return Integer.parseInt(br.readLine());
	}catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	  
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return 0;
}
public int[] input1DArray(int arraySize){
	int array[]=new int[arraySize];
	for(int i=0;i<arraySize;i++){
		System.out.println("Enter array["+i+"] : ");
		array[i]=inputInteger();
	}
	return array;
}



//Print 1D array
public void print2DArray(int array[]){
	for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
	System.out.println();
}

//reading String input
public String inputString2()
{
try
{
	try
	{ return br.readLine();
		
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}catch(Exception e)
{
	System.out.println(e);
}
return null;
}
public String getFileText(String fileName){

		try{

			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
		 }
		catch(Exception exception){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException exception){
			}	
		}
	}
	
	//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

//Binary Search for integer
	public int binarySearch(int[] inputArr, int key) {
        	int start = 0;
        	int end = inputArr.length - 1;
        	while (start <= end) {
            		int mid = (start + end) / 2;
            		if (key == inputArr[mid]) {
                		return mid;
            		}
            		if (key < inputArr[mid]) {
               			 end = mid - 1;
            		} else {
               			 start = mid + 1;
            		}
        	}
         return -1;
   	 }

	 //Function take String in dd/MM/yyyy format and return Date Object
	public Date stringToDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			return (Date) sdf.parse(date);
		}
		catch(ParseException parseException){
			return null;
		}
	}
	//take input word
		public String inputWord(){
			try{
				return br.readLine();
			}
			catch(IOException exception){
				System.out.println(exception.getMessage());
			}
			return "";
		}

	
	//print 1D array String
		public void print1DStringArray(String array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
		}
		//Take 1D String Array Input
		public String[] input1DStringArray(int arraySize){
			String array[]=new String[arraySize];
			for(int i=0;i<arraySize;i++){
				System.out.println("Enter array["+i+"] : ");
				try{
					array[i]=br.readLine();
				}catch(Exception exception){
					System.out.println(exception.getMessage());
				}
			}
			return array;
		}

	//Binary Search for String
	public int binarySearchString(String[] names, String key) {
    		int first = 0;
    		int last  = names.length;
 
    		while (first < last) {
        		int mid = (first + last) / 2;
        		if (key.compareTo(names[mid]) < 0) {
           			 last = mid;
        		} else if (key.compareTo(names[mid]) > 0) {
            			first = mid + 1;
        		} else {
            			return mid;
        		}
    		}		
    		return -1;
	}

	//Bubble Sort for Integer
	public int[] bubbleSortInteger(int numbers[])
    	{
        	int temp;
 
        	for(int i = 0; i < numbers.length; i++)
       		{
            		for(int j = 1; j < (numbers.length -i); j++)
            		{
                	//if numbers[j-1] > numbers[j], swap the elements
                		if(numbers[j-1] > numbers[j])
                		{
                    			temp = numbers[j-1];
                   			numbers[j-1]=numbers[j];
                    			numbers[j]=temp;
                		}
           		 }
        	}
		return numbers;
    	}
	//Bubble sort for String
	public String[] bubbleSortString(String s[])
	{
    	String temp;

    	for(int i = 0; i < s.length; i++)
   		{
        		for(int j = 1; j < (s.length -i); j++)
        		{
            	// swap the elements
            		if(s[j-1].compareTo(s[j])>0)
            		{
                			temp = s[j-1];
               			s[j-1]=s[j];
                			s[j]=temp;
            		}
       		 }
    	}
	return s;
	}
// Insertion sort for String
	 public String[] insertionSort(String array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            String key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] .compareTo(key) <0) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	           
	        }
			return array;
	 }


//Insertion sort for integer
public int[] insertionSortInt(int array[]) {
       int n = array.length;
       for (int j = 1; j < n; j++) {
           int key = array[j];
           int i = j-1;
           while ( (i > -1) && ( array [i] <key) ) {
               array [i+1] = array [i];
               i--;
           }
           array[i+1] = key;
          
       }
		return array;
}

//stack of array
public ArrayList<stock> stockDetails(String filename)

{
	ArrayList<stock> slist =new ArrayList<>();
	try{
		br=new BufferedReader(new FileReader(filename));
		StringBuilder sb=new StringBuilder();
		String line=br.readLine();
		while(line!=null){
			System.out.println();
			System.out.println(line);
			slist.add(new stock(line));
			line=br.readLine();
		}
		return slist;
	 }
	catch(Exception exception){
		return null;
	}
	finally{
		try{
			br.close();
		}
		catch(IOException exception){
		}	
	}
	
	
	
}








}
