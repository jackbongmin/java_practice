package chapter03;

public class IndexOfExample {
    public static void main(String[] args) {
        String hospitalNameA = "성남 상록 이비인후과";
        String hospitalNameB = "분당 화이트 치과";
        String hospitalNameC = "영광 의원";
        System.out.println(hospitalNameA.indexOf("화이트"));
        System.out.println(hospitalNameB.indexOf("화이트"));
        System.out.println(hospitalNameC.indexOf("화이트"));
    }
}