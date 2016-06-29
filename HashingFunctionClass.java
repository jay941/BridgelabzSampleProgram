package com.bridgelab.task;


public class HashingFunctionClass
{ //creating orderlist
  OrderedLinkedList[] order=new OrderedLinkedList[11];
  NodeUtility nu=new NodeUtility();
  public  HashingFunctionClass()
  {         //calling file reader method for reading file and storing into array
            int[] retArray = nu.integerFileReader();
            for(int i=0; i<retArray.length; i++)
            {
                int rem = retArray[i]%11;
                if(order[rem]== null)
                {
                    order[rem] = new OrderedLinkedList();
                    order[rem].addItem(retArray[i]);
                }
                else
                    order [rem].addItem(retArray[i]);
            }
            for(int i=0;i<11;i++)
            {    
                System.out.println(i );
                if(order[i] !=null)
                {
                    order[i].display();
                }
            }
    }
    public static void main(String[] args)
    {
      HashingFunctionClass hs=new HashingFunctionClass();
    }
  }
