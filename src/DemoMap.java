import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        System.out.println(map.isEmpty()?"map dang rong":"map dang co cac cap du lieu");
        map.put(1, "bar");
        map.put(2, "baz");
        map.put(3, "3");
        map.put(4, "4");

        map.replace(1,"100");
        map.replace(5,"10000");
        map.remove(2);
        map.remove(1,"1");


        Set<Integer>keys = map.keySet();
        System.out.println("cac cap key/value cua map la");
        for (Integer key:keys) {
            System.out.println(key+ " : " +map.get(key));
        }
    }
}
