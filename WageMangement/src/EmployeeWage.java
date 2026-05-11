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
        uc2_dailyWage();
        uc3_partTimeWage();
        uc4_switchCase();
        uc5_monthlyWage();
        uc6_wageWithCondition();

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
        int emperor = switch (empCheck) {
            case Is_Full_Time -> Full_Day_Hour;
            case Is_Part_Time -> Part_Time_Hour;
            default -> 0;
        };
        int wage= emperor * Wage_Per_hour;
        System.out.println("Employee Wage using switch: "+wage);
    }
    static  void uc5_monthlyWage()
    {
        int totalWage=0;

        for(int day=1;day<=Max_Working_Day;day++)
        {
            int empCheck = random.nextInt(3);
            int empHours = (empCheck==Is_Full_Time)? Full_Day_Hour:
                    (empCheck== Is_Part_Time)?Part_Time_Hour:0;
            totalWage+=empHours+Wage_Per_hour;
        }
        System.out.println("UC5: Monthly Wage:"+totalWage);
    }
    static void uc6_wageWithCondition() {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < Max_Working_Hours && totalDays < Max_Working_Day) {
            totalDays++;

            int empCheck = random.nextInt(3);
            int empHours = (empCheck == Is_Full_Time) ? Full_Day_Hour :
                    (empCheck == Is_Part_Time) ? Part_Time_Hour : 0;

            totalHours += empHours;
            totalWage += empHours * Wage_Per_hour;
        }

        System.out.println("UC6: Total Wage = " + totalWage);
    }
}
