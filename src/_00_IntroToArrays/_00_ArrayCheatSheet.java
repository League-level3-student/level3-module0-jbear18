package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = new String[5];
		// 2. print the third element in the array
		System.out.println(array[2]);
		// 3. set the third element to a different value
		array[2] = "third element";
		// 4. print the third element again
		System.out.println(array[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "i'm a blobfish";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 7. make an array of 50 integers
		int[] arrayInt = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random rand= new Random();
for (int i = 0; i < arrayInt.length; i++) {
	int randy= rand.nextInt(1000);
	arrayInt [i]= randy;
}
		// 9. without printing the entire array, print only the smallest number on the
		// array
int smallerest= Integer.MAX_VALUE;
int largerest= Integer.MIN_VALUE;
for (int i = 0; i < arrayInt.length; i++) {
if(arrayInt[i]<smallerest) {

	smallerest= arrayInt[i];
}
if(arrayInt[i]>largerest) {
	largerest= arrayInt[i];
}
System.out.println(arrayInt[i]);
}
System.out.println(smallerest);
System.out.println(largerest);
System.out.println(arrayInt[49]);
		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.

		// 12. print only the last element in the array

	}
}
