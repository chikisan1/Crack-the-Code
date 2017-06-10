import java.io.*;
/*
"Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?"
*/
public class Unique{
	public static void main(String [] args){
		String str = IO.readString(); //read input

		HashSet<Character> unique = new HashSet<Character>();
        for(int i=0; i<str.length();i++){
            unique.add(str.charAt(i));
        }
        //If the size is different that means there was a collision 
        if(unique.size()!=str.length()){
        	System.out.println("false");
            return;
        }       
        System.out.println("true");
        return;


	}
}