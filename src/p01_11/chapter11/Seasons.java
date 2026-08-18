package chapter11;

public enum Seasons {
    SPRING(1), SUMMER(2), FALL(3), WINTER(4);
    private final int value;
    Seasons(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}