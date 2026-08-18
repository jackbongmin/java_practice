package chapter11;

public class StatementWithArgTest {
    public static void main(String[] args) {
        StatementWithArg statement = val -> val + 10;
        System.out.println(statement.calculate(30));
    }
}