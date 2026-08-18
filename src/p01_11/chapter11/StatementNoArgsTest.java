package chapter11;

public class StatementNoArgsTest {
    public static void main(String[] args) {
        StatementNoArgs statementNoArgs1 = () -> 10 + 10;
        System.out.println(statementNoArgs1.calculate());
    }
}