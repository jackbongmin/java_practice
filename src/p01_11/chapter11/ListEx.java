package chapter11;

import java.util.ArrayList;
import java.util.List;
public class ListEx {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(10);
        iList.add(20);
        int number = iList.get(1);
        System.out.println(number);
        List<String> sList = new ArrayList<>();
        sList.add("Hello");
        sList.add("Bye");
        String greeting = sList.get(0);
        System.out.println(greeting);
    }
}