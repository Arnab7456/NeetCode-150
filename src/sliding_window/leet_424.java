package sliding_window;

public class leet_424 {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // Frequency map for characters A-Z
        int left = 0; // Left pointer of the window
        int maxFreq = 0; // Maximum frequency of any character in the current window
        int maxLen = 0; // Maximum length of the valid window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            freq[currentChar - 'A']++; // Increment the frequency of the current character
            maxFreq = Math.max(maxFreq, freq[currentChar - 'A']); // Update max frequency

            // Calculate the number of replacements needed
            int replacementsNeeded = (right - left + 1) - maxFreq;

            // If replacements needed exceed k, shrink the window from the left
            if (replacementsNeeded > k) {
                freq[s.charAt(left) - 'A']--; // Decrement the frequency of the left character
                left++; // Move the left pointer
            }

            // Update the maximum window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
