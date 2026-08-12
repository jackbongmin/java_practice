package chapter03;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory1 = new Factory(); // Factory 인스턴스화
        factory1.name = "경기1공장";
        factory1.enabled = true;
        factory1.address = "경기도 광주시 오포읍 햇빛로 173";
        factory1.machines = 5;
        System.out.printf("공장 이름:%s 가동 여부:%b \n주소:%s 기계 대수:%d",
                factory1.name, factory1.enabled, factory1.address,
                factory1.machines);
    }
}