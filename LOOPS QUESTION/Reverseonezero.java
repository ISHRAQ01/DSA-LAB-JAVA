public class Reverseonezero {
    public static void main(String[] args) {
        int[] a={0,0,1,1,1,1,1,1,1,1,0,0,0,0};
        int c=0;
        int c1=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0)
                c+=1;
            else
                c1+=1;
        }
        int n=a.length-c1;
        for (int i = 0; i <=c; i++) {
            if(i==n){
                for (int j= n; j<a.length; j++) 
                    a[j]=1;
            }
            else
                a[i]=0;  
        }
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1)
                System.out.print(a[i]+"}");
            else    
                System.out.print(a[i]+",");
            
        }
    }
}




