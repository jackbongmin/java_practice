package chapter05;

public class PivotIdx {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9}; // 길이가 홀수 개인 배열
        int pivot = arr.length / 2; // 가운데 인덱스 값을 구함
        System.out.printf("length:%d pivot:%d midValue:%d\n", arr.length, pivot, arr[pivot]); // 가운데 인덱스로 배열 가운데 있는 값에 접근
        int[] arr2 = new int[]{3, 4, 6, 8}; // 길이가 짝수 개인 배열
        int pivot2 = arr2.length / 2;
        System.out.printf("length:%d pivot:%d midValue:%d\n", arr2.length, pivot2, arr2[pivot2]);
    }
}