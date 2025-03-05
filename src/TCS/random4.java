package TCS;

public class random4 {
    public static int AvgSum(int [] arr , int n){
        double avg =0;
        for (int i = 0; i < n; i++) {
            avg += (double) arr[i];
        }
        return (int) avg /n;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,1,1,5,1};
        int n = 5;
        int ans = AvgSum(arr,n);
        System.out.println(ans);
    }

}

/*
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8
 */
