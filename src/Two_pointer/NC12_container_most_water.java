package Two_pointer;

public class NC12_container_most_water {
    class Solution {
        public int maxArea(int[] height) {
            int left =0;
            int right = height.length-1;
            int max = 0;
            while (left<right){
                int w = right-left;
                int h = Math.min(height[left] , height[right]);
                int area = w*h;
                max = Math.max(max, area);

                if (height[left]< height[right]){
                    left++;
                }else if (height[left] > height[right]){
                    right--;
                }else{
                    left++;
                    right --;
                }
            }
            return max;
        }
    }
}
