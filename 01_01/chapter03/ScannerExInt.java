package chapter03;

import java.util.Scanner;
public class ScannerExInt {
    public void readTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
    }
    //새로 추가한 메인 메서드
    public static void main(String[] args) {
        ScannerExInt scannerExInt = new ScannerExInt();
        scannerExInt.readTwoNumbersAndPlus();
    }
}