package week3.day1;

public class LearnOverloading {
	public static void main(String[] args) {
		LearnOverloading obj = new LearnOverloading();
		obj.add(1, 2);
		obj.add(0.003F, 0.5432F);
		obj.add(1, 2, 3);
	}
public void add(int a, int b) {
	System.out.println(a+b);
}
public void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
public void add(float a, float b) {
	System.out.println(a+b);
}
}
