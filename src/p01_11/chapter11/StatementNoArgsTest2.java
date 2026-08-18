package chapter11;

public class StatementNoArgsTest2 {
    public static void main(String[] args) {
        int val = 20;
        StatementNoArgs statementNoArgs1 = () -> val + 10;
        System.out.println(statementNoArgs1.calculate());
    }
}