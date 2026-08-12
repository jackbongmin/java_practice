package chapter03;

public class ConstantEx {
    public static void main(String[] args) {
        final int IVAL; // 변수 선언 앞에 final을 붙입니다.
        IVAL = 1; // 최초에 한 번 값을 지정할 수 있습니다.
        System.out.println(IVAL);
    }
}