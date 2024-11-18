package Array;

import java.util.*;

public class NC5_top_k_ele {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket = new List[nums.length +1];
        Map<Integer , Integer> hashFreq = new HashMap<>();
        for(int n : nums){
            hashFreq.put(n, hashFreq.getOrDefault(n,0)+1);
        }
        for(int key : hashFreq.keySet()){
            int freq = hashFreq.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int [] res = new int[k];
        int counter =0;
        for (int pos = bucket.length -1 ; pos>=0 && counter <k; pos--) {
            if (bucket[pos] !=null){
                for(Integer integer : bucket[pos]){
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }
}
