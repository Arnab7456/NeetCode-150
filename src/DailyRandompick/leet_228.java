package DailyRandompick;

import java.util.ArrayList;
import java.util.List;

public class leet_228 {
    public List<String> SummaryRanges(int [] nums){
        List<String> ans = new ArrayList<>();
        if(nums.length == 0 ) return ans;
        int strat = nums[0];
        for (int i = 1; i <= nums.length ; i++) {
            if(i == nums.length || nums[i] !=nums[i-1] +1 ){
                if(strat == nums[i-1]){
                    ans.add(String.valueOf(strat));
                }else {
                    ans.add(strat + "->" + nums[i-1]);
                } if(i<nums.length){
                    strat = nums[i];
                }
            }
        }
        return ans;
    }
}
