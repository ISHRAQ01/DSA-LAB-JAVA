import java.util.ArrayList;
import java.util.Scanner;


public class Stringsequence {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        String string=s.nextLine();
        for(int i=0;i<string.length();i++){
            int size=list.size();
            char st= string.charAt(i);
            list.add(""+st);
            for(int j=0;j<size;j++){
                String value= list.get(j)+st;
                if(!list.contains(value)){
                    list.add(value);
                }            
            }
        }
        list.add("");
        System.out.println(list);
        s.close();
    }
}
