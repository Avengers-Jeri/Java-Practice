public class Fibo {
    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= 20; ++i) {
            int a = num2;
            num2 += num1;
            num1 = a;

        }

        System.out.println(num1);
    }
}
