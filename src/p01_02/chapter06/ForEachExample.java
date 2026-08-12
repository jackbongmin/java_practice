package chapter06;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7};
        for (int num: arr) {
            System.out.printf("%d ", num);
        }
    }
}