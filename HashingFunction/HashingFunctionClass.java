package com.bridgelab.Hash;

import com.bridgelab.Hash.Utility;
import com.bridgelab.Hash.OrderedLinkedList;
import com.bridgelab.Hash.NodeUtility;
public class HashingFunctionClass
{
  OrderedLinkedList[] order=new OrderedLinkedList[11];
  NodeUtility nu=new NodeUtility();
  public  HashingFunctionClass()
  {
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
