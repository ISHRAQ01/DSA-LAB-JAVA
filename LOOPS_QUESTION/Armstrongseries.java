class Armstrongseries{
    public static void main(String[] args) {
        int c=0;
        int sum=0;

        for(int i=1;i<=1000;i++){
            int temp=i;
            int count=i;
            while(count!=0){
                count/=10;
                c+=1;
            }
            
            while(temp!=0){
                int rem=temp%10;
                temp/=10;
                sum+=Math.pow(rem,c);
            }
            if(i==sum){
                System.out.println("ARMSTRONG NUMBER'S ARE="+i);
            }
            c=0;
            sum=0;
            
        }
    }
}