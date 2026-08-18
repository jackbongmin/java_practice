package chapter11;

public class GenericTwoTypesTest {
    public static void main(String[] args) {
        GenericTwoTypesFlIn gttfi = new GenericTwoTypesFlIn();
        float fResult = gttfi.calculate(5, 2);
        System.out.println(fResult);
    }
}