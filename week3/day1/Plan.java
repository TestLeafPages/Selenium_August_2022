package week3.day1;

public interface Plan {
// will contain only the blue print
//	* Only abstract methods
	/**
	 * This method build the bedroom which is east facing in 140 sqfts
	 * with attached t&b and wardrobe for storage.
	 * @author Balaji
	 * @param numbers -> the number of bedrooms that a house should have
	 * 
	 */
	public void buildBedRooms(int numbers); 
	/**
	 * 
	 */
	public void buildBalcony() ;
	/**
	 * 
	 */
	public void buildParking() ;
//	* static final variables
	int totalSqft = 1800;
	String name = "High line wonders";
	String[] flats = {"F1","F2","S1","S2"};
	
}
