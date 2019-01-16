package sample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class CallableDemo implements Callable 
{ 
	
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		
		Future[] f=new FutureTask[5];

		for(int i=0;i<5;i++)
		{
		Callable c=new CallableDemo();
		f[i]=new FutureTask(c);
		Thread t=new Thread((Runnable) f[i]);
		t.start();
	    }
		for (int i = 0; i < 5; i++) 
	    { 
	  f[i].isDone();
	      System.out.println(f[i].get());
	    }
		
	}
	@Override
	public Object call() throws Exception 
	{
		Thread.sleep(1000);
	   String str="Terminated";
		return str;
	}
  
} 