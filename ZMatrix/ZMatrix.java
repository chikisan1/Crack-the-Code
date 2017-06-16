import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.Random;
public class ZMatrix{
	/*Write an algorigthm such that if an element in an MxN matrix is 0, its entire row and column are set to 0. */

	/* I scanned the matrix and stored the coordinates of the row and columns into an arraylist. 
	The reason I used a list was so it could expand when it finds additional 0s. 
	Then I used those coordinates to fill in its cooresponding row and column but iterating the 
	row with the column remaining unchanged, and then column with the row remaining unchanged. 
	*/

	public static int [][] zmatrix(int [][] matrix){

		//int [][] replace = matrix;

		ArrayList<Integer> row	= new ArrayList<Integer>(); //row coordinates
		ArrayList<Integer> col	= new ArrayList<Integer>(); //column coordinates

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				if(matrix[i][j] == 0){
					//add to the coordinate list 
					row.add(i); 
					col.add(j);
				}
			}
		}


		while(row.size() != 0){

			//replacing the row 
			for(int i = 0; i < matrix.length; i++){
				matrix[row.get(0)][i] = 0;
			}
			//replacing the column 
			for(int i = 0; i < matrix.length; i++){
				matrix[i][col.get(0)] = 0;
			}

			row.remove(0); //deletes the first index so that the new first index will be the next coordinate
			col.remove(0); //deletes the first index 
			//break when list is empty 
		}

		return matrix;
	}

	//prints the matrix
	public static void printMatrix(int [][] matrix){
		for(int i = 0; i < matrix.length; i++){	
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//randomly fills the array 
	public static void fillArray(int [][] matrix){

		for(int i = 0; i < matrix.length; i++){	
			for(int j = 0; j < matrix.length; j++){
				Random rand = new Random(); 
				int num = rand.nextInt(9) + 0; 

				matrix[i][j] = num;

			}
		}
	}
	public static void main(String[] args){
		
		Random rand = new Random(); 

		int dim = rand.nextInt(25) + 2; //randomly generate our dimension 
		int [][] m0 = new int[dim][dim]; //randomly sized 2d array 

		fillArray(m0); //filled with random char
		printMatrix(m0); //original matrix

		zmatrix(m0);
		printMatrix(m0); //rotated matrix 


	}
}