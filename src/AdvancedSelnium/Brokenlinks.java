package AdvancedSelnium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Brokenlinks {
	
	
	public static void main(String[] args) throws IOException
	{
		
		
		
		URL url = new URL("https://www.google.com");
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		int code = con.getResponseCode();//if code is 200, then it is broken link
		System.out.println(code);
		String mesg=con.getResponseMessage();//if msg is ok then it is not broken link
		System.out.println(mesg);
		
		
		
	}
			
	

}
