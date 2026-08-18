package chapter11;

public class EnumSwitchErr {
    public static void main(String[] args) {
        // 에러가 있어서 주석처리 주석 풀고 보세요
        Role role = Role.ADMIN;
//        int result = switch (role) {
//            case ADMIN -> 1;
//            case MANAGER -> 2; // case USER -> 3;이 빠졌음
//        };
//        System.out.println(result);
    }
}