import java.io.*;
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