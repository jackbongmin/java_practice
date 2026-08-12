package chapter03;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 10; // x에 10이라는 값 할당
        point.y = 20; // y에 20이라는 값 할당
        // 할당한 값을 .(멤버 접근 연산자)로 접근해 출력
        System.out.println("Point: (" + point.x + ", " + point.y + ")");
    }
}