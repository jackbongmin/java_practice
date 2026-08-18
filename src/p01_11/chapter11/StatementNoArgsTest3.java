package chapter11;

public class StatementNoArgsTest3 {
    public static void main(String[] args) {
        StatementNoArgs statementNoArgs1 = () -> {
            int val = 20;
            return val + 10;
        };
        System.out.println(statementNoArgs1.calculate());
    }
}