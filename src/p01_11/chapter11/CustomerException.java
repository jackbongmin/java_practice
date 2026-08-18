package chapter11;

public class CustomerException {
    public static void main(String[] args) {
        Customer customer = new Customer("김경록", 16);
        if (customer.getAge() < 18) {
            throw new IllegalArgumentException("18세 미만입니다.");
        }
    }
}