public class Arraymiss {
    public static void main(String[] args) {
        int a[]={3,2,4,6,7};
        int n= Integer.MIN_VALUE;
        int sum=0;
        int m=a[0];
        for (int i = 0; i < a.length; i++) {
            if(n<a[i])
            n=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(m>a[i])
                m=a[i];
        }
        System.out.println("SPANNED NUMBER="+(n-m));
        for (int i = m; i <=n; i++) {
            sum+=i;
            
        }
        int miss=0;
        for (int i = 0; i < a.length; i++) {
            miss+=a[i];
        }
        miss=sum-miss;
        System.out.println("MISSING NUMBER IS="+miss);
    }
}
