package chapter04;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); // LinkedList 선언
        linkedList.add(10); // 10 넣기
        linkedList.add(20); // 20 넣기
        System.out.println(linkedList.get(0)); // 0번째 출력
        System.out.println(linkedList.get(1)); // 1번째 출력
    }
}