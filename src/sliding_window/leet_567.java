package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class leet_567 {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            // If s1 is longer than s2, no permutation of s1 can be in s2
            if (s1.length() > s2.length()) {
                return false;
            }

            // Create frequency maps for both strings
            Map<Character, Integer> s1Map = new HashMap<>();
            Map<Character, Integer> windowMap = new HashMap<>();

            // Fill s1 frequency map
            for (char c : s1.toCharArray()) {
                s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
            }

            // Initialize the first window in s2
            for (int i = 0; i < s1.length(); i++) {
                char c = s2.charAt(i);
                windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            }

            // Check first window
            if (s1Map.equals(windowMap)) {
                return true;
            }

            // Slide the window through s2
            int left = 0;
            for (int right = s1.length(); right < s2.length(); right++) {
                // Add right character to window
                char rightChar = s2.charAt(right);
                windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

                // Remove left character from window
                char leftChar = s2.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }
                left++;

                // Check if current window matches s1's frequency map
                if (s1Map.equals(windowMap)) {
                    return true;
                }
            }

            return false;
        }
    }

    public boolean checkInclusion(String s1, String s2) {
        int [] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';
            freq[idx] ++;
        }
        int window = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            int windowIdx = 0, idx = i;
            int windfreq [] = new int[26];
            while (windowIdx <window && idx <s2.length()){
                windfreq[s2.charAt(idx) - 'a'] ++;
                windowIdx ++ ;
                idx ++;
            }
            if(isFreqSame (freq , windfreq)){
                return  true;
            }
        }
        return false;

    }
    public static  boolean isFreqSame (int [] freq1 , int [] freq2){
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}
