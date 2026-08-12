package chapter03;

public class SpaceInvadersMemberVariable {
    int location; // 멤버 변수 선언 그러나 초기화하지 않음
    public void moveLeft() { // 왼쪽으로 이동하는 메서드
        location = location - 1; // 기존 값에 -1
    }
    public void moveRight() { // 오른쪽으로 이동하는 메서드
        location = location + 1; // 기존 값에 +1
    }
}

// 테스트