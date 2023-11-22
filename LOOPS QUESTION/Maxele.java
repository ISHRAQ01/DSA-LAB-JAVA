public class Maxele {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,8};
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
                min=arr[i];
            
        }
        System.out.println("MAXIMUM ELEMENT IS="+max);
        System.out.println("MINMIUM ELEMENT IS="+min);
    }
    
}