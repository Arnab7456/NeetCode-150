package sliding_window;

public class leet_121 {
    public static int maxProfit(int[] prices) {
        int bestTime = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if(bestTime <prices[i]){
                int maxPro = prices[i] - bestTime;
                max = Math.max(max , maxPro);
            }else{
                bestTime = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int data [] = {7,1,5,3,6,4};
        int ans = maxProfit(data);
        System.out.println(ans);
    }
}
