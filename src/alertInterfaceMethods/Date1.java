package alertInterfaceMethods;

import java.util.Date;

public class Date1 {
	

	public static void main(String[] args) {
		
		Date d= new Date();
		System.out.println(d);
		//to convert date to string
		
		String str = d.toString();
		System.out.println(str);
		
		//to split the date in string format
		String[] s= str.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
	}
	
}	
