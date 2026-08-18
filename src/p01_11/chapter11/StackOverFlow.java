package chapter11;

import java.util.Stack;
public class StackOverFlow {
    public static void main(String[] args) {
        Stack st = new Stack();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            st.push(100);
        }
    }
}