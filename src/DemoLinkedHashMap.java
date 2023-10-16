import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer>hashMap=new HashMap<>();
        hashMap.put(4,4);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(1,1);


        Map<Integer,Integer>linkedHasMap=new LinkedHashMap<>();
        linkedHasMap.put(4,4);
        linkedHasMap.put(2,2);
        linkedHasMap.put(3,3);
        linkedHasMap.put(1,1);
    }
}
