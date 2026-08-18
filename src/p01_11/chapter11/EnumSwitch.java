package chapter11;

public class EnumSwitch {
    public static void main(String[] args) {
        Role role = Role.ADMIN;
        int result = switch (role) {
            case ADMIN -> 1;
            case MANAGER -> 2;
            case USER -> 3;
        };
        System.out.println(result);
    }
}