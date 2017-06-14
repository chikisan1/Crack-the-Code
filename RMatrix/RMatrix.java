import java.io.*;
public class RMatrix{
	/*Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
	write a method to rotate by 90 degrees. Can you this in place?*/

	public static char[][] rmatrix(char [][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.legnth; j++){
				char hold = matrix[][j];
				char replace = matrix[i][j];
			}
		}
	}

	public static void main(String[] args){
		char [][] m1 = {{'a',  , 'a'}, {, 'a', }, {'a',  , 'a'}};


	}
}