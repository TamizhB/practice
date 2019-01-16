package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOperation {

	public static void main(String[] args) throws IOException {
		
		
	  File F=new File("C:\\Users\\tbalasubramaniyan\\Daily records\\ex\\Threads - Copy1.txt");
	  BufferedWriter bw=null;
	  String str="Ex \n Runnable r=()->System.out.println(\" Thread is running \")";
	  try {
	  bw=new BufferedWriter(new FileWriter(F,true));
	   bw.write(str);
	  }
	  	catch(Exception ex)
	  	{
	  		System.out.println(ex);
	  	}
	  finally 
	  {
	  	bw.close();
	  }

}
}