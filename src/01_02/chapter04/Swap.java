package chapter04;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[0]; // 0번 인덱스에 있는 값을 임시로 저장
        arr[0] = arr[1]; // 1번 인덱스에 있는 값을 0번 인덱스에 덮어쓰기
        arr[1] = temp; // 임시로 저장한 값을 1번 인덱스에 넣기
        System.out.println(Arrays.toString(arr));
    }
}