import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

class Brread {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER Q/q FOR QUIT: ");
        do{
            c=(char)br.read();
            System.out.print(c);
        }while(c!='q');
    }
}
