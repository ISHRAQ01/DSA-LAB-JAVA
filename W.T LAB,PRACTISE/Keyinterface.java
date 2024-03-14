interface callback {
    void call(int param);
}

class Clients implements callback {
    public void call(int p) {
        System.out.println("CLIENTS "+p);
    }
}
public class Keyinterface{
    public static void main(String[] args) {
        callback c=new Clients();
        c.call(65);
        }
}