package com.bridgelabz.unordered;
import com.bridgelabz.unordered.Node;
import com.bridgelabz.unordered.NodeUtiliy;
/
import com.bridgelabz.unordered.Utility;
public class UnorderedLinkedList
{
  static  Node start;
  Utility  u1=new Utility();
  NodeUtiliy nu=new NodeUtiliy();
  public UnorderedLinkedList()
  {
    try
    {
        start=nu.readFile(start);
        System.out.print("Enter the word to search :");
        String word1=u1.inputString();
        //Search the word
        start=nu.searchData(start,word1);
        String word2=" ";
        while(start!=null)
        {
          word2=word2+start.data;
          word2=word2+" ";
          start=start.nextNode;
        }
          //  u1.writeToFile(start);
          nu.writeDataToFile(word2);
        }catch(NullPointerException n)
        {
          System.out.println(n);
        }
  }  //End of method
  public static void main(String[] args)
   {
     UnorderedLinkedList un=new UnorderedLinkedList();
   }
}
