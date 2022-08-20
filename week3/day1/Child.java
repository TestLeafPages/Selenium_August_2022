package week3.day1;

public class Child extends Father{
public void villaThiruvanmiyur() {
	System.out.println("Villa of child: Thiruvanmiyur");
}

public void car() {
	System.out.println("Car of child: WagonR");
}
public void ourCar() {
	this.car(); // W
	super.car(); //A
}
}
