import java.util.*;

public class EmpWageBuilder implements IEmpWageBuilder {

    private final ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private final HashMap<String, CompanyEmpWage> companyMap = new HashMap<>();

    @Override
    public void addCompany(String name, int wagePerHour, int maxDays, int maxHours) {
        CompanyEmpWage company = new CompanyEmpWage(name, wagePerHour, maxDays, maxHours);
        companyList.add(company);
        companyMap.put(name, company);
    }

    @Override
    public void computeWage() {

        for (CompanyEmpWage company : companyList) {

            int totalHours = 0;
            int totalDays = 0;

            while (totalDays < company.maxWorkingDays &&
                    totalHours < company.maxWorkingHours) {

                totalDays++;

                int empCheck = (int) (Math.random() * 3);

                int workHours = switch (empCheck) {
                    case 1 -> 8;
                    case 2 -> 4;
                    default -> 0;
                };

                totalHours += workHours;

                int dailyWage = workHours * company.wagePerHour;
                company.dailyWages.add(dailyWage);
                company.totalSalary += dailyWage;
            }

            System.out.println(company.companyName +
                    " Total Wage: " + company.totalSalary);
        }
    }

    @Override
    public int getTotalWage(String companyName) {
        return companyMap.get(companyName).totalSalary;
    }
}