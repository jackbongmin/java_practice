package chapter11;

public class GenericInterfaceTest {
    public static void main(String[] args) {
        GenericInterface<Float> gi = new FloatGeneric();
        float fResult = gi.calculate(10.1f, 10.2f);
        System.out.println(fResult);
        GenericInterface<String> gis = new StringGeneric();
        String sResult = gis.calculate("hello", "world");
        System.out.println(sResult);
    }
}