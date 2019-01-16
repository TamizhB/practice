package sample;

public class ThreadRunnableDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 Runnable runnable = () -> {
	            System.out.println("Runnable1-Inside : " + Thread.currentThread().getName());
	            try {
					Thread.sleep(10000);
				   } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        };
	      Runnable runnable2 = () -> {
	            System.out.println("Runnable2-Inside : " + Thread.currentThread().getName());
	        };
	        
	        Runnable runnable3=new Runnable(){
	        	
	        	public void run(){
	        		System.out.println("Runnable3"
	        				+ "-Inside : " + Thread.currentThread().getName());
	        	}
	        	
	        };
	        
	        Thread t=new Thread(runnable);
	        t.start();
	        
	        Thread t1=new Thread(runnable2);
	        t1.start();
	        Thread t2=new Thread(runnable3);
	        t2.start();
//	        String s1="abcdef";
//	        String s2="def";
//	        t1.join();
//	        System.out.println(s1.regionMatches(3, s2, 0, 2));
	        
	}
	
	
}
