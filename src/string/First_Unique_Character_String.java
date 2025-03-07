package string;

import java.util.HashMap;
import java.util.HashSet;

public  class First_Unique_Character_String {
    public static int firstUniqChar(String s) {
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for(char ans : s.toCharArray()){
            hashMap.put(ans, hashMap.getOrDefault(ans,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) ==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String ans = "leetcode";
        System.out.println(firstUniqChar(ans));
    }
}
