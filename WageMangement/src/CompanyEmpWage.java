public class CompanyEmpWage {

    private final String companyName;
    private final int wagePerHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    private int totalSalary;

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