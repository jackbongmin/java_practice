package Test;

// 1. Student 클래스
class Student {
    String name;
}

public class Test0812_02 {

        public static void main(String[] InArgs){

            // 스샷 1번째 줄: Student를 2명 담을 수 있는 '빈 배열(칸)'만 만듦.
            // (주의: 아직 진짜 학생은 없고, 들어갈 자리만 2개 생긴 거임)
            Student[] students = new Student[2];

            // 스샷 2번째 줄: 0번째 칸에 진짜 Student 객체(실체)를 새로 구워서 넣어줌.
            students[0] = new Student();

            // 스샷 3번째 줄: 0번째 칸에 있는 학생의 name 변수에 접근해서 값을 할당(초기화)해줌.
            students[0].name = "김경록";

            // 잘 들어갔는지 출력해서 확인해보기
            System.out.println(students[0].name);
        }
    }
