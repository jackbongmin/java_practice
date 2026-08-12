package chapter03;

public class HelloSubstring {
    public static void main(String[] args) {
        String str = "Hello";
        String firstLetter = str.substring(0, 1); // 첫 번째 글자(H) 자르기
        System.out.println(firstLetter);
    }
}