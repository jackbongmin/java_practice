package chapter03;

public class ConstantEx2 {
    public static void main(String[] args) {
        final int IVAL; // 앞에 final을 붙입니다.
        IVAL = 1; // 최초에 한 번 값을 지정할 수 있습니다.
//      IVAL = 2; // 한 번 지정한 후 바꿀 수 없습니다.
        System.out.println(IVAL);
    }
}