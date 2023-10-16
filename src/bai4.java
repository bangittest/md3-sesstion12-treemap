import java.util.Map;
import java.util.TreeMap;

public class bai4 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 4};
            TreeMap<Integer,Integer> treeMap=new TreeMap<>();
            for (int j : arr) {
                treeMap.put(j, 0);
            }
            Map.Entry<Integer, Integer> choice= treeMap.firstEntry();
            System.out.println("so nho nhat la : " + choice.getKey());
        }

}
