package week9.day1;

public class LearnThrow {
	
	public int divide(int num1, int num2) {
		int result = 0;
		if(num1 < num2) {
			throw new ArithmeticException("Inappropriate inputs");
			
		}else {
			result = num1/num2;
		}
			
		return result;
	}

	public static void main(String[] args) {
		LearnThrow lt = new LearnThrow();
		int res = lt.divide(5, 10);
		System.out.println(res);
		
		
	}
}
