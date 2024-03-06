public class Greetuser{
    public static void greetuser(int n){
        if(n==0)
            return;
        System.out.println("HELLO USER");
        greetuser(n-1);
    }
    public static void main(String[] args) {
        greetuser(5);
    }
}