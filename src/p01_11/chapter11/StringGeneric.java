package chapter11;

public class StringGeneric implements GenericInterface<String> {
    @Override
    public String calculate(String val1, String val2) {
        return val1 + val2;
    }
}