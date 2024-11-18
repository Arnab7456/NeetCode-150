package Two_pointer;

public class NC10_twoSum_2 {
//    brute force
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[] { i + 1, j + 1 };
                    }
                }
            }
            return new int[]{};
        }
    }
//    Optimised Two pointer approach
        public int[] twoSum(int[] nums, int target) {
            int left =0 ; int right = nums.length-1;
            while(left <right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    return new int [] {left+1 ,right+1};
                }else if(sum<target){
                    left++;
                }else{
                    right --;
                }
            }
            return new int []{};
        }
    }
