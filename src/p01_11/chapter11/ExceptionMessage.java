package chapter11;

public class ExceptionMessage {
    public static String returnNull() {
        return null;
    }
    public static void main(String[] args) {
        String str = returnNull();
        System.out.println(str.length());
    }
}