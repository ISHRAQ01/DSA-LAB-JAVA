public class Student {

    private String name;
    private int roll;
    private int marks;

    public Student(String name, int roll, int marks) {
        this(name, roll);
        this.marks = marks;
    }
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void showDetails(){
        if(this.marks<40)
        System.out.println(this.name + " has "+this.marks+", status: fail");
        else 
        System.out.println(this.name + " has "+this.marks+", status: pass");
    }

    

}
