package alertInterfaceMethods;

import java.time.LocalDate;
import java.util.Date;

public class PrintFutureDateMonthYears {

	public static void main(String[] args) {
		
		Date d= new Date();
		System.out.println(d);
		LocalDate today= LocalDate.now();
		System.out.println(today);
		
		LocalDate tom= today.plusDays(1);
		System.out.println(tom);
		
		LocalDate nextweek= today.plusWeeks(1);
		System.out.println(nextweek);
		
		LocalDate nextmon=today.plusMonths(1);
		System.out.println(nextmon);
		
		LocalDate nextyear=today.plusYears(1);
		System.out.println(nextyear);
		
	}
}	

