class A extends Thread{
    public void run(){
        System.out.println("IN A");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("IN B");
    }
    public void run(int x){
        System.out.println("IN B");
    }
}
class C extends Thread{
    public void run(){
        System.out.println("IN C");
    }
}
public class Multithread {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        b.run(5);
        a.start();
        b.start();
        c.start();
    }
}
