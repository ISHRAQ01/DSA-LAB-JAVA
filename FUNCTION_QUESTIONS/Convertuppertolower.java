import java.util.Scanner;
public class Convertuppertolower {
    static void lowercaseandupper(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        String st=s.nextLine();        
        StringBuilder Lower = new StringBuilder();   
        StringBuilder upper = new StringBuilder();       
        for (int i = 0; i < st.length(); i++) { //upper to lower
            char c = st.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // Convert uppercase letter to lowercase
                c = (char) (c + 32);
            }
            Lower.append(c);
        }
        System.out.println("Lowercase String: " + Lower.toString());
    for (int i = 0; i < st.length(); i++) { //lower to upper
            char c = st.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Convert lowercase letter to uppercase
                c = (char) (c - 32);
            }
            upper.append(c);
        }
        System.out.println("Uppercase String: " + upper.toString());
    s.close();
    }
    public static void main(String[] args) {
        lowercaseandupper();
    }
}

