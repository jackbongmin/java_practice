package chapter06;

public class WhileFactorial {
    public static void main(String[] args) {
        int num = 5;
        while (num > 0) {
            System.out.println(num--);
        }
    }
}