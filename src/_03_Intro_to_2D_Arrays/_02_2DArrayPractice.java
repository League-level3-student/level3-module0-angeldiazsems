package _03_Intro_to_2D_Arrays;

import java.util.ArrayList;

/*
 *  A 2D array is comparable to a matrix/grid ordered by rows and columns.
 *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
 *  can be thought of a 3x3 matrix/grid:
 *                 col0 col1 col2
 *                  \/   \/   \/
 *          row 0  { 1,  2,  3 }
 *          row 1  { 4,  5,  6 }
 *          row 2  { 7,  8,  9 }
 * 
 *  Where row 0 contains the numbers 1, 2, 3.
 *  and column 0 contains the numbers 1, 4, 7.
 * 
 *  Java stores a 2D array in 'row-major order', meaning the row number is
 *  the first number in the square brackets. The row 0 elements are:
 * 
 *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3
 * 
 *  The second number in the square brackets is the column number.
 *  The column 0 elements are:
 * 
 *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
 */
public class _02_2DArrayPractice {
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          0, 1, 2
     *          3, 4, 5
     *          6, 7, 8
     */
	public Integer[][] test1() {
        Integer[][] test1 = new Integer[3][3];
        int e = 0;
    	for(int i = 0; i < test1.length; i++) {
    		for(int j = 0; j < test1[i].length; j++) {
    			test1[i][j] = e++;
    		}
    	}
        return test1;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          "a", "b", "c", "d",
     *          "e", "f", "g", "e"
     */
    public String[][] test2() {
    	String[][] test2 = new String[2][4];
     	for(int i = 0; i < test2.length; i++) {
     		for(int j = 0; j < test2[i].length; j++) {
     	
     			
     		}
     	}
        return test2;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          true, false,
     *          false, false,
     *          false, true,
     *          true, true,
     *          true, false
     */
    public Boolean[][] test3() {
        Boolean[][] test3 = new Boolean[5][2];
    	
        for(int i = 0; i < test3.length; i ++) {
        	
        	for(int j = 0; j < test3[i].length; j++) {
        	
        	}
        	
        }

        return test3;
    }

    
    /*
     * Draw the grid of values for the following 2D array of ints:
     * Assume all the elements in the 2D array are initialized to random ints
     * 
     * int[][] grid = new int[2][3];
     * 
     * 4, 6, 0
     * 2, 9, 7
     * 
     * 
     * Show your teacher the grid you created
     */
    
    /*
     * Draw the grid of values for the following 2D array of Robots
     * Assume all the elements in the 2D array are initialized.
     * 
     * Robot[][] robots = new Robot[4][2];
     * 
     * r, r
     * r, r
     * r, r
     * r, r
     * 
     * 
     * Show your teacher the grid you created
     */
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, null, null
     *          null, null, null, Object
     */
    public Object test4() {
        Object[][] objects = { {null, null, null, null}, {null, null, null, new Object()} };
        
        for(int i = 0; i < objects.length;i++) {
        	for(int j = 0; j < objects[i].length; j++) {
        		if(objects[i][j] != null) {
        			return objects[i][j];
        		}
        		
        	}
        }
        return null;
    }
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, Object, null
     *          null, null, null, null
     */
    public Object test5() {
        Object[][] objects = { {null, null, new Object(), null}, {null, null, null, null} };
        for(int i = 0; i < objects.length;i++) {
        	for(int j = 0; j < objects[i].length; j++) {
        		if(objects[i][j] != null) {
        			return objects[i][j];
        		}
        		
        	}
        }
        return null;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first row (row 0)
     */
    public Integer test6() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int e = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = 0; j < nums[i].length; j++) {
        		if(i == 0) {
        		e+=nums[i][j];
        		}
        	}
        }
        return e;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first column (column 0)
     */
    public Integer test7() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int e = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = 0; j < nums[i].length; j++) {
        		if(j == 0) {
        		e+=nums[i][j];
        		}
        	}
        }
        return e;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified row
     */
    public Integer getSumByRow(int[][] matrix, int row) {
        
    	int e = 0;
    	for(int i =0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			if(i == row) {
    				e+=matrix[i][j];
    			}
    		}
    	}
    	
        return e;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified column
     */
    public Integer getSumByColumn(int[][] matrix, int col) {
    	
    	int e = 0;
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			if(j == col) {
    				e+=matrix[i][j];
    			}
    		}
    	}
    	
        return e;
    }
    
    /*
     * Return the value of the element adjacent to the specified row and column
     * The directions East, West, North, South are relative to the 2D array
     * matrix/grid. For example in this 3x3 2D array:
     * 
     *          [1][2][3]
     *          [4][5][6]
     *          [7][8][9]
     * 
     * for the 5 in the middle (row = 1, column = 1), then
     * East neighbor = 6
     * West neighbor = 4
     * North neighbor = 2
     * South neighbor = 8
     * 
     * 1. Assume input row and column values are valid indexes in the matrix.
     * 2. If the neighbor does not exist, i.e. it's outside the grid
     *    boundaries, return null.
     */
    public Integer getEastNeighbor(int[][] matrix, int row, int col) {
     
        
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			if(col < matrix.length-1) {
    				return matrix[row][col+1];
    			}
    			
    		}
    	}
        return null;
    }
    
    public Integer getWestNeighbor(int[][] matrix, int row, int col) {
        
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			if(col > 0) {
    				return matrix[row][col-1];
    			}
    		}
    	}
        return null;
    }
    
    public Integer getNorthNeighbor(int[][] matrix, int row, int col) {
        
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			if(row > 0)
    			return matrix[row-1][col];
    		}
    	}

        return null;
    }
    
    public Integer getSouthNeighbor(int[][] matrix, int row, int col) {
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[i].length; j++) {
    			if(row < matrix.length-1)
    			return matrix[row+1][col];
    		}
    	}
    	
        return null;
    }
}
