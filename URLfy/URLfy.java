import java.io.*;
/* 1.4
 * Write a method to replace all spaces in a string with '%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 */

/*
Originally I was going to create a new string by adding seperated parts of the original string and add "%20"
which would have resulted in an O(n) answer. Then I realized that I could just use the String .replace function 
which I assume is constant time. With my knowledge of regex, I used .trim to reduce any extra space and reduced 
it to a single space so that I can use .replace to replace the space with "%20". I also removed the unecessary "%20"
at the end of the string. 

After doing some testcases

I was wrong, trim only eliminates the spaces in the begenning and end of the string. So instead I used regex 
"\\s+", meaning all spaces in general, no matter what size, and replaced it with "%20". Also trim is necessary to remove the 
spaces or else it will create unwanted "%20".
*/
public class URLfy{
	public static void main(String[] args){
		String input = IO.readString(); //reads input 
		//String output = ""; //initial output string
		input = input.trim();
		input = input.replaceAll("\\s+", "%20"); //regex "    " -> " "
		/*
		//O(n) solution 
		String [] parse = input.split(" "); //removes " " and put the strings into arrays 
		for(int i = 0; i < parse.length; i++){ 
			output += parse[i] + "%20"; //adds "%20 where the space originally was"
		}
		output = output.substring(0, output.length() - 3); //removes extra "%20" at the end of the string 
		*/
		System.out.println(input);
	}
}