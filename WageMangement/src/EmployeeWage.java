import java.util.Random;

import static jdk.internal.org.jline.utils.Colors.s;

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
        uc2_dailyWage();
        uc3_partTimeWage();
        uc4_switchCase();

    }
    static void uc1_checkAttendance()
    {
        int empCheck=random.nextInt(2);
        if(empCheck==1)
        {
            System.out.println("UC1: Employee present");
        }
        else {
            System.out.println("UC1: Employee Absent");
        }
    }
    static void uc2_dailyWage()
    {
        int wage= Full_Day_Hour * Wage_Per_hour;
        System.out.println("UC2: Employee wage per day: "+wage);
    }
    static void uc3_partTimeWage()
    {
        int empCheck= random.nextInt(2);
        int empHours=(empCheck == 1) ? Part_Time_Hour : 0;
        int wage= empHours* Wage_Per_hour;
        System.out.println("UC3: Part time wage: "+wage);
    }
    static  void uc4_switchCase()
    {
        int empCheck=random.nextInt(3);
        int emphour;
        switch (empCheck)
        {
            case Is_Full_Time :
                emphour=Full_Day_Hour;
                break;
            case Is_Part_Time:
                emphour=Part_Time_Hour;
                break;
            default:
                emphour=0;
                break;
        }
        int wage=emphour* Wage_Per_hour;
        System.out.println("Employee Wage using switch: "+wage);
    }
}
