package oops.Method;

public class overloadingg {
    public static class Operatiosn {
        public int add(int a, int b) {
            return a * b;
        }
        public float add(float a, float b) {
            return a + b;
        }
        public double add(double a, double b) {
            return a - b;
        }
        public int add (int a , int b , int c){
            int ans = a + b + c;
            return ans;
        }

        public void show (String name , int age){
            System.out.printf("age =" + age);
            System.out.printf("name =" + name);
        }
        public void show (int age, String name){
            System.out.printf("name =" + name);
            System.out.printf("age =" + age);
        }



        public static void main(String[] args) {
                Operatiosn ans = new Operatiosn();
            System.out.println(ans.add(5,4));
            System.out.println(ans.add(5.55,4.55));
            System.out.println(ans.add(54847845,5487));
            System.out.println(ans.add(5,4,6));
            ans.show(45,"Heb");
            ans.show("arnab", 7);
        }
    }

}
