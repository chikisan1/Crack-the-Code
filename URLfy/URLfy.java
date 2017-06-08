import java.io.*;
/* 1.4
 * Write a method to replace all spaces in a string with '%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 */
public class URLfy{
	public static void main(String args []){
		String input = IO.readString(); //reads input 
		//String output = ""; //initial output string
		input = input.trim(); //regex "    " -> " "
		/*
		//O(n) solution 
		String [] parse = input.split(" "); //removes " " and put the strings into arrays 
		for(int i = 0; i < parse.length; i++){ 
			output += parse[i] + "%20"; //adds "%20 where the space originally was"
		}
		output = output.substring(0, output.length() - 3); //removes extra "%20" at the end of the string 
		*/

		//Using replace String 
		String output = input.replace(" ", "%20"); // regex " " -> "%20"
		System.out.println(output);
	}
}