package chapter05;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.printf("x = %d\n", x);
        x += 1;
        System.out.printf("x += 1, x = %d\n", x);
        x -= 5;
        System.out.printf("x -= 5 , x = %d\n", x);
        x *= 2;
        System.out.printf("x *= 2, x = %d\n", x);
        x /= 3;
        System.out.printf("x /= 3, x = %d\n", x);
        x %= 8;
        System.out.printf("x %%= 8, x = %d\n", x);
    }
}