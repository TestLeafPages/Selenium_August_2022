package week3.day1;

public class LearnStatic {
int a = 5;
static int b = 5;
final int c = 5;
public void i   ncrease() {
	a++;
	c++;
}
public static void increaseB() {
	b++;
}

public static void main(String[] args) {
	LearnStatic obj1 = new LearnStatic();
	System.out.println(obj1.a);
	obj1.increase();
	System.out.println(obj1.a);
	
	LearnStatic obj2 = new LearnStatic();
	System.out.println(obj2.a);
	
	/*System.out.println(LearnStatic.b);
	LearnStatic.increaseB();
	System.out.println(LearnStatic.b);
	LearnStatic.b++;
	System.out.println(LearnStatic.b);*/
	
}
}
