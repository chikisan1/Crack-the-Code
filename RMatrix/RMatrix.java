import java.io.*;
import java.util.Random;
public class RMatrix{
	/*Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
	write a method to rotate by 90 degrees. Can you this in place?*/

	/*
	I approached this problem by swap each of the chars 4 at a time, starting with the corner indices.

	So if I had a matrix 5 x 5 

	a b c d e 		u b c d a 
	f g h i j 		f g h i j 
	k l m n o -> 	k l m n o 
	p q r s t 		p q r s t 
	u v w x y 		y v w x e

	'a's original position will be swapped by 'u'
	'e's original position will be swapped by 'a'
	'y's original position will be swapped by 'e'
	'u's original position will be swapped by 'y'

	Then it will follow a clockwise pattern with the outer indices.
	Once the outer indices are swapped, I went in layer deeper in the matrix, and repeated the process.

	Each time the outer loop increments, the size of the inner loop decrease. 

	So time complexity would be O(n) for rotating the matrix, filling and printing the array are both O(n^2).

	The average time complexity for this code is O(n^2).

	*/

	//This method rotates the matrix 90 degrees to the right 
	public static char[][] rmatrix(char [][] matrix){
		int m = 0; //m and n are used to stay in the layer until the final indices have been swapped
		int n = matrix.length - 1; 

		//Goes one layer within the matrix
		for(; m <= n; m++){
			int i = m;
			int j = n;
			//starts the process from the four corners then move inwards one element at a time
			for(;i < n; i++){
				char right = matrix[m][i]; 
				char down = matrix[i][n];
				char left = matrix[n][j];
				char up = matrix[j][m];

				matrix[m][i] = up;
				matrix[i][n] = right;
				matrix[n][j] = down;
				matrix[j][m] = left;
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
				int index = rand.nextInt(25) + 0; //randomly generated indices 

				matrix[i][j] = alpha[index]; //randomly assigning a char into the matrix 

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