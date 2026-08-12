package chapter03;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        // double 타입인 d를 int 타입으로 강제 형 변환
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);
    }
}