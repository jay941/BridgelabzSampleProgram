
package com.bridgelab.task;

import Utility.Utility;

public class Stopwatch 
{ 
	public long startstopwatch=0;
	public long endstopwatch=0;
	public long elapsed;
	
	
	//starting timer
	public void start()
	{
		startstopwatch=System.currentTimeMillis();
		System.out.println("Start Time is:"+startstopwatch);
		
	}
	//stoping time
	public void stop()
	{
   	  endstopwatch=System.currentTimeMillis();

	System.out.println("Stop Time is:"+endstopwatch);
	}
	
  public   long getElapsedtime( )
{
 	elapsed=endstopwatch-startstopwatch;
	return elapsed;

}
	public  static void main(String args[]) throws Exception
	{
 	Stopwatch s=new Stopwatch();
	Utility u=new Utility(); 
	System.out.println("Press 1 to start time");
	int a=u.inputInteger();
	s.start();
	System.out.println("Press 2 to stop time");
	int a1=u.inputInteger();
	s.stop();
	long t=s.getElapsedtime();
System.out.println("The total time elapsed is:-   "+t);


	}




    


}
