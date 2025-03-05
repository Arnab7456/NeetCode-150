package Array;

import java.util.HashMap;
import java.util.HashSet;

public class leet_136 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int ansMap : nums) {
            hashMap.put(ansMap, hashMap.getOrDefault(ansMap, 0) + 1);
        }
        for (int key : hashMap.keySet()){
            if (hashMap.get(key) == 1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
}
