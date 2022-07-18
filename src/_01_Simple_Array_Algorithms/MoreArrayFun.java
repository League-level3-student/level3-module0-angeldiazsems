package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	    String[] test = {"t","s","e","t"};
	print(test);
	reverse(test);
	other(test);
	random(test);
	}
	    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

	static void print(String[] test) {
	    for(int i = 0; i < test.length; i++) {

	        System.out.println(test[i]);

	    }
	    System.out.println("-------------");

	}


	    //3. Write a method that takes an array of Strings and prints all the Strings in the array
	    //   in reverse order.
	static void reverse(String[] test) {
	    for (int i = test.length - 1; i >= 0; i--) {
	    System.out.println(test[i]);
	    }
	    System.out.println("-------------");
	  
	    }


	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void other(String[] test) {
	    for(int i = 0; i < test.length; i = i + 2) {
	        System.out.println(test[i]);
	    }
	    System.out.println("-------------");
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	static void random(String[] test) {
	    Random r = new Random();

	    for(int i = 0; i < test.length; i++) {
	        System.out.println(test[r.nextInt(test.length)]);
	    }
	}
	}

