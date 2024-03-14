public class Runningsum{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int[] b=new int[a.length];
        b[0]=a[0];   
        for (int i = 1; i < a.length; i++) {
            b[i]=b[i-1]+a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
    }
