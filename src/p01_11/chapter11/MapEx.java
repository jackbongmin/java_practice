package chapter11;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> ssMap = new HashMap<>();
        ssMap.put("name", "Kyeongrok");
        ssMap.put("phone", "010-1234-1234");
        Map<String, Integer> siMap = new HashMap<>();
        siMap.put("A", 10);
        siMap.put("B", 20);
    }
}