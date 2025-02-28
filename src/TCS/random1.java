package TCS;

import java.util.HashMap;
/*
 Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

Example 2:
Input: str = “apple”
Output: p
Explanation: The character 'p' have the maximum occurrence i.e 2.
  */
public class random1 {
        public static String maxOccuring(String str){
                HashMap<Character, Integer> hashMap = new HashMap<>();
                for(char map : str.toCharArray()){
                        hashMap.put(map, hashMap.getOrDefault(map, 0) + 1);
                }
                char maxChar = ' ';
                int max = 0;
                for(char key : hashMap.keySet()){
                        if (hashMap.get(key) > max){
                                max = hashMap.get(key);
                                maxChar = key;
                        }
                }
                return String.valueOf(maxChar);
        }

        public static void main(String[] args) {
                String str = "ganduu";
                String ans = maxOccuring(str);
                System.out.println(ans);
        }
}