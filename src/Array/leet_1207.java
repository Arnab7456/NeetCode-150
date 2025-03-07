package Array;
import java.util.*;
/*

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */
public class leet_1207 {
    public static int uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int arr1 : arr){
            set.put(arr1, set.getOrDefault(arr1,0)+1);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr [] = {1,2,2,1,1,3};
        int ans = uniqueOccurrences(arr);
        boolean anss = uniqueOccurrences1(arr);
        System.out.println(ans);
        System.out.println(anss);
    }
    public static boolean uniqueOccurrences1(int[] arr) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int arr1 : arr){
            set.put(arr1, set.getOrDefault(arr1,0)+1);
        }
        HashSet <Integer> hashSet = new HashSet<>();
        for (int freq : set.values()){
            if (!hashSet.add(freq)){
                    return false;
            }
        }
        return true;
    }

}
