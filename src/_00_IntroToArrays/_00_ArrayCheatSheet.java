package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = new String[5];
		//2. print the third element in the array
		System.out.println(array[3]);
		//3. set the third element to a different value
		array[3] = "array";
		//4. print the third element again
		System.out.println(array[3]);
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "java";
		}
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//7. make an array of 50 integers
		int[] iArr = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < iArr.length; i++) {
			Random r = new Random();
			iArr[i] = r.nextInt();
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = iArr[0];
		for (int i = 1; i < iArr.length; i++) {
			if(iArr[i] < smallest) {
				smallest = iArr[i];
			}
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 1; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		//11. print the largest number in the array.
		int largest = iArr[0];
		for (int i = 1; i < iArr.length; i++) {
			if(iArr[i] > largest) {
				largest = iArr[i];
			}
		}
		System.out.println(largest);
		
		//12. print only the last element in the array
		System.out.println(iArr[iArr.length - 1]);
	}
}
