import java.io.*;
import java.util.Random;
public class RMatrix{
	/*Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
	write a method to rotate by 90 degrees. Can you this in place?*/

	//This method rotates the matrix 90 degrees to the right 
	public static char[][] rmatrix(char [][] matrix){
		int m = 0;
		int n = matrix.length - 1; 

		for(; m <= n; m++){
			int i = m;
			int j = n;
			//starts the process from the four corners then move inwards one element at a time
			for(;i < n; i++){
				char right = matrix[m][i]; 
				//System.out.println("lefttop: " + right);
				char down = matrix[i][n];
				//System.out.println("righttop: " + down);
				char left = matrix[n][j];
				//System.out.println("right bottom: " + left);
				char up = matrix[j][m];
				//System.out.println("left bottom: " + up);

				matrix[m][i] = up;
				//System.out.println("new lefttop: " + matrix[i][m]);
				matrix[i][n] = right;
				//System.out.println("new righttop: " + matrix[m][j]);
				matrix[n][j] = down;
				//System.out.println("new rightbottom: " + matrix[n][j]);
				matrix[j][m] = left;
				//System.out.println("new leftbottom: " + matrix[j][m]);
				j--;
			}
			n--;
		}

		return matrix;
	}

	//prints the matrix
	public static void printMatrix(char [][] matrix){
		for(int i = 0; i < matrix.length; i++){	
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//randomly fills the array 
	public static void fillArray(char [][] matrix){
		char [] alpha = {'a','b','c','d','e','f','g','h','i','j','k',
						'l','n','n','o','p','q','r','s','t','u','v',
						'w','x','y','z'};

		for(int i = 0; i < matrix.length; i++){	
			for(int j = 0; j < matrix.length; j++){
				Random rand = new Random(); 
				int index = rand.nextInt(25) + 0; 

				matrix[i][j] = alpha[index];

			}
		}
	}
	public static void main(String[] args){
		
		Random rand = new Random(); 

		int dim = rand.nextInt(25) + 2; //randomly generate our dimension 
		char [][] m0 = new char[dim][dim]; //randomly sized 2d array 

		fillArray(m0); //filled with random char
		printMatrix(m0); //original matrix

		rmatrix(m0);
		printMatrix(m0); //rotated matrix 


	}
}