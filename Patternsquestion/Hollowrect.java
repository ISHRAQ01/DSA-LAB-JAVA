import java.util.Scanner;

class Hollowrect{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE RANGE: ");
        int inp=sc.nextInt();
        for(int i=0;i<inp;i++){
            if(i==0){
                for(int n=i;n<inp;n++){
                    System.out.print("*");
                }
            }
            
            else{
                for(int k=0;k>=0;k--){
                    System.out.print("*");
                }
                for(int l=0;l<inp-2;l++){
                    System.out.print(" ");
                }
                for(int m=0;m>=0;m--){
                    System.out.print("*");
                }
            }
               
            System.out.println();

        }
        for(int a=0;a<inp;a++){
            System.out.print("*");
        }
        
        sc.close();
        }
        
    }
