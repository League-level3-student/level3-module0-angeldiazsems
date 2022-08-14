/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import javax.swing.JOptionPane;

public class TheWrongWayCow {


	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		int north = 0;
		int south = 0;
		int east = 0;
		int west = 0;
		
		
		String fieldvalue;
		String fieldvalue2;
		String coordnite;
		String[] ss = new String[100];
		String[] nn = new String[100];
		String[] ee = new String[100];
		String[] ww = new String[100];
		
		
		
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j-1] == 'c') {
					if(field[i][j-3] == 'w') {
						fieldvalue = String.valueOf(i);
						fieldvalue2 = String.valueOf(j-1);
						coordnite = ""+fieldvalue+", "+fieldvalue2+" ";
						ss = new String[100];
						ss[south] = coordnite;
						south++;
						
					}
				}
				if (field[i][j+1] == 'c') {
					if(field[i][j+3] == 'w') {
						fieldvalue = String.valueOf(i);
						fieldvalue2 = String.valueOf(j+1);
						coordnite = ""+fieldvalue+", "+fieldvalue2+" ";
						nn = new String[100];
						nn[north] = coordnite;
						north++;
					}
				}
				if (field[i-1][j] == 'c') {
					if(field[i-3][j] == 'w') {
						 fieldvalue = String.valueOf(i-1);
						 fieldvalue2 = String.valueOf(j);
						 coordnite = ""+fieldvalue+", "+fieldvalue2+" ";
						ee[east] = coordnite;
						east++;
					}
				}
				if (field[i+1][j] == 'c') {
					if(field[i+3][j] == 'w') {
						 fieldvalue = String.valueOf(i+1);
						 fieldvalue2 = String.valueOf(j);
						 coordnite = ""+fieldvalue+", "+fieldvalue2+" ";
						 ww = new String[100];
						ww[west] = coordnite;
						west++;
					}
				}
		

				
			}
		}
		System.out.println("**************************************************");
		if(south == 1) {
			System.out.println(ss);
		}
		if(north == 1) {
			System.out.println(nn);
		}
		if(east == 1) {
			System.out.println(ee);
		}
		if(west == 1) {
			System.out.println(ww);
		}
		
		
		return null;
	}
	}
