public class Seconmax {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int max= Integer.MIN_VALUE;
        int pre= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
            max=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(pre<arr[i] && arr[i]!=max)
             pre=arr[i];

            
        }
        System.out.println("SECOND MAX="+pre);

    }
    
}

