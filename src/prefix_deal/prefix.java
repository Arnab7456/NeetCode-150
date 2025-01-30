package prefix_deal;

public class prefix {
    public static void main(String[] args) {
        int arr [] = {2,3,7,5};
        int[] prefixSums = Prefix_sum(arr);
        for (int ans : prefixSums){
            System.out.println(ans);
        }
    }
    public static  int [] Prefix_sum (int [] arr){
        int[] prefixSums = new int[arr.length];
        prefixSums[0] = arr[0];
        for (int i = 1; i < arr.length;  i++) {
            prefixSums[i] = prefixSums[i-1] + arr[i];
        }
        return prefixSums;
    }
}
