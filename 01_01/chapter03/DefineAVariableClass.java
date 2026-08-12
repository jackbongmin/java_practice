package chapter03;

public class DefineAVariableClass {
    public static void main(String[] args) {
        PrintHello printHello; // PrintHello 타입으로 변수 선언
        printHello = new PrintHello(); // PrintHello 클래스를 인스턴스화
        printHello.print(); // print() 메서드 호출
    }
}