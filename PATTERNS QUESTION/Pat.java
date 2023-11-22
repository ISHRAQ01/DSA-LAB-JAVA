class Pat{
    public static void main(String[] args) {
        for(int i=0;i<4 ;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--){
                System.out.print("*");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<4;i++){
            for(int space=i;space>=0;space--){
                System.out.print(" ");
            }
            for(int j=i;j<4;j++){
                System.out.print("*");
            }
            for(int k=i;k<=2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}