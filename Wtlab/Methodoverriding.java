abstract class A{
    abstract void callme();
    void callmetoo(){
        System.out.println("CALL ME TOO");
    }
}
class B extends A{
    void callme(){
        System.out.println("CALL ME");
    }
}
public class Methodoverriding{
    public static void main(String[] args) {
        B b=new B();
        b.callme();
        b.callmetoo();
    }
}
