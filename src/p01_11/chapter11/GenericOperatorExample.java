package p01_11.chapter11;

public class GenericOperatorExample {
    public static void main(String[] args) {
// String 타입을 저장하는 Box 생성
        // stringBox라는 이름의 String 타입의 변수를 Box class로 생성함.
        Box<String> stringBox = new Box<>();
        // Box안에 setItem이라는 메소드를 불러와서 stringBox가"Hello"라고 선언함 즉 stringBox = Hello가 됨.
        stringBox.setItem("Hello");
        // greeting이라는 새로운친구가 나옴 아직까지 위에랑 관련 없음
        // greeting이라는 친구는 stringBox의 getItem이라는애랑 같아고함.
        // 고로 greeting = stringBox = Hello가 됨
        String greeting = stringBox.getItem();
        // greeting은 hello기때문에 출력하면 Hello가 나온다
        System.out.println(greeting); // 출력: Hello
// Integer 타입을 저장하는 Box 생성
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        int number = intBox.getItem();
        System.out.println(number); // 출력: 42
    }
}