package chapter03;

public class StringEqualsSubstring {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0, 1).equals(str2));
    }
}