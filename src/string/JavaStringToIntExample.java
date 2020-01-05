package string;

public class JavaStringToIntExample {

	public static void main(String[] args) {
		//String s="fred";
		String s="100";
		//String to int conversion happens here
		try
		{
		int i=Integer.parseInt(s.trim());
		//print the value after conversion
		System.out.println("int i=" +i);
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberFormatException: "+nfe.getMessage());
		}
		}
	}

