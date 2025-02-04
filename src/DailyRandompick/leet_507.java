package DailyRandompick;

public class leet_507 {

        public  static  boolean checkPerfectNumber(int num) {
            int sum =0 ;
            for(int i=1; i<num;i++){
                if(num%i ==0){
                    sum = sum + i;
                }
            }
            return sum == num;
        }

    public static void main(String[] args) {
        int test = 28;
        System.out.println(checkPerfectNumber(test));
    }
}
