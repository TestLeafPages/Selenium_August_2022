package week9.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		int[] num = { 10, 20, 30 };

		try {
			
			try {
				System.out.println(x / y);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			System.out.println(num[3]);
		} 
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of Program");

	}

}
