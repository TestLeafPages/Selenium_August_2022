package week7.day1;

import org.testng.annotations.Test;

public class TestCase2 {
							//packageName.ClassName.methodName
	@Test(dependsOnMethods = "week7.day1.TestCase1.test1")
	public void test2() {
		System.out.println("test2");

	}

}
