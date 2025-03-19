package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class tess {
    public static void main(String [] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String ans = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());  // Reading an integer
        System.out.println(ans);
        System.out.println(age);

        int n = Integer.parseInt(bufferedReader.readLine());
        int arr [] = new int[n];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
