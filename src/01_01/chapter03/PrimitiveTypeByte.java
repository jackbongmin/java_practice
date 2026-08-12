package chapter03;

public class PrimitiveTypeByte {
    public static void main(String[] args) {
        byte bValFrom = -128; // -129 이하는 안 됨
        byte bValTo = 127; // 128 이상은 안 됨
        System.out.printf("from:%d to:%d", bValFrom, bValTo);
    }
}