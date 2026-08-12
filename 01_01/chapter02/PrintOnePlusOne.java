package chapter02;

public class PrintOnePlusOne {
    public void print() {
        System.out.println(1 + 1);
    }
    public static void main(String[] args) {
        PrintOnePlusOne printOnePlusOne = new PrintOnePlusOne();
        printOnePlusOne.print(); // print() 메소드 호출
    }
}