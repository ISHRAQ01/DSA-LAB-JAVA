import com.demo.Student;
import com.demo.Teacher;
public class Student {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr.arun");
        int[] studentmarks={45,16,91,85,37};
        Student[] std={
            new Student("ramesh",21);
            new Student("ramesh",21);
            new Student("ramesh",21);
            new Student("ramesh",21);
            new Student("ramesh",21);
    };
    for(int i=0;i<std.length;i++){
        teacher.assignmarks(stds[i],studentmarks[i]);
    for(int i=0;i<std.length;i++){
        stds[i].showdetails();

    }

    }
}
}
