package chapter02;

import java.util.Scanner;

public class ScannerWithGuide3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fValue = sc.nextFloat(); // 소수점 6자리까지
        double dValue = sc.nextDouble();
        System.out.println(fValue);
        System.out.println(dValue);
    }
}