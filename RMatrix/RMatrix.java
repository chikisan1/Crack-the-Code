import java.io.*;
public class RMatrix{
	/*Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
	write a method to rotate by 90 degrees. Can you this in place?*/

	public static char[][] rmatrix(char [][] matrix){
		int i = 0; //incremeant down
		int j = 0; //incremeant right 
		int k = matrix.length - 1; //decremeant up 
		int l = matrix.length - 1; //decremeant left
		

		for(int i = 0; i < matrix.length; i++){

			char right = matrix[m][j];
			char down = matrix[i][m];
			char left = matrix[n][l];
			char up = matrix[k][n];

			matrix[m][j] = up;
			matrix[i][m] = right;
			matrix[n][l] = down;
			matrix[k][n] = left;

			i++;
			j++;
			k--;
			l--;

		}
	}

	public static void main(String[] args){
		char [][] m1 = {{'a',  , 'a'}, {, 'a', }, {'a',  , 'a'}};


	}
}