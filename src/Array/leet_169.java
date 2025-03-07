package Array;

import java.util.HashMap;

public class leet_169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int ans : nums){
            hashMap.put(ans, hashMap.getOrDefault(ans,0)+1);
        }
        int n = nums.length /2;
        int max = 0;
        for(int ans1 : hashMap.keySet()){
            if (hashMap.get(ans1) >n){
              return ans1;
            }
        }
        return -1;
    }
}
