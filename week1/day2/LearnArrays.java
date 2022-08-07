package week1.day2;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	// syntax to create an array
	// dataType[] arrayName = {v1,v2,v3};
	String[] names = {"Deepika", "Usha", "Subash", "Yusuf", "Prakash"};
	System.out.println(2/0);
	System.out.println(names[5]);
	int length = names.length;
	System.out.println(length);
	for (int i = 0; i < length; i++) {
		System.out.println(names[i]);
	}
	System.out.println("------------------------------------------");
	Arrays.sort(names);
	for (int i = 0; i < length; i++) {
		System.out.println(names[i]);
	}
	// Array object
	int[] numbers = new int[5];
	numbers[0] = 5;
	numbers[1] = 56;
	numbers[2] = 98;
	numbers[3] = 67;
	numbers[4] = 77;
	
}
}
