class Npattern{
    public static void main(String[] args) {
       int n=4;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0 || i==6 || j==0 || j==6)
                    System.out.print(n);
                else if(j==1 || i==1 || i==5 || j==5)
                    System.out.print(n-1);
                else if(i==3 && j==3)
                    System.out.print(n-3);
                else if(i==2 || i==4 || j==2 || j==4)
                    System.out.print(n-2);
                else
                    System.out.print(" ");
            }
            
            System.out.println();
            
        }
       
    }
}