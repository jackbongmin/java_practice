package chapter05;

public class TernaryOperatorEx {
    public static void main(String[] args) {
        int enabled = 1;
        String onOff = enabled == 1 ? "On" : "Off";
        System.out.println(onOff);
    }
}