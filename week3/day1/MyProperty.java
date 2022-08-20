package week3.day1;

public class MyProperty {
public static void main(String[] args) {
	GrandFather gfather = new GrandFather();
	gfather.villaBoatClub();
	gfather.car(); //A
	
	Father father = new Father();
	father.villaAdayar();
	father.villaBoatClub();
	father.car(); //A
	
	Child child = new Child();
	child.villaThiruvanmiyur();
	child.villaAdayar();
	child.villaBoatClub();
	child.car(); //W
	
	child.ourCar();
}
}
