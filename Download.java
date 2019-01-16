package sample;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Download implements Downloader {
static String context=null;
BufferedReader br;

	@Override
	public void readFile(URL u) throws IOException {
		String line;
		try {
        br = new BufferedReader(
        new InputStreamReader(u.openStream()));
        while((line=br.readLine())!=null)
        {
        	context +=line;
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

	@Override
	public void WriteFile(String str) throws IOException
	{
		  File F=new File(str);
		  BufferedWriter bw=null;
		  try {
		  bw=new BufferedWriter(new FileWriter(F));
		   bw.write(context);
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
	
	
	public static void main(String[] args) throws IOException 
	{
		URL u=new URL("https://www.tutorialspoint.com/index.htm");
		String str="C:\\Users\\tbalasubramaniyan\\Daily records\\ex\\Saved.html";
		Download d=new Download();
		
		d.readFile(u);
		d.WriteFile(str);
		d.proc();
		
	}

}
