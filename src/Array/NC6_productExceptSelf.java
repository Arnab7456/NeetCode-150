package Array;
import java.util.*;
public class NC6_productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);

        int suffix = 1, prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= prefix;
            prefix *= nums[i];
            result[n - 1 - i] *= suffix;
            suffix *= nums[n - 1 - i];
        }

        return result;
    }

}
