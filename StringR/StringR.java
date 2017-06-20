public class StringR{
	/* Assume you have a method isSubstring which checks if one word is a substring
	of another. Given 2 strings, s1 and s2, write code to chekc if s2 is a rotation of
	s1 using only one call to isSubstring(e.g. "waterbottle" is a rotation of "erbottlewat")*/

	/*Rather than a for loop approach, this problem asks to only use the issubstring method once,
	meaning keep it at constant time. */
	public static boolean rotation(String s1, String s2){
			//check to see if the strings are equal length
			/*Combine two of the original strings so that it would create a repition of the
			string. If s2 is indeed a rotation, then its substring should exist within the
			entire string.
			*/
			return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}

	public static void main(String [] args){
		System.out.println("Type Original String");
		String s1 = IO.readString();
		System.out.println("Type string you want to compare with");
		String s2 = IO.readString();
		boolean result = rotation(s1, s2);

		if(result == true){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
