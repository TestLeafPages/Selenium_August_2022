package week1.day2;

public class LearnString {
public static void main(String[] args) {
	// String literal
	String name1 = "testleaf";
	// String object
	String name2 = new String("testleaf");
	
	int size = name1.length();
	System.out.println(size);
	
	String upperCase = name1.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = upperCase.toLowerCase();
	System.out.println(lowerCase);
	
	boolean equals = lowerCase.equals(upperCase);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = lowerCase.equalsIgnoreCase(upperCase);
	System.out.println(equalsIgnoreCase);
	
	String text = "testleaf is in chennai";
	boolean contains = text.contains("testleaf");
	System.out.println(contains);
	
}
}
