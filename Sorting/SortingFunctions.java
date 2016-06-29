package com.bridgelab.sorting;
public class SortingFunctions<E>
{
  //BubbleSort of Generic
  public E[] elementSort(E inputArray[])
  {
      System.out.println("===========================");
      E[] e=inputArray;
      if(inputArray instanceof Integer[])
      {
        for(int i=1; i<=inputArray.length;i++)
        {
            for(int j = 0;j<(inputArray.length -j);j++)
            {
              //if numbers[j-1] > numbers[j], swap the elements
              if(((Integer)e[j]) >((Integer)e[j+1]))
                {
                  E temp= e[j];
                  e[j]=e[j+1];
                  e[j+1]=temp;
                }//end of if
             }
             System.out.println("printing the pass "+i);
             printArray(inputArray);
         }
      }//end of if
      else if(inputArray instanceof Double[])
      {
        for(int pass=1;pass<=inputArray.length;pass++)
        {
            for(int current=0;current<(inputArray.length-pass);current++)
            {
              //if numbers[j-1] > numbers[j], swap the elements
              if(((Double)e[current])>((Double)e[current+1]))
                {
                  E temp= e[current];
                  e[current]=e[current+1];
                  e[current+1]=temp;
                }//end of if
             }
             System.out.println("printing the pass "+pass);
             printArray(inputArray);
         }
      }//end of else if
      else if(inputArray instanceof String[])
      {
          for (int pass=1;pass<=inputArray.length;pass++ )
          {
              for (int current=0;current<inputArray.length-pass;current++ )
              {
                       if ( ((String)e[current]).compareToIgnoreCase(((String)e[current+1])) > 0)
                        {         // ascending sort
                                  E  temp=e[current];
                                    e[current] =e[current+1];    // swapping
                                    e[current+1]=temp;
                         }//end of if
                 }
                 System.out.println("printing the pass "+pass);
                 printArray(inputArray);
           }
      }//end of else if
      System.out.println("===========================");
      return e;
  }
  public void printArray(E[] numbers)
  {
    int len=numbers.length;
    for(int i=0;i<len;i++)
    {
    System.out.print(numbers[i]+" ");
    }
    System.out.println();
  }
  // insertion sort of Generic
  public E[] dataSort(E inputArray[])
  {
      System.out.println("===========================");
      E[] e=inputArray;
      if(inputArray instanceof Integer[])
      {
        int pass;
        for(pass=1; pass<=inputArray.length-1;pass++)
        {
            int key=(Integer)inputArray[pass];
            E key1=inputArray[pass];
            int i=pass-1;
            while((i>-1) && ((Integer)inputArray[i]>key))
            {
                inputArray[i+1]=inputArray[i];
                i--;
            }//end of while
                inputArray[i+1]=key1;
             System.out.println("printing the pass "+pass);
             printArray(inputArray);
         }
      }//end of if
      else if(inputArray instanceof Double[])
      {
        int pass;
        for(pass=1;pass<=inputArray.length-1;pass++)
        {
            double key=(Double)inputArray[pass];
            E key1=inputArray[pass];
            int i=pass-1;
            while((i>-1) && ((Double)inputArray[i]>key))
            {
                inputArray[i+1]=inputArray[i];
                i--;
            }//end of while
                inputArray[i+1]=key1;
             System.out.println("printing the pass "+pass);
             printArray(inputArray);
         }
      }//end of else
      else if(inputArray instanceof String[])
      {
        int pass;
          for (pass=1;pass<=inputArray.length-1;pass++ )
          {
                String key=(String)inputArray[pass];
                E key1=inputArray[pass];
                int i=pass-1;
                while((i>=0))
                {
                  if(key.compareTo((String)inputArray[i])>0)
                  {
                    break;
                  }
                  inputArray[i+1]=inputArray[i];
                  i--;
                }//end of while
                  inputArray[i+1]=key1;
             System.out.println("printing the pass "+pass);
             printArray(inputArray);
           }
         }
      System.out.println("===========================");
      return e;
    }//end of method
//bianry search 
      public Integer binarySearch(E[] wordsArray, String key, int lower, int upper)
      {
          E[] e=wordsArray;
          if(wordsArray instanceof String[])
          {
            if (lower>upper)
                 {
                     return -1;
                 }
                 Integer middle=(upper+lower)/2;
                 if (wordsArray[middle].equals(key))
                 {
                    return middle;
                 }
                 else if(((String)wordsArray[middle]).compareTo(key) > 0)
                 {
                     return binarySearch(wordsArray,key,lower, middle-1);
                 }
                 else
                 {
                     return binarySearch(wordsArray,key,middle+1,upper);
                 }
          }//end of if
        return 0;
      }
}
