static class CAR{
    CAR obj;
    //THIS IS DEFAULT CONSTRUCTOR
    private CAR(){};
}
static CAR createObject(){
    if(obj==null){
        obj=new CAR();
    }
    return obj;
}
public class Singleton {
    public static void main(String[] args) {
        CAR car1=CAR.createObject();
        CAR car2=CAR.createObject();
        CAR car3=CAR.createObject();
        CAR car4=CAR.createObject();
        CAR car5=CAR.createObject();
        // CAR car1=new CAR();
        // CAR car2=new CAR();
        // CAR car3=new CAR();
        // CAR car4=new CAR();
        // CAR car5=new CAR();
    }
}
