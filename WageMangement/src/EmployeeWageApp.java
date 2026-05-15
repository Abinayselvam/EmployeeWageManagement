public class EmployeeWageApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        WageManager manager = new WageManager();

        manager.addCompany(new CompanyEmpWage("TCS", 20, 20, 100));
        manager.addCompany(new CompanyEmpWage("Infosys", 25, 22, 120));

        manager.computeAllWages();
        manager.displayAll();
    }
}