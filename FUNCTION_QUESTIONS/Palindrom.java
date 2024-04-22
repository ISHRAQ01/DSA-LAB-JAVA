public class Palindrom {
    public static boolean ispalin(int x){
        String s = Integer.toString(x);
        int l = s.length();
        for(int i=0; i<l; i++){
            if(s.charAt(i)!= s.charAt(l-1)){
                return false;
            }
            break;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean x = ispalin(-121);
        System.out.println(x);
    }
}