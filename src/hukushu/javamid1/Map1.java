package hukushu.javamid1;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","값");
        String s = map.get("1");
        System.out.println("s = " + s);


    }
}
