package chapter02;

import java.util.Scanner;

public class ScannerWithGuide {
    public void printWithScanner() {
    Scanner sc = new Scanner(System.in);
    // 입력을 받기 전 println()으로 안내문 먼저 출력하기
        System.out.println("두 개의 숫자를 입력하세요.");
        System.out.println("첫 번째 숫자:" + sc.nextInt() + " 두 번째 숫자:" + sc.nextInt());
    }
}