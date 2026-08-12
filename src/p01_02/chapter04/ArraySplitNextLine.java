package chapter04;

import java.util.Scanner;

public class ArraySplitNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        System.out.println(numbers[0] + numbers[1] + numbers[2]);
    }
}