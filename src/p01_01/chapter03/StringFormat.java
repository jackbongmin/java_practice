package chapter03;

public class StringFormat {
    public static void main(String[] args) {
        String name = "김경록";
        int balance = 10000;
        String result = String.format("%s 님의 통장 잔고는 %d원입니다.", name, balance);
        System.out.println(result);
    }
}