package Array;

import java.util.HashMap;
import java.util.HashSet;

public class leet_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int ansSet  : nums){
            if (!hashSet.add(ansSet)){
                return true;
            }
        }
        return false;
    }
}
