import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 2, -1, 5, 4, 3, 2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], count);
        }
        int maxCount = 0;
        int max = 0;

        for (int key : map.keySet()) {
            int count = map.get(key);
            System.out.println("Phan tu " + key + " xuat hien " + count + " lan");
            if (count > maxCount) {
                maxCount = count;
                max = key;
            }
        }

        System.out.println("So xuat hien nhieu nhat la: " + max);
    }
}
