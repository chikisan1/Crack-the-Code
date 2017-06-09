import java.io.*;
/*
Given 2 strings, check if one is a permutation of the other. 
*/
public class Permutation{
	public static void main(String[] args){
		String s1 = IO.readString(); //read input
		String s2 = IO.readString(); //read input

		//if String aren't equal length then they aren't permutated 
		if(s1.length() != s2.length()){
			System.out.println("false");
			return;
		}
		//convert from String to char Array
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		int i1 = 0;
		int i2 = 0;

		//add the value of each char to the integer 
		for(int i = 0; i < c1.length; i++){
			i1 += c1[i];
			i2 += c2[i];
		}
		//note that " " is also considered a character in this case so "string " != "string"
		//note that capitalized letters are not equal to lower case letters so "String" != "string"
		if(i1 == i2){
			System.out.println("true");
			return;
		}
		else{
			System.out.println("false");
			return;
		}


	}
}