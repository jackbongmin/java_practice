package chapter03;

public class SpaceInvaderMemberVariableTest2 {
    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        System.out.println(simv.location);
        simv.moveLeft();
        System.out.println(simv.location);
        simv.moveLeft(); // 왼쪽로 한 칸 더 이동 -1
        System.out.println(simv.location);
    }
}