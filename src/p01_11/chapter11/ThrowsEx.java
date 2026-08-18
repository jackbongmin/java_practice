package chapter11;

public class ThrowsEx {
    public int quote(int divisor) throws ArithmeticException {
        return 100 / divisor;
    }
    public void run() {
        try {
            quote(0);
        } catch (ArithmeticException e) {
            System.out.println("잘못된 연산입니다.");
        }
    }
    public static void main(String[] args) {
        ThrowsEx te = new ThrowsEx();
        te.run();
    }
}