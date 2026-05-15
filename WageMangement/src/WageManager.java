import java.util.ArrayList;

public class WageManager {

    private final ArrayList<CompanyEmpWage> companies = new ArrayList<>();

    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    public void computeAllWages() {
        for (CompanyEmpWage company : companies) {
            company.computeWage();
        }
    }

    public void displayAll() {
        for (CompanyEmpWage company : companies) {
            company.display();
        }
    }
}