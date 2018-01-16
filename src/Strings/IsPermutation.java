package Strings;

import java.util.ArrayList;

public class IsPermutation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "abc";
		 String str2 = "cab";

		 isPermutation(str1, str2);
	}

	
	public static boolean isPermutation (String a, String b) {
		  // first check if both strings are the same length
		  if (a.length() != b.length()) {
		    return false;
		  }
		  // change a to char array to be iterated through
		  char[] astr = a.toCharArray();
		  // initialize an array as a counter
		  int[] count = new int[128];
		  // then we count a's characters
		  for (char character : astr) {
		    count[character]++;
		  }
		  // match a's count with b
		  char[] bstr = b.toCharArray();
		  for (char character : bstr) {
		    if(--count[character] < 0) {
		      return false;
		    }
		  }
		  return true;
		}
}
