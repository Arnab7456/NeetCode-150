package TCS;

import java.util.HashMap;

public class random2 {
   static String ans = " ";
    public static String removeDuplicateLetters(String s) {
        if (s == null || s.length() ==0){
            return ans;
        }
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for (j=0; j<i;j++){
                if (s.charAt(i) == s.charAt(j)){
                    break;
                }
            }
            if (i == j) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        String tes = "cbacdcbc";
        String jj = removeDuplicateLetters(tes);
        System.out.println(jj);
    }
}
