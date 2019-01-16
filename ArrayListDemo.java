package sample;

import java.util.Arrays;
public class ArrayListDemo 
{
 
    private Object[] list;
    private int currentSize = 0;
     
    public ArrayListDemo()
    {
        list = new Object[10];
    }
     
    public Object get(int index){
        if(index < currentSize)
        {
            return list[index];
        } 
        else
        {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    
    public void add(Object element){
        if(list.length-currentSize<=2){
            increaseSize();
        }
        list[currentSize++] = element;
    }
    
     
    public Object remove(int index){
    	
        if(index < currentSize){
            Object obj = list[index];
            list[index] = null;
            int tmp = index;
            while(tmp < currentSize){
                list[tmp] = list[tmp+1];
                list[tmp+1] = null;
                tmp++;
            }
            currentSize--;
            if(list.length > currentSize*2)
            	decreaseSize();
            return obj;
        } 
        else 
        {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return currentSize;
    }
     
    private void increaseSize(){
        list = Arrays.copyOf(list, list.length*2);
        System.out.println("Capacity increased to: "+list.length);
    }
    
    private void decreaseSize(){
        list = Arrays.copyOf(list, list.length/2);
        System.out.println("Capacity reduced to: "+list.length);
    }
     
    public static void main(String a[])
    {
        ArrayListDemo Al = new ArrayListDemo();
        Al.add(10);
        Al.add(9);
        Al.add(8);
        Al.remove(0);
        for(int i=0;i<Al.size();i++)
        System.out.println(Al.get(i));
        
  
        System.out.println(Al.toString());
        }
}