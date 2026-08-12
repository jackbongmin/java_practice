package chapter06;

import java.util.Scanner;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 입력해 주세요. (예: 화)");
        String day = sc.next();
        String time = "휴진";
        switch (day) {
            case "월", "화", "목", "금": time = "09:30-18:30"; break;
            case "토": time = "09:30-13:00"; break;
            case "수", "일": time = "휴진"; break;
            default: throw new IllegalArgumentException("잘못된 요일:" + day);
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}