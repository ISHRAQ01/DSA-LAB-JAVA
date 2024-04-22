import java.net.*;
import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address= InetAddress.getLocalHost();
        System.out.println(Address);

        Address=InetAddress.getByName("www.github.com");
        System.out.println(Address);

        InetAddress SW[]=InetAddress.getAllByName("www.github.com");
        for (int i = 0; i<SW.length;i++){
            System.out.println(SW[i]);
        }
    }
}
