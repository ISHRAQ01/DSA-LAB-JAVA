public class Sort0and1 {
    public static void main(String[] args) {
        int a[]={0,1,1,1,0,0,0};
        int z=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0)
                z+=1;
            
        }
        for (int i = 0; i < a.length; i++) {
            if(i<z)
                a[i]=0;
            else   
                a[i]=1;
        }
        for (int i : a) {
            System.out.print(i+" ");
            
        }
    }

}
