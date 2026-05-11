import java.util.Random;

public class EmployeeWage {
    static final int Wage_Per_hour=20;
    static  final int Full_Day_Hour=8;
    static  final int Part_Time_Hour=4;

    static final int Is_Absent=0;
    static final int Is_Part_Time=1;
    static  final int Is_Full_Time=2;

    static final int Max_Working_Day=20;
    static  final int Max_Working_Hours=100;

    static Random random=new Random();

    public static void main(String[] args) {
        System.out.println("Welcome Employee Wage Computation Page");
        uc1_checkAttendance();

    }
    static void uc1_checkAttendance()
    {
        int empCheck=random.nextInt(2);
        if(empCheck==1)
        {
            System.out.println("UC1: Employee present");
        }
        else {
            System.out.println("UC2: Employee Absent");
        }
    }
}
