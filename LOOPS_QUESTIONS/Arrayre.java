public class Arrayre {
    public static void main(String[] args) {
        int a[]={3,2,4,6,7};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                
            }            
        }
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1)
            System.out.print(a[i]);
            else
            System.out.print(a[i]+",");
        }

    
    }
}
