package testcase;

import org.testng.annotations.*;

public class LearnAnnotations {
	@Test
	public void test1() {
		System.out.println("\t Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("\t Test 2");
	}

	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void as() {
		System.out.println("After Suite");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void at() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void bc() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void ac() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
}
