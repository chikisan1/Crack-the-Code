import java.io.*;
public class StringC{
	/*
	Implement a method to perform basic string compression using the counts of repeated characters. For 
	ex: the string aabccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, 
	then retrun the original string. You can assume the string has only upper case of lower case. 
	*/

	/*Addressing Comments 
	Adjusted the declaration of compare.
	I tried Stringbuilder and it epically failed. So I gave up and just went with normal string. 

	*/

	public static void main(String [] args){
		String str1 = IO.readString(); 
		String str2 = "";
		int count = 1;

		//no need to compress words that are less than 3 characters
		if(str1.length() < 3){
			System.out.println(str1);
			return;
		}

		char compare = str1.charAt(0);
		for(int i = 1; i < str1.length(); i++){
			
			if(compare == str1.charAt(i)){
				count++;
			//	System.out.println("k");
			}
			if(compare != str1.charAt(i) || i + 1 == str1.length()){
				str2 += compare + Integer.toString(count);
				compare = str1.charAt(i);
				count = 1;
			//	System.out.println("j");
			}
			//System.out.print(i);
		}
		if(compare != str1.charAt(str1.length() - 2)){
			str2 += compare + Integer.toString(count);
		}
		
		if(str2.length() < str1.length()){
			System.out.println(str2);
		}
		else{
			System.out.println(str1);
		}

	}
}