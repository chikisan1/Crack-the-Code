import java.io.*;
public class OneAway{
	/*
	There are three types of edits that can be performed on strings: insert a character, remove a character, 
	or replace a character. Given 2 strings, write a function to check if they are one or zero edits away. 
	*/

	/*
	Addressing comments 

	Changed one to edits 

	Does deleting a char from string take up more time, compared to readjusting the index for one of them?
	Do I keep the second index within the for loop or just make a while with 2 indexes?
	*/
	public static void main(String [] args){

		String str1 = IO.readString(); //read input
		String str2 = IO.readString(); //read input

                System.out.println(oneAway(str1, str2));
            
	}

        public static boolean oneAway(String str1, String str2) {
		int edits = 0; //count for edits 
		int max = Math.max(str1.length(), str2.length());
		int min = Math.min(str1.length(), str2.length());
		StringBuilder sbmax = new StringBuilder(str1); // assigning max string to stringbuilder
		String sbmin = str2; //assigning min string 
		//switch str1 and str2 if needed
		if(max != min && max == str2.length()){
			sbmax = new StringBuilder(str2);
			sbmin = str1;
		}

		//if the difference between the larger string and the smaller string is more than 1 
		if(max - min > 1){
                        return false;
		}

		//traverse both strings 
		for(int i = 0; i < min; i++){
			//if char at index doesn't match 
			if(sbmax.charAt(i) != sbmin.charAt(i)){
				//when the string length is the same 
				if(sbmax.length() == min){
					edits++;
				}
				else{
					sbmax.deleteCharAt(i); //delete the char in the max string
					i--; //reset traverse 
					edits++;
				}

			}
			if(edits > 1){
                                return false;
			}
		}
		return true;
        }
}
