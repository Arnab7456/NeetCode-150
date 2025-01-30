package Array;

public class leet_3111 {
    public static int scoreOfString(String s) {
        int sum  =0;
        for (int i = 0; i < s.length()-1; i++) {
            sum  += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        String ans = "hello";
        System.out.println(scoreOfString(ans));
    }
}
