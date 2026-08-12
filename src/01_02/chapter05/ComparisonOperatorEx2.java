package chapter05;

public class ComparisonOperatorEx2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
    }
}