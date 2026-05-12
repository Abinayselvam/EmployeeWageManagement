public class Employee {

    private final int wagePerHour;
    private final int fullDayHours;
    private final int partTimeHours;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    private int totalWorkingDays;
    private int totalWorkingHours;
    private int totalSalary;

    public Employee(int wagePerHour, int fullDayHours, int partTimeHours,
                    int maxWorkingDays, int maxWorkingHours) {

        this.wagePerHour = wagePerHour;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Core logic
    public void computeWage() {

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3); // 0,1,2
            int workHours = switch (empCheck) {
                case 1 -> fullDayHours;
                case 2 -> partTimeHours;
                default -> 0;
            };

            totalWorkingHours += workHours;
            totalSalary += workHours * wagePerHour;
        }
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }
}