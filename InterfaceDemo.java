/**
 * 
 */

/**
 * @author tbalasubramaniyan
 *
 */
interface a
{
public void print();	
}
interface b
{
public void print2();	
}
interface c extends a,b
{
	default void print2()
	{
		System.out.println("Print");
	}
	;
}

public class InterfaceDemo implements c
{


	@Override
	public void print() {}
	public static void main(String[] args) {
		
    InterfaceDemo i =new InterfaceDemo();
	i.print2();
	}
    


}
