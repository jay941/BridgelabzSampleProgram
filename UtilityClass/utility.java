package com.bridgelab.Utility;


import java.io.*;
import java.util.StringTokenizer;  

public class utility{

	BufferedReader bufferedReader;
	StringTokenizer tok;

	public utility(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	//Take Statement And return Array of words
	public String[] wordsArrayFromStatement(String statement){	
		tok=new StringTokenizer(statement," ");
		String words[]=new String[tok.countTokens()];
		int i=0;
		while(tok.hasMoreTokens()){
			words[i]=tok.nextToken();
			i++;
		}
		return words;
	}

	
	
	//take input word
	public String inputWord(){
		try{
			return bufferedReader.readLine();
		}
		catch(IOException exception){
			System.out.println(exception.getMessage());
		}
		return "";
	}

	//Take Integer Input
	public int inputInteger(){
		 
			try{
				try{	
					return Integer.parseInt(bufferedReader.readLine());
				}
				catch(NumberFormatException exception){
					System.out.println(exception.getMessage());	
				}
			}catch(IOException exception){
				System.out.println(exception.getMessage());
			}
		return 0;
	}
	
	//Take 1D Array Input
	public int[] input1DArray(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			array[i]=inputInteger();
		}
		return array;
	}

	//Take 1D String Array Input
	public String[] input1DStringArray(int arraySize){
		String array[]=new String[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			try{
				array[i]=bufferedReader.readLine();
			}catch(Exception exception){
				System.out.println(exception.getMessage());
			}
		}
		return array;
	}

	//Print 1D array
	public void print2DArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	//print 1D array String
	public void print1DStringArray(String array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
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
}

        
        
        
        
        
        
        
        
        
        
	 	 
	 
	 
	 
	 
	 
	 
	 
	 