package Utility;

public class stackOperation 
{
	
		   private int maxSize;
		   private long[] stackArray;
		   private int top;
		   int s=50;
		   public stackOperation (int s) 
		   {
		      maxSize = s;
		      stackArray = new long[maxSize];
		      top = -1;       
		   }
		   public void push(Character j) {
		      stackArray[++top] = j;
		   }
		   public long pop() {
		      return stackArray[top--];
		   }
		   public long peek() {
		      return stackArray[top];
		   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   public boolean isFull() {
		      return (top == maxSize - 1);
		   }

}