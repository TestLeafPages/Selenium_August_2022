package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
	Map<Integer, String> map = new LinkedHashMap<Integer, String>();
	map.put(10001, "Anita");
	map.put(10009, "Karthiga");
	map.put(10003, "Arun");
	map.put(10002, "Kalpana");
	map.put(10051, "Priya");
	map.put(10010, "Hari");
	map.put(10005, "Kumar");
	map.put(10010, "Umesh");
//	System.out.println(map);
//	System.out.println(map.get(10001));
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	for (Entry<Integer, String> eachEntry : entrySet) {
		System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
	}
	boolean containsKey = map.containsKey(10010);
	boolean containsValue = map.containsValue("Umesh");
	Set<Integer> keySet = map.keySet();
	for (Integer eachNumber : keySet) {
		System.out.println(eachNumber+"->"+map.get(eachNumber));
	}
	map.values();
}
}
