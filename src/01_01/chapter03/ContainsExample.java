package chapter03;

public class ContainsExample {
    public static void main(String[] args) {
        String hospitalNameA = "성남 상록 이비인후과";
        String hospitalNameB = "분당 화이트 치과";
        String hospitalNameC = "영광 의원";
        System.out.println(hospitalNameA.contains("치과"));
        System.out.println(hospitalNameB.contains("치과"));
        System.out.println(hospitalNameC.contains("치과"));
    }
}