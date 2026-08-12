package chapter06;

public class IfElseIfExample {
    public static void main(String[] args) {
        String hospitalName = "분당 화이트 치과";
        if (hospitalName.contains("이비인후과")) {
            System.out.println("귀, 코, 목");
        } else if (hospitalName.contains("치과")) {
            System.out.println("치아");
        } else if (hospitalName.contains("안과")) {
            System.out.println("눈");
        } else if (hospitalName.contains("정형외과")) {
            System.out.println("뼈");
        } else {
            System.out.println("기타");
        }
    }
}