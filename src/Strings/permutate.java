package Strings;

import java.util.ArrayList;
import java.util.List;

public class permutate {
	public static List<String> finalAns;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "abc";
		 finalAns = new ArrayList<String>();
		 permutation("", str);
	}

	private static void permutation(String ans, String remain) {
		int len = remain.length();
		if(len == 0) {
			finalAns.add(ans);
		}
		else {
			for (int i=0; i<len; i++) {
				permutation(ans+remain.charAt(i), remain.substring(0,i)+remain.substring(i+1,len));
			}
		}
	}
}
