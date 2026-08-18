package chapter11;

public class GenericOperatorExample {
    public static void main(String[] args) {
// String 타입을 저장하는 Box 생성
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        String greeting = stringBox.getItem();
        System.out.println(greeting); // 출력: Hello
// Integer 타입을 저장하는 Box 생성
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        int number = intBox.getItem();
        System.out.println(number); // 출력: 42
    }
}