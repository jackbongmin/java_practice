package chapter06;

import java.util.Scanner;
public class CallCenterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("고객센터 메뉴를 선택하세요 (0: 상담원 연결, 1: 요금 안내, 2: AS 접수): ");
            choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("상담원에게 연결됩니다.");
            } else if (choice == 1) {
                System.out.println("요금 안내 서비스를 이용합니다.");
            } else if (choice == 2) {
                System.out.println("AS 접수 서비스를 이용합니다.");
            } else if (choice >= 3 && choice <= 9) {
                System.out.println("잘못된 입력입니다. 올바른 번호를 입력하세요.");
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        } while (choice < 0 || choice > 9);
    }
}