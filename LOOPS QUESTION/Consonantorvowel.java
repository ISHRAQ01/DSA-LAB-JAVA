import java.util.Scanner;

public class Consonantorvowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER: ");
        char c = s.next().charAt(0);
        if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u')
            System.out.println("CHARACTER "+c+" IS AN VOWEL");
        else    
            System.out.println("CHARACTER "+c+" IS AN CONSONANT");
        s.close();
    }
}

