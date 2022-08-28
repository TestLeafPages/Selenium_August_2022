package week4.day2;

public class LearnExceptions {
	public void run() throws InterruptedException {
		Thread.sleep(2000);
	}
public static void main(String[] args) throws InterruptedException {
	LearnExceptions obj = new LearnExceptions();
	obj.run();
	try {
	System.out.println(4/0);
	}catch(ArithmeticException exp) {
		
		System.err.println("You are trying to divide the number by 0. Pls dont do it");
			throw new ArithmeticException();
	}catch(Exception exp) {
		System.err.println("You are trying to divide the number by 0. Pls dont do it");
	}finally {
		System.out.println("The calculation is completed");
	}
	System.out.println("Hello World");
}
}
