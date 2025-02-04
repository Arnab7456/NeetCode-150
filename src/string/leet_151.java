package string;

public class leet_151 {
    public static String reverseWords(String s) {
        String [] word = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = word.length- 1 ; i>=0 ; i--){
            if(!word[i].trim().isEmpty()){
                sb.append(word[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String ans = "the sky is blue";
        System.out.println(reverseWords(ans));
    }
}