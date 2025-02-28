package Array;

import java.util.Arrays;

public class leet_7 {

    public static int reverse(int x) {
        long rev =0;
        while (x!=0){
            rev = rev *10 + x %10;
            x /=10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;

    }

    public static int[] revArray(int [] arr){
       int left = 0;
       int right = arr.length -1;
       while (left<right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right --;
       }
       return arr;
    }

    public static void main(String[] args) {
        System.out.println(reverse(321));
        int [] arr = {3,2,1,0};
        arr = revArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
