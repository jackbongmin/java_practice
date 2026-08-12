package chapter02;

import java.io.IOException;

public class BufferedReaderTwoNumbersTest {
    public static void main(String[] args) throws IOException {
// BufferedReaderTwoNumbers 인스턴스화하기
        BufferedReaderTwoNumbers brtn = new BufferedReaderTwoNumbers();
// 앞에서 만든 plusTwoNums() 호출하기
        brtn.plusTwoNums();
    }
}