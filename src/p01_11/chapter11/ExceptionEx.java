package chapter11;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (ArithmeticException e) {
            System.out.println("예외가 발생했습니다.");
        }
    }
}