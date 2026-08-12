package chapter02;

import java.util.Scanner;

public class ScannerEx {
    public void readTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        // 문자열을 처리하기 위해 sc.next() 사용
        System.out.println(sc.next() + sc.next());
    }
}