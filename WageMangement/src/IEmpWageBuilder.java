public interface IEmpWageBuilder {
    void addCompany(String name, int wagePerHour, int maxDays, int maxHours);
    void computeWage();
    int getTotalWage(String companyName);
}
