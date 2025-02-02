package binary_Search;

public class leet_704 {
    public int search(int[] nums, int target) {
            int left =0;
            int right = nums.length -1;
            while (left <right){
                int mid = left + (right - left) /2;
                if(target < nums[mid]){
                    right = mid -1;
                }else if (target > nums[mid]){
                    left += mid;
                }else {
                    return mid;
                }
            }
            return -1;
    }
}