public class Exception {
    public static void main(String[] args) {
        int i=5;
        int j=0;
        try{
            System.out.println(i / j);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }    
}
}
