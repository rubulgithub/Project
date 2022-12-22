package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Jabra {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(1,"Masud", 50000);
        Teacher t2 = new Teacher(2,"Suleman", 70000);
        Teacher t3 = new Teacher(3,"Jintu", 80000);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1=new Student(1,"Arbeen",1);
        Student s2=new Student(2,"Zohair",2);
        Student s3=new Student(3,"Zoonaid",3);

        List<Student> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s1);
        studentList.add(s3);

        School scl=new School(teacherList, studentList);
       
        s1.Payfees(50000);
        s2.Payfees(70000);
        System.out.println("School has Earned = "+scl.getTotalMoneyEarned()+ " rupees");
    }
    
}
