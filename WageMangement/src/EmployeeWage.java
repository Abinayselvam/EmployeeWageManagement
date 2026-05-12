import java.util.Random;


public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Employee emp = new Employee(
                20,  // wage per hour
                8,   // full day hours
                4,   // part-time hours
                20,  // max days
                100  // max hours
        );

        emp.computeWage();

        System.out.println("Total Working Days: " + emp.getTotalWorkingDays());
        System.out.println("Total Working Hours: " + emp.getTotalWorkingHours());
        System.out.println("Total Salary: " + emp.getTotalSalary());
    }
}
