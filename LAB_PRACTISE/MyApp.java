import Student;
import Teacher;

public class MyApp {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("Arun");
        int[] studentMarks = {45, 16, 91, 85, 37};
        Student[] stds = {
            new Student("Ramesh", 21),
            new Student("Suresh", 25, 52),
            new Student("Mahesh", 23),
            new Student("Dinesh", 27, 99),
            new Student("Mukesh", 28),
        };


        for(int i=0;i<stds.length;i++)
            teacher.assignMarks(stds[i], studentMarks[i]);

        for(int i=0;i<stds.length;i++)
            stds[i].showDetails();
        

    }
}