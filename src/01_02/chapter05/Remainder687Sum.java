package chapter05;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int a = num % 10; // 687을 10으로 나눈 나머지
        num = num / 10; // num = 68
        int b = num % 10; // 68을 10으로 나눈 나머지
        num = num / 10; // num = 6
        int c = num % 10; // 6을 10으로 나눈 나머지
        System.out.println(a + b + c);
    }
}