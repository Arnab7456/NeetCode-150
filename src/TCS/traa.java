package TCS;
import java.util.Scanner;
import java.util.Stack;

public class traa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of arr ===");
        int n = sc.nextInt();
        System.out.println("array input");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = ansStack(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

    public static int[] ansStack(int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push non-zero elements to the stack
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                stack.push(arr[i]);
            }
        }

        // Pop from stack to fill the array
        int index = 0;
        while (!stack.isEmpty()) {
            arr[index++] = stack.pop();
        }

        // Fill remaining positions with 0
        while (index < n) {
            arr[index++] = 0;
        }

        return arr;
    }
}
