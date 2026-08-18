package chapter11;

public class GenericTwoTypesFlIn implements GenericInterfaceTwoTypes<Float, Integer> {
    @Override
    public Float calculate(Integer val1, Integer val2) {
        return (float) val1 / val2;
    }
}