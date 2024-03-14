class A{
    int i;
}
class B extends A{
    int i;
    B(int a,int b){
        super.i=a;
        i=b;
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        B b=new B(10,12);
        System.out.println("VALUE OF i IS: "+b.i);
        System.out.println("VALUE OF i IS: "+((A)b).i);
    }
}
