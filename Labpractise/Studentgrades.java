public class Studentgrades {
    private String teachername;
    private String studentname;
    private int roll;
    private int marks;
    Studentgrades(String teachername,String studentname,int roll,int marks){
        this.teachername=teachername;
        this.studentname=studentname;
        this.roll=roll;
        this.marks=marks;
    }
    public void display(){
        System.out.println("TEACHER NAME:"+teachername);
        System.out.println("STUDENT NAME:"+studentname+"\nROLL NO.:"+roll);
        System.out.println("MARKS OBTAINED BY THE STUDENT ARE : "+marks);
    }
    public static void ispass(int marks){
        if(marks>=40){
            System.out.println("STUDENTS ARE PASSED");
        if(marks<40){
            System.out.println("STUDENTS ARE NOT PASSED");
        }
    }
    }
    public static void main(String[] args) {
        Studentgrades s1=new Studentgrades("RAVI", "KUNAL", 21023, 59);
        s1.display();
        ispass(s1.marks);
    }
}
