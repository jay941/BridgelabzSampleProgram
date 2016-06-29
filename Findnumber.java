package com.bridgelab.task;

import static java.lang.Math.pow;


import Utility.Utility;
public class Findnumber
{
	static int range,c,lower,upper,middle;
	static String input;
	public  static void binarySearch(int lower,int upper,int middle,int c,String input,int num)
   {
       Utility u2=new Utility();
       System.out.println("Is your number:"+middle);
       System.out.println("If this is your number then enter yes else enter range i.e low or high as Input");
	    input=u2.inputString();
       do
        {
            if (input.equals("high"))
            {
                lower= middle++;
                c++;
            }
			else if (input.equals("yes"))
            {
                System.out.println("the number you thought was "+middle);
                int ts=c+1;
                System.out.println("It takes "+ts+" times to find your  exact number.");
                break;
            }
			else if(input.equals("low"))
            {
                upper=middle--;
                c++;
            }
            if(c<num)
            {
				//finding middle again
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				System.out.println("If this is your number then enter yes else enter range i.e low or high as Input");
				input=u2.inputString();
			}
		}while(lower<=upper);
			if (c>num)
			{
			  System.out.println("Number is not found");
			}
	}
	  public static void main(String[] args)
    {
			try
				{
						Utility u1=new Utility();
					  System.out.println("Enter any number");
						//ask the user enter number
		        int num=u1.inputInteger();
		        range=(int)pow(2,num)-1;//range calculation for the number
		        System.out.println("assume your number between 0 to "+range);
		        c=0;
						input=null;
		        lower=0;
		        upper=range;
		        middle=(lower+upper/2);
		   
						Findnumber.binarySearch(lower,upper,middle,c,input,num);//this is calling method to pass arguments
					}
					catch (ArrayIndexOutOfBoundsException ae)//exception handling
					{
						System.out.println("try to enter value at runtime only");
					}
    	}
 }
