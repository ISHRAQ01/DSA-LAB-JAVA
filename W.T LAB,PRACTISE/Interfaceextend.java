interface A{
    void call();
}
interface B extends A{
    public void call2();
}
class Myclass implements B{
    public void call(){
        System.out.println("HELLO USER");
    }
    public void call2(){
        System.out.println("HELLO DEVELOPER");
    }
}
public class Interfaceextend {
    public static void main(String[] args) {
        B b=new Myclass();
        b.call();
        b.call2();
    }
}
