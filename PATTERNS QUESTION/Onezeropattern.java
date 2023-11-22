public class Onezeropattern {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                //even=0//
                if(k%2==0){
                    System.out.print(0);

                }
                else{
                    System.out.print(1);
                }
                k++;
               
            }
            
            System.out.println();
        }
        
    }
    
}
