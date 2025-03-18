package Array;

import java.util.Arrays;
import java.util.HashMap;


public class unique {
    public static void main(String[] args) {
            int [] arr = {1,2,2,1,3,4,3,4,5};
        System.out.println(ansUnique(arr));
        System.out.println(ans("tiger", "ti"));
        System.out.println(KepreNum(45));
        int an [] = {1, 4, 3, 6, 7, 0};
        System.out.println(ansMaxProduct(an));
     }
    public static int ansUnique(int [] ans){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int nums : ans){
            hashMap.put(nums, hashMap.getOrDefault(nums,0)+1);
        }
        for (int test : hashMap.keySet()){
           if (hashMap.get(test) == 1){
               return test;
           }
        }

        return -1;
    }
    public static String ans(String ans1, String ans2) {
        return ans1.replace(ans2, "");
    }
    public static int KepreNum(int ans){
        int test1 = ans * ans;
        String test2 = String.valueOf(test1);
        for (int i = 1; i < test2.length(); i++) {
            int lefty = Integer.parseInt(test2.substring(0,i));
            int righty = Integer.parseInt(test2.substring(i));

            if (lefty + righty == ans && righty!=0){
                return lefty + righty;
            }
        }
        return -1;
    }
    public static int ansMaxProduct(int [] ans){
        Arrays.sort(ans);
        int max = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 1; j <i ; j++) {
                int ams = ans[i] * ans[j];
                if (ams != max){
                    max = Math.max(max, ams);
                }
            }
        }
        return max;
    }

}

/*
45^2 = 2025 = 45
tiger
ti
ans ger

1 4 3 6 7 0
ans = 42
 */

