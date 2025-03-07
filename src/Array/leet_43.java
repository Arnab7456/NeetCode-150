package Array;

import java.math.BigInteger;

public class leet_43 {
    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger ans = n1.multiply(n2);
        return ans.toString();

    }

    public static void main(String[] args) {
        String num1 = "123456789012345678901234567890";
        String num2 = "987654321098765432109876543210";
        String res = multiply(num1,num2);
        System.out.println(res);
    }
}
