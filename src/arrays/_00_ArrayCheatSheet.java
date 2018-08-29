package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		Object[] augh = new Object[]{"0", "a", "u", "g", "h"};
		//2. print the third element in the array
		System.out.println(augh[2]);
		//3. set the third element to a different value
		augh[2] = 10;
		//4. print the third element again
		System.out.println(augh[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < augh.length; i++) {
			System.out.println(augh[i]);
		}
		
		//6. make an array of 50 integers
		int[] augh2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
		//7. use a for loop to make every value of the integer array a random number
		
		for (int i  = 0; i < augh2.length; i++) {
			augh2[i] = new Random().nextInt(80);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int x = augh2[0];
		for (int i  = 0; i < augh2.length; i++) {
			if (augh2[i] < x) {
				x = augh2[i];
			}
		}
		
		int x1 = augh2[0];
		for (int i  = 0; i < augh2.length; i++) {
			if (augh2[i] > x1) {
				x1 = augh2[i];
			}
		}
		
		System.out.println("Lowest: " + x);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < augh2.length; i++) {
			System.out.println(augh2[i]);
		}
		//10. print the largest number in the array.
		System.out.println("Largest: " + x1);
	}
}
