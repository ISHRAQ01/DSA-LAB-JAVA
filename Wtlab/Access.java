class A{
    int i,j;
    void setij(int x,int y){
        i=x;
        j=y;
    }
}
class B extends A{
    int total;
    void sum(){
        total=i+j;
    }
}
public class Access {
    public static void main(String[] args) {
        B b=new B();
        b.setij(10,12);
        b.sum();
        System.out.println("TOTAL: "+b.total);

    }
}
