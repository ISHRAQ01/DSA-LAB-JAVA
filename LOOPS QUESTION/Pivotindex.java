class Pivotindex{
    static int pivot(int a[]){
        int sum=0;
        int l=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(l==sum-l-a[i])
                return i;
            else
                l+=a[i];            
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,1,2,3};
        System.out.println("PIVOT INDEX="+pivot(a));
    }
}