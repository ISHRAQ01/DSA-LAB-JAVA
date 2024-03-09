public class Question {
    public static void main(String[] args) {
        int x=5,y=7;
        System.out.println('x'+x); //here it is taking character value of x
        System.out.println('y'+y); //here it is taking character value of y
        //looping question
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            if(i%2==0) continue;
            System.out.println(" ");
        }
        
    }
}
