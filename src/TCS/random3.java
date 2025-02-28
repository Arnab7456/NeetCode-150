package TCS;

import java.util.Arrays;

public class random3 {
    public static float mean (int [] arr , int n){
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        return (float)avg/n;
    }
    public static float median (int [] arr , int n){
        Arrays.sort(arr);

        if(n%2 ==1){
            return arr[n/2];
        }else {
            return (arr[n/2 -1 ] + arr[n/2])/2.0f;
        }
    }
    public static int smallest (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static int smallestNew (int arr [] , int n){
        int min = arr[0];
        for (int i = 0; i < n; i++) {
                if (min >arr[i]){
                    min = arr[i];
                }
        }
        return min;
    }
    public static int LargesttNew (int arr [] , int n){
        int min = arr.length-1;
        for (int i = 0; i < n; i++) {
            if (min <arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int secondSmallest (int [] arr , int n){
        int MinNex = arr[1];
        for (int i = 1; i < n; i++) {
            if (MinNex >arr[i]){
                MinNex = arr[i];
            }
        }
        return MinNex;

    }
    public static int SecondSmallestOpti (int [] arr , int n){
        if (n<2){
            throw new IllegalArgumentException("array should have at least two elements");
        }
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]<firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }else if (arr[i] < secondSmallest && arr[i] != firstSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,7};
        int n = 4;
        float ans = mean(arr,n);
        float ans1 =  median(arr,n);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(smallest(arr));
        System.out.println(smallestNew(arr,4));
        System.out.println(LargesttNew(arr,4));
        System.out.println(secondSmallest(arr,4));
        System.out.println(SecondSmallestOpti(arr,4));

     }

}

/*

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
 */