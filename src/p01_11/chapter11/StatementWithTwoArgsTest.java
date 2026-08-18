package chapter11;

public class StatementWithTwoArgsTest {
    public static void main(String[] args) {
        StatementWithTwoArgs stmt1 = (x, y) -> x + y;
        StatementWithTwoArgs stmt2 = (x, y) -> 2 * x + 3 * y;
        System.out.println(stmt1.calculate(10, 20));
        System.out.println(stmt2.calculate(5, 6));
    }
}