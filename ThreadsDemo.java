package sample;

public class ThreadsDemo extends Thread 
{
	public static void main(String[] args) {
		ThreadsDemo td=new ThreadsDemo()
		{
			public void run()
		{
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Abc");			
		}
	};
		td.setName("Thread1");
		 td.start();
		    while(true) { 
		    	
		      Thread.State state = td.getState();
		      System.out.println(state);
		      if (state == Thread.State.TERMINATED) break;
		    }
		
	}



}
