package sample;


public class FinalDemo 
{
	static final int f;
	
	static
	{
		f=10;
	}
	
	public static void main(String[] args)
	{
		localVar();
	}
	public static void localVar()
	{   
		System.out.println(f);	
		//Until we declare any other local variable with the same name ,the static variable remains global
		float f=11;	
		System.out.println(f);
	}
	
}

class FinalCall extends FinalDemo
{
	
	static 
	{
		System.out.println(FinalDemo.f);
	}
}