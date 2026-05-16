import java.util.ArrayList;

public class CompanyEmpWage {

     String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;

    int totalSalary;
    public ArrayList<Integer> dailyWages = new ArrayList<>();


    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void computeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);

            int workHours = switch (empCheck) {
                case 1 -> 8;
                case 2 -> 4;
                default -> 0;
            };

            totalWorkingHours += workHours;
            totalSalary += workHours * wagePerHour;
        }
    }

    public void display() {
        System.out.println(companyName + " Total Salary: " + totalSalary);
    }
}