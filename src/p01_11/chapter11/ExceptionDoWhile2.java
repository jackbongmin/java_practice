package chapter11;

import java.util.Scanner;
public class ExceptionDoWhile2 {
    public void run() {
        int input;
        do {
            System.out.print("숫자를 입력해 주세요:");
            input = new Scanner(System.in).nextInt();
            System.out.printf("%d(으)로 나눈 몫은 %d입니다.\n", input, 100 /
                    input);
        } while (input != 9);
    }
    public static void main(String[] args) {
        ExceptionDoWhile2 exceptionDoWhile = new ExceptionDoWhile2();
        exceptionDoWhile.run();
    }
}