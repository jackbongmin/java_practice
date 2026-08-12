package chapter03;

public class KoreaSubstringFront {
    public static void main(String[] args) {
        String str = "대한민국";
        String subStr = str.substring(0, 2); // 인덱스 0부터 2 미만까지 자르기
        System.out.println(subStr);
    }
}