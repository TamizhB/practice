/**
 * 
 */
package sample;

/**
 * @author tbalasubramaniyan
 *
 */
import java.util.*;
class ListDemo
{ 
	public static void main(String[] args) 
	{ 
		final List<String> l = new LinkedList<String>(); 
        List<String> l2 = new LinkedList<String>(); 
        List<String> l3 = new LinkedList<String>(); 
	    l2=l3;
      	l=l3;
        System.out.println(l.toString()); 
	
		l.add("ForGeeks"); 
		
		System.out.println(l.toString()); 
	}	 
} 
