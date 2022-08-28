package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<String>();
	set.add("Vidhya");
	set.add("Vani");
	set.add("Jeevitha");
	set.add("Stellah");
	set.add("Karthi");
	set.add("Jyothi");
	set.add("Vani");
	System.out.println(set);
	
//	List<String> list = new ArrayList<String>(set);
	List<String> list = new ArrayList<String>();
	list.addAll(set);
	System.out.println(list);
	
	
	
//	for (String eachName : set) {
//		System.out.println(eachName);
//	}
}
}
