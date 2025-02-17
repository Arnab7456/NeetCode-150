package randomPick;

public class leet_3151 {
    class Solution {
        public boolean isArraySpecial(int[] nums) {
            for(int i =1;i<nums.length;i++){
                if(helper(nums[i]) == helper(nums[i-1])){
                    return false;
                }
            }
            return true;
        }
        public static boolean helper(int nums){
            if(nums %2 ==0){
                return true;
            }else {
                return false;
            }
        }
    }
}
