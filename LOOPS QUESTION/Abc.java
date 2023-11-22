import java.util.HashMap;

public class Abc {
    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 3, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (int i : a) {
            if (map.get(a) == 1)
                System.out.println(a);

        }
        System.out.println(map);
    }

}
