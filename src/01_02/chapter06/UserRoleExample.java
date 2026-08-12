package chapter06;

public class UserRoleExample {
    public static void main(String[] args) {
        String userRole = "admin";
        switch (userRole) {
            case "admin":
                System.out.println("관리자 권한: 모든 기능에 접근 가능");
                break;
            case "editor":
                System.out.println("편집자 권한: 글 편집 가능");
                break;
            case "viewer":
                System.out.println("뷰어 권한: 글 읽기만 가능");
                break;
            default:
                System.out.println("알 수 없는 역할");
        }
    }
}