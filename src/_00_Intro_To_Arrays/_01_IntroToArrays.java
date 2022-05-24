package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] e = new String[5];

e[0] = "yee";
e[1] = "ya";
e[2] = "yeeup";
e[3] = "yoin";
e[4] = "yat";

        // 2. print the third element in the array
System.out.println(e[3]);

        // 3. set the third element to a different value
e[3] = "asf";
        // 4. print the third element again
System.out.println(e[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice

for(int i = 0; i < e.length; i++) {
	
	e[i] = "test";
	System.out.println(e[i]);
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
Integer[] FIFTY = new Integer[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random r = new Random();

for(int i = 0; i < FIFTY.length; i++) {
	FIFTY[i] = r.nextInt(50);
	
}
int smallest = FIFTY[0];
int largest = FIFTY[7];
for(int i = 0;i < FIFTY.length; i++) {
	System.out.println(FIFTY[i]);
	if(FIFTY[i]<smallest) {
		smallest = FIFTY[i];
	}
	if(FIFTY[i]>largest) {
		largest = FIFTY[i];
	}
	
}
System.out.println(smallest);
System.out.println(largest);
        // 9. without printing the entire array, print only the smallest number
        //    on the array



        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array
	
System.out.println(FIFTY[49]);

    }
}
