package sample;


public class StaticDemo 
{
static int var1=10;
static int var2=var1+10;
int var4=100;
	public static void main(String[] args) 
	{
//		A static variable can be accessed before any object of the class exists.
		System.out.println(var1+" "+var2);
//		Cannot use this in static context  --this.printStatic();
		
//A static method can only call other static methods only.
		//Error-- System.out.println(printStatic());
		System.out.println(printStatic2());
		setStaticVar(100);
		System.out.println(printStatic2());
	}
		
	
	public static void setStaticVar(int val)
	{
		var2=val;
	}
	public static int printStatic2()
	{
		int var3=var2+10;
		//A static method can access static data only. Error-->var4=10;
		return var3;
	}
	
	
}





