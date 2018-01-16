package Strings;

import java.util.ArrayList;

public class substring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "b";
		 String str2 = "baba";
		 System.out.println(strStr(str1,str2));
	}

	
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int strStr(final String A, final String B) {
        if(A.length() == 0 || B.length() == 0){
            return -1;
        }
        else {
            if(A.length() >= B.length()) {
                return (find(A,B));
            }
            else {
               return (find(B,A));
            }
        }
    }
    
    
    public static boolean checkSubstr(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        else {
            for (int i=0 ; i<s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static int find(String large, String small) {
    		System.out.println("large.length"+large.length());
    		System.out.println("small.length"+small.length());
    		
        if(large.length() == 1 && small.length() == 1 && large.charAt(0) == small.charAt(0)) {
                return 0;
         }

        for(int i=0; i<large.length()-small.length() ; i++) {
            if(large.charAt(i) == small.charAt(0)) {
        		System.out.println("i"+i);
               if(checkSubstr(large.substring(i,i+small.length()), small)) {
                   return i;
               }
            }
        }
        return -1;
    }
}
