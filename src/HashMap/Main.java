package HashMap;

import java.util.HashMap;

public class Main {
        public static void main(String[] args) {
            int[] arr = {1,4,2,2,-1,5,4,3,2};


            HashMap<Integer, Integer> map = new HashMap<>();

            for (int element : arr) {
                if (map.containsKey(element)) {
                    int count = map.get(element);
                    map.put(element, count + 1);
                } else {
                    map.put(element, 1);
                }
            }
            for (int key : map.keySet()) {
                int count = map.get(key);
                System.out.println("Phần tử " + key + " xuất hiện " + count + " lần");
            }



        }

}
