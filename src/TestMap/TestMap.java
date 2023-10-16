package TestMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String>hashMap=new HashMap<>();
        hashMap.put("a","30");
        hashMap.put("b","35");
        hashMap.put("c","88");
        hashMap.put("d","nanhd");
        hashMap.put("e","hdhgdjdj");
        System.out.println("display entries in HashMap");
        System.out.println(hashMap + "\n");



//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Smith", 30);
//        linkedHashMap.put("Anderson", 31);
//        linkedHashMap.put("Lewis", 29);
//        linkedHashMap.put("Cook", 29);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Smith"));


    }
}
