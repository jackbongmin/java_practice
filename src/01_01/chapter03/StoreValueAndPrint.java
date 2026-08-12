package chapter03;

import java.util.Scanner;
public class StoreValueAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(); // 첫 번째 입력 값 저장
        int second = sc.nextInt(); // 두 번째 입력 값 저장
        // 첫 번째 입력 값, 두 번째 입력 값, 더한 값 출력
        System.out.printf( "%d과(와) %d의 합은 %d입니다.", first, second, first + second);
    }
}