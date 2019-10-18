package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
String[] stringArray= new String[20];
stringArray[0]= "blue";
stringArray[1]= "red";
stringArray[2]= "yellow";

arrayReverse(stringArray);
System.out.println("-THIS WAS INTENTIONALLY LEFT BLANK-");
everyOther(stringArray);
System.out.println("-THIS WAS INTENTIONALLY LEFT BLANK-");
arrayTaker(stringArray);
System.out.println("-THIS WAS INTENTIONALLY LEFT BLANK-");
randomArrayPrinter(stringArray);
System.out.println("-THIS WAS INTENTIONALLY LEFT BLANK-");
randomArrayPrinter(stringArray);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.

	public static void arrayTaker(String[] stringArray) {
	
	for (int i = 0; i < stringArray.length; i++) {
		System.out.println(stringArray[i]);
	}	

	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void arrayReverse(String[] stringArray) {
		
		for (int i = stringArray.length-1; i >= 0; i--) {
			System.out.println(stringArray[i]);
		}	

		}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
public static void everyOther(String[] stringArray) {
		
	for (int i = 0; i < stringArray.length; i+=2) {
		System.out.println(stringArray[i]);
	}	
		}
	
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
public static void randomArrayPrinter(String[] stringArray) {

	ArrayList <String> list= new ArrayList<String>();
	for (int i = 0; i < stringArray.length; i++) {
		list.add(stringArray[i]);


	}
	for (int j = 0; j < list.size(); j++) {
		Random rand= new Random();
		int randy= rand.nextInt(stringArray.length);
		System.out.println(list.get(randy));
		list.remove(randy);
	}
		}
	
}
