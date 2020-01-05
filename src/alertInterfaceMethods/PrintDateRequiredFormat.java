package alertInterfaceMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateRequiredFormat {

	public static void main(String[] args) {
		
		//to get the date
		Date d= new Date();
		System.out.println(d);
		
		SimpleDateFormat s= new SimpleDateFormat("dd");
		String day = s.format(d);
		System.out.println(day);
		
		SimpleDateFormat s2= new SimpleDateFormat("MMMM");
		String month = s2.format(d);
		System.out.println(month);
		
		SimpleDateFormat s3= new SimpleDateFormat("YYYY");
		String year = s3.format(d);
		System.out.println(year);
		
		SimpleDateFormat s4=new SimpleDateFormat("HH:MM:SS");
		String time = s4.format(d);
		System.out.println(time);

	}

}
