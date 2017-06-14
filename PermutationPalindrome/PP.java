import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;


public class PP{
	/*
	Given a string, write a function to check if it 
	is a permutation of a palindrome. The palindrome does not 
	need to be limited to just dictionary words.
	Ex: Tact coa is true because "taco cat"
		aagh is false
	*/
	/*
	What would be different if I used a hash table instead of arraylist? 
	*/

	public static void main(String [] args){
		String x = IO.readString(); //read input
		String str = x.replaceAll("\\s+",""); //remove all white space
		char [] arr = str.toCharArray(); 
		ArrayList<Character> list = new ArrayList<Character>(0);

		for(int i = 0; i < arr.length; i++){
			//when the list is null, add to list.
			if(list.size() == 0){
				list.add(arr[i]);
			}
			else{
				//when the list contains the same character, remove
				if(list.contains(arr[i])){
					list.remove(list.indexOf(arr[i]));
				}
				//when it doesn't add. 
				else{
					list.add(arr[i]);
				}
			}
		}
		//Palindrome is true there are one or zero characters in the list 
		if(list.size() < 2){ 
			System.out.println("true");
			return;
		}
		else{
			System.out.println("false");
			return;
		}


	}
}