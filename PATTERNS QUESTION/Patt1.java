class Patt1{
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(i==n-(j+1) || i==j-(n-1)){
                    System.out.print("1");
                }
                else if(i==2 && j==3) {
                    System.out.print(n-2);
                }
                else if(i==3 && j==2 || i==3 && j==4){
                    System.out.print(n-1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}