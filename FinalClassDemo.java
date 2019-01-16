/**
 * 
 */

/**
 * @author tbalasubramaniyan
 *
 */

class Base
{
    public int a, b, c;

    /**
     * @param a
     * @param b
     * @param c
     */
    public Base(int a, int b, int c)
    {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

}

public class FinalClassDemo
{

    public static void main(String[] args) {
        final Base b = new Base(1, 2, 3);
        Base c = new Base(4, 5, 6);
        System.out.println(b.a);
        b.setA(3);
        b = c;
    }

}
