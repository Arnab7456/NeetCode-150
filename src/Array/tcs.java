package Array;

import java.util.*;

public class tcs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range1 = 0;
        int range2 = 3;
        int ans = ans(range1,range2);
        System.out.println(ans);
        System.out.println(StringSum("123xyx"));
        System.out.println(ansUniq("google"));
        System.out.println(ansCap("take u forward is awesome"));
        System.out.println(rev("hello"));
        System.out.println(rev1("hello"));
        System.out.println(ansDuplicate("sinstriiintng"));
//        int n = in.nextInt();
//        System.out.println("arr input");
//        int arr [] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        int[] arr1 = {1, 2, 2, 3, 3};
        ansEven1(arr1);
        in.close();
    }
    public static int ans (int range1 , int range2){
        int sum  = 0;
        for (int i = range1; i <= range2; i++) {
            sum +=i;
        }
        return sum;
    }
    public static int StringSum(String ans){
        String targetSum = "0";
        int sum =0;
        for (int i = 0; i < ans.length(); i++) {
            char s = ans.charAt(i);
            if(Character.isDigit(s)){
                targetSum +=s;
            }else {
                sum +=Integer.parseInt(targetSum);
                targetSum = "0";
            }
        }
        return sum ;
    }
        public static String ansUniq(String ans){
            if(ans == null||ans.length() ==0){
                return " ";
            }
            HashMap<Character , Integer> hashMap = new HashMap<>();
            for(char test : ans.toCharArray()){
                hashMap.put(test, hashMap.getOrDefault(test,0)+1);
            }
            StringBuilder sb = new StringBuilder();
            for(char test : ans.toCharArray()){
                if (hashMap.get(test) ==1){
                    sb.append(test).append(" ");
                }
            }
            return sb.toString();
        }
        public static String ansCap(String ans){
          StringBuilder sb = new StringBuilder();
          String [] words = ans.split(" ");
            for (String word : words) {
                if (word.length() > 1){
                    sb.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1, word.length() - 1))
                            .append(Character.toUpperCase(word.charAt(word.length() - 1)))
                            .append(" ");
                }else {
                    sb.append(Character.toUpperCase(word.charAt(0))).append(" ");
                }
            }
            return sb.toString();
        }
        public static String rev(String str){
            int lefty = 0;
            int righty = str.length()-1;
            StringBuilder sb = new StringBuilder(str);
            while (righty> lefty){
              char temp = sb.charAt(lefty);
              sb.setCharAt(lefty, sb.charAt(righty));
              sb.setCharAt(righty, temp);

              lefty ++;
              righty --;

            }
            return sb.toString();
        }
        public static String rev1(String ans){
            StringBuilder sb = new StringBuilder(ans);
            sb.reverse();
            return sb.toString();
        }
        public static String ansDuplicate(String ans){
                HashMap<Character, Integer> hashMap = new HashMap<>();
                for(char ch : ans.toCharArray()){
                    hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
                }
                StringBuilder sb = new StringBuilder();
              for (char ch : hashMap.keySet()) {
                if (hashMap.get(ch) > 1) {
                    sb.append(ch).append("->").append(hashMap.get(ch)).append(" ");
                }
            }
              return sb.toString();
        }
        public static int ansEven(int [] arr){
            HashMap<Integer, Integer> hashMap= new HashMap<>();
                for(int ans : arr){
                    hashMap.put(ans, hashMap.getOrDefault(ans,0)+1);
                }

                for(int ans : hashMap.keySet()){

                    if (hashMap.get(ans) %2 ==0){
                        return hashMap.get(ans);
                    }
                }

                return -1;
        }
    public static void ansEven1(int [] arr){
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for(int ans : arr){
            hashMap.put(ans, hashMap.getOrDefault(ans,0)+1);
        }
        List<Integer> arrayLists = new ArrayList<>();
        for(int ans : hashMap.keySet()){

            if (hashMap.get(ans) %2 ==0){
                arrayLists.add(ans);
            }
        }
        if (arrayLists.isEmpty()){
            System.out.println("-1");
        }else {
            for (int num : arrayLists){
                System.out.println(num);
            }
        }
    }

    }

