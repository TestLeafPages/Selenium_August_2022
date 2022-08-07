package week1.day2;

public class LearnMethods {
// syntax of method
// accessModifier returnType methodName(args){}
// action no output -> void
// actions with output -> any datatype
	public void printMyName() {
		System.out.println("Testleaf");
	}
	
	public String getLocation() {
		return "Chennai";
	}
	
	public int addTwoNumbers(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// Syntax: Object of the class
		// ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		obj.printMyName();
		String location = obj.getLocation();
		System.out.println(location);
		int sum = obj.addTwoNumbers(5, 22);
		System.out.println(sum);
//		new LearnMethods() -> Object of the class
		new LearnMethods().getLocation();
		new LearnMethods().printMyName();
	}
	
}
