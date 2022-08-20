package week3.day1;

public class Myhouse {
public static void main(String[] args) {
	// Scope restriction
	Plan land = new Land();
	land.buildBalcony();
	land.buildParking();
	land.buildBedRooms(5);
	land.buildGarden();
}
}
