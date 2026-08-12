package chapter05;

public class InterestExample {
    public static void main(String[] args) {
        int principle = 10_000;
        principle *= 1.04; // 1년 후
        principle *= 1.04; // 2년 후
        principle *= 1.04; // 3년 후
        System.out.printf("3년 후 원리금 : %,d", principle);
    }
}