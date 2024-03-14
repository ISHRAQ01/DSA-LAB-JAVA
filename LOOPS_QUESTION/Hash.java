import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2};
        int n=arr.length;
        HashMap< Integer , Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for (int num : arr) {
            if(map.get(num)!=1){
                System.out.println(num);
            }
        }
        System.out.println(map);
    }
}
