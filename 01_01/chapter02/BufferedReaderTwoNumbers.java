package chapter02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTwoNumbers {
    public void plusTwoNums() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 값을 두 개 입력받아 더하기
        System.out.println(br.readLine() + br.readLine());
    }
}