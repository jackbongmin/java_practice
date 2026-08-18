package chapter11;

import java.util.Objects;
public class UserTest {
    public static void main(String[] args) {
        User user = new User("kyeongrok", Role.ADMIN);
        System.out.println(user.getRole());
        if (Objects.equals(user.getRole(), Role.ADMIN)) {
            System.out.println("관리자입니다.");
        } else {
            System.out.println("관리자가 아닙니다.");
        }
    }
}