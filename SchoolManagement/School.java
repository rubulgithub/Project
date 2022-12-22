package SchoolManagement;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    public School(List<Teacher> teachers,List<Student> students)
    {
    this.teachers=teachers;
    this.students=students;
    totalMoneyEarned=0;
    totalMoneySpend=0;
    
    }

    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher)
    }
    public List<Teacher> getTeacher()
    {
        return teachers;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
    public List<Student> getStudent()
    {
        return students;
    }

    public static void updateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned+=moneyEarned;
    }
    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }

    public void updateTotalMoneySpend(int moneySpend)
    {
        totalMoneySpend+=moneySpend;
    }
}
