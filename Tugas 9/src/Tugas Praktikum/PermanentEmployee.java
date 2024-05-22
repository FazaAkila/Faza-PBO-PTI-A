public class PermanentEmployee extends Employee {
    private String pensionScheme;

    public PermanentEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices, String pensionScheme) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.pensionScheme = pensionScheme;
    }

    @Override
    public String getRole() {
        return "Permanent Employee";
    }

    public String getPensionDetails() {
        return "Pension Scheme : " + pensionScheme;
    }
}
