package chapter06;

public class WhileCountdown {
    public static void main(String[] args) {
        int cnt = 5;
        while (cnt > 0) {
            System.out.println(cnt--);
        }
    }
}