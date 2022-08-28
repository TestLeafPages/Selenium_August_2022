package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Sathish");
	list.add("Usha");
	list.add("Bala");
	list.add("Akshaya");
	list.add("Sathish");
	list.add("John");
	list.add("Gokul");
	list.add(2, "Chandru");
	
	list.set(1, "Suresh");
	list.remove("Bala");
	list.remove(4);
	int size = list.size();
//	list.clear();
//	boolean empty = list.isEmpty();
	System.out.println(size);
	System.out.println(list);
	
//	for(int i = 0; i < size; i++) {
//		System.out.println(list.get(i));
//	}
	
	Collections.sort(list);
	Collections.reverse(list);
	for(String eachName:list) {
	System.out.println(eachName);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
