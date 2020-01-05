package string;

public class StringOperations {

	public static void main(String[] args) {
		
		String s= "Chintamani is a big city";
		
		 s.length();
		System.out.println(s.length());
		s.charAt(3);
		System.out.println(s.charAt(3));
		s.indexOf("C");
		System.out.println(s.indexOf("C"));
		s.endsWith("i");
		System.out.println(s.endsWith("i"));
		s.startsWith("ta");
		System.out.println(s.startsWith("ta"));
		s.concat("Reddy");
		System.out.println(s.concat("Reddy"));
		s.toUpperCase();
		System.out.println(s.toUpperCase());
		s.toLowerCase();
		System.out.println(s.toLowerCase());
		s.hashCode();
		System.out.println(s.hashCode());
		s.substring(3);
		System.out.println(s.substring(3));
		s.trim();
		System.out.println(s.trim());
		s.lastIndexOf("big");
		s.indexOf("is");
		s.trim().substring(2,3).length();//method chaining
		s.trim().length();
		s.substring(3, 5).length();
		s.contains("sir");
		s.startsWith("city");
		s.lastIndexOf("a");
		
	}

}
