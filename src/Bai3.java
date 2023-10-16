import java.util.TreeMap;

public class Bai3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 4};
        TreeMap<Integer,Integer>treeMap=new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i],0);
        }
        treeMap.remove(treeMap.lastKey());
        System.out.println("so lon thu 2 la : " +treeMap.lastKey());
    }
}
