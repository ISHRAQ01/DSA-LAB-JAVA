public class Revereseonetwo {
    public static void main(String[] args) {
            int[] a={0,1,1,2,2,2,1,1,2,1,2,0,2,1,2,1,2,1,2,2,2,2,1,1,1,0,0,0,0,0,0,0,0,0,1,0,1,2,1,0};
            int c=0;
            int c1=0;
            int c2=0;
            for (int i = 0; i < a.length; i++) {
                if(a[i]==0)
                    c+=1;
                else if(a[i]==2)
                    c2+=1;
                else
                    c1+=1;
            }
            System.out.println("NO OF ZERO'S="+c+" NO OF ONES="+c1+"NO OF TWO'S="+c2);
            int n=a.length-c2;
            for (int i = 0; i <c; i++)
                a[i]=0;

            for (int i = c; i <=n; i++) {
                if(i==n){
                    for (int j = n; j < a.length; j++) {
                        a[j]=2;
                        
                    }
                }
                else
                    a[i]=1;
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
