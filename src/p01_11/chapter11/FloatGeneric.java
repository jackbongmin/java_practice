package chapter11;

public class FloatGeneric implements GenericInterface<Float> {
    @Override
    public Float calculate(Float val1, Float val2) {
        return (float) val1 + val2;
    }
}