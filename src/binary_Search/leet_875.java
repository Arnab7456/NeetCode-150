package binary_Search;

public class leet_875 {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int left =1;
            int right = getMax(piles);
            while(left<right){
                int mid = left + (right-left)/2;
                if(canEat(piles, mid , h)){
                    right = mid;
                }else {
                    left = mid +1;
                }
            }
            return left;
        }
        public boolean canEat(int [] piles, int k, int h){
            int totalHour =0;
            for(int pile : piles){
                totalHour += (pile + k - 1) / k;
            }
            return totalHour<=h;
        }
        public int getMax(int[] piles){
            int max = 0;
            for(int pile : piles){
                if(pile>max){
                    max = pile;
                }
            }
            return max;
        }
    }
}
