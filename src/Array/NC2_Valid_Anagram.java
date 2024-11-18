package Array;

import java.util.Arrays;

public class NC2_Valid_Anagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
        s = sor(s);
        t = sor(t);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)){
                return false;
            }
        }
        return true;

    }
    public static  String sor(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);

        return  new String(arr);
    }

}