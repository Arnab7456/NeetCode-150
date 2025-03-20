package Array;

import java.io.*;
import java.util.StringTokenizer;

public class tcsChoclate {
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int arr [] = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr [i] = Integer.parseInt(st.nextToken());
        }
        int ans = Count(arr);
        System.out.println(ans);
    }
    public static int Count(int [] arr){
        int count = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >arr[i-1]){
                max = arr[i];
                count++;
            }
        }
        return count+1;
    }

}
