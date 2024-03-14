public class Throwsdemo {
    static void throwone() throws IllegalAccessException{
        System.out.println("INSIDE THROWS");
        throw new IllegalAccessException("DEMO");
    }
    public static void main(String[] args) {
        try{throwone();}
        catch(IllegalAccessException e){
            System.out.println("CAUGHT "+e);
        }
    }
}
