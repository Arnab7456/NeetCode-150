package Array;
import java.io.*;
import java.util.*;
public class tes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextToken();
        }

//            for (int i = 0; i < n; i++) {
//                System.out.println(arr[i]);
//            }

        String test = validTest(arr);
        System.out.println(test);
        System.out.println(validTest1(arr));
        System.out.println(validTest2(arr));
    }

    public static String validTest(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String ans : arr) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        HashSet<String> hashSet = new HashSet<>();
        for (String ans : map.keySet()) {
            if (map.get(ans) == 1) {
                hashSet.add(ans);
            }
        }

        return hashSet.toString();
    }

    public static String validTest1(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String ans : arr) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        for (String ans : map.keySet()) {
            if (map.get(ans) > 1) {
                return ans;
            }
        }

        return " ";
    }

    public static int validTest2(String[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String ans : arr) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        int max = 0;

        for (String ans : map.keySet()) {
            if (map.get(ans) > max) {
                max = map.get(ans);
                max++;

            }
        }

        return max;
    }
}



