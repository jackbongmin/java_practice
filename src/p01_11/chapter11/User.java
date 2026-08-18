package chapter11;

public class User {
    private String userName;
    private Role role;
    public User(String userName, Role role) {
        this.userName = userName;
        this.role = role;
    }
    public String getUserName() {
        return userName;
    }
    public Role getRole() {
        return role;
    }
}