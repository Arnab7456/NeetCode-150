package string;

import java.util.Arrays;

public class leet_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }

    public static void main(String[] args) {
        char [] arss = {'h','e','l','l','o'};
        reverseString(arss);
        System.out.println(Arrays.toString(arss));
    }
}
