package selectClassMethods;

import java.util.ArrayList;

public class ArrayList1{

	public static void main(String[] args) 
	
	{
	
	ArrayList<String> al=new ArrayList<String>(); //Creating arraylist
	
	//Adding elements to arraylist 
		al.add("QSPIDER");
		al.add("JSPIDERS");
		al.add("Rajesh");
//to get the size 
	int count = al.size();
	System.out.println(count);
	
	//to get all the data
	for(int i=0; i<=count-1; i++)
		
	{
		String data = al.get(i);
		System.out.println(data);
	}
	
	}
	
}