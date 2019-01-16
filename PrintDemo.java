/**
 * 
 */

/**
 * @author tbalasubramaniyan
 *
 */
class Base
{
	public int a,b,c;
	Base(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}

}
public class PrintDemo  {


	static Base b=new Base(1,2,3);
    public static void main(String[] args) {	
	System.out.println(b.a+" "+b.b+" "+b.c);
	System.out.println(b.toString());
	
}
}
