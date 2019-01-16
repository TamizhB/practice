package sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public interface Downloader {
public void readFile(URL u) throws IOException;
public void WriteFile(String s) throws IOException;
default void proc()
{
	System.out.println("Download Finished..");
}
}
