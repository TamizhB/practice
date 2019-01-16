package sample;

import java.io.*;

public class FileReadOperation
{
	
  public static void main(String[] args) throws IOException 
  {
	  File F=new File("C:\\Users\\tbalasubramaniyan\\Daily records\\ex\\Threads - Copy.txt");
	  BufferedReader br=null;
	  String str=null;
	  try {
	  br=new BufferedReader(new FileReader(F));
	   while((str=br.readLine())!=null)
	        {
	        	System.out.println(str);
	        }
	        
            }
	  	catch(Exception ex)
	  	{
	  		System.out.println(ex);
	  	}
	  finally 
	  {
	  	br.close();
	  }
}
}