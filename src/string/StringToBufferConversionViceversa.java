package string;

public class StringToBufferConversionViceversa {

	public static void main(String[] args) {
	//String to StringBuffer conversion
		
		String s= "Manjunath Reddy";
		StringBuffer str = new StringBuffer(s);
		str=str.reverse();		
		System.out.println(str.reverse());
		
		StringBuffer sbr= new StringBuffer("Manjunath");
	 sbr.reverse();
		
	 System.out.println(sbr.reverse());
	 sbr.charAt(1);
	}

}
