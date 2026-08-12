package chapter02;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput2 {
    public void readTwoChars() throws IOException {
        InputStreamReader is;
        is = new InputStreamReader(System.in);
        System.out.println(is.read());
// 한 글자 더 읽어서 코드 출력
        System.out.println(is.read());
    }
}