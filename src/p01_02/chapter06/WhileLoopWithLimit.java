package chapter06;

import java.util.Scanner;

public class WhileLoopWithLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        final int MAX_ATTEMPTS = 10;
        while (counter < MAX_ATTEMPTS) {
            System.out.print("숫자를 입력하세요 (남은 기회: " + (MAX_ATTEMPTS -
                    counter) + "): ");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                System.out.println("사용자가 0을 입력했으므로 프로그램을 종료합니다.");
                break;
            }
            // 사용자가 0을 입력하지 않은 경우, 다음 반복을 위해 카운터를 증가시킵니다.
            counter++;
        }
    }
}