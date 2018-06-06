package _03_Dynamic_Integer_Array;

public class DynamicIntegerArray {
	//1. Create a private int array. Don't initialize it.

	
	public DynamicIntegerArray() {
		//2. Initialize the int array to have 0 elements. 
		//   This will prevent a null pointer exception
	
	}
	
	//3. Complete the steps in the add method
	public void add(int v) {
		//A. create and initialize a new int array to be one 
		//   element longer than the member array
		
		//B. set the last element of your new array to 
		//   the value passed into the method
		
		//C. iterate through the memebr array and 
		//   copy every element from the member array 
		//   to the new array
		
		//D. set the member array equal to the new array.
	}
	
	//4. Complete the steps in the add method
	public int get(int location) {
		//A. Return the value of the memeber array at the location passed in
		return 0;
	}
	
	//5. Run the DynamicArrayTest to see if you are correct so far.
	
	
	//6. Complete the steps in the set method
	public void set(int v, int location) {
		//A. set the variable at the location passed in to the method
		//   to the new value v
	}
	
	//7. Complete the steps in the insert method
	public void insert(int v, int location) {
		//A. create and initialize a new int array to be one 
		//   element longer than the member array
		
		//B. Make a for loop that iterates through the new array

			//C. if i is less than location:
		    //		set the element at i of the new array to the element at i of the member array
			
			//D. else if i is greater than location:
		    //		set the element at i of the new array to the i - 1 element of the member array
			
			//E. else, set the element at i of the new array to the value v
		
		
		//F. set the member array equal to the new array
	
	}
	
	//8. Run the tests again and check your progress
	
	//9. Complete the steps in the remove method
	public void remove(int location) {
		//A. create a new array that is one element smaller than the member array
		
		//B. make a for loop to iterate through the member array
		
			//C. if i  is less than location
			//		set the element at i of the new array to the element at i of the member array
			
			//D. if i  is less than location
			//		set the element at i -1 of the new array to the element at i of the member array
			
			//E. else, continue;
			
		//F. set the member array equal to the new array
	}
}

//10. Run the tests again the see if you are finished
