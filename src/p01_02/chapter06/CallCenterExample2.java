package chapter06;

import java.util.Scanner;
public class CallCenterExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("고객센터 메뉴를 선택하세요 (0: 상담원 연결, 1: 요금 안내, 2: AS 접수): ");
            while (!scanner.hasNextInt()) {
                System.out.println("숫자를 입력하세요.");
                scanner.next(); // 입력 버퍼 비우기
            }
            choice = scanner.nextInt();
            String result = switch (choice) {
                case 0 -> "상담원에게 연결됩니다.";
                case 1 -> "요금 안내 서비스를 이용합니다.";
                case 2 -> "AS 접수 서비스를 이용합니다.";
                case 3, 4, 5, 6, 7, 8, 9 -> "잘못된 입력입니다. 올바른 번호를 입력하세요.";
                default -> "올바른 번호를 입력하세요.";
            };
            System.out.println(result);
        } while (choice < 0 || choice > 9);
    }
}