package SchoolManagement;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name,int grade)
    {
        this.feesPaid=0;
        this.feesTotal=0;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    public void Payfees(int fees)
    {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getFeesPaid()
    {
        return feesPaid;
    }
    
    public int getFeesPaidTotal()
    {
        return feesTotal;
    }
    public int getRemaiiningFees()
    {
        return feesTotal-feesPaid;
    }
}
