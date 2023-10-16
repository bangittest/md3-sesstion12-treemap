package HashMap;

import java.util.HashMap;

public class Main {
        public static void main(String[] args) {
            // Bước 1: Khai báo mảng
            int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 4};

            // Bước 2: Sử dụng HashMap để đếm số lần xuất hiện của mỗi phần tử
            HashMap<Integer, Integer> elementCountMap = new HashMap<>();

            for (int element : arr) {
                if (elementCountMap.containsKey(element)) {
                    // Phần tử đã tồn tại trong HashMap, tăng số lần xuất hiện lên 1
                    int count = elementCountMap.get(element);
                    elementCountMap.put(element, count + 1);
                } else {
                    // Phần tử chưa tồn tại trong HashMap, thêm vào với số lần xuất hiện ban đầu là 1
                    elementCountMap.put(element, 1);
                }
            }

            // Bước 3: Duyệt qua HashMap và in ra số lần xuất hiện của từng phần tử
            for (int key : elementCountMap.keySet()) {
                int count = elementCountMap.get(key);
                System.out.println("Phần tử " + key + " xuất hiện " + count + " lần");
            }
        }

}
