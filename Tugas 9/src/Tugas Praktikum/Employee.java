public abstract class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - calculateDeductions();
    }

    public String getEmployeeDetails() {
        return "Name : " + name + ", Registration Number : " + registrationNumber;
    }

    public double getRemainingSalary() {
        return getPayableAmount();
    }

    protected double calculateDeductions() {
        double totalDeductions = 0;
        for (Invoice invoice : invoices) {
            totalDeductions += invoice.getPayableAmount();
        }
        return totalDeductions;
    }

    public String getName() {
        return name;
    }

    public abstract String getRole();

    public static String getCompanyName() {
        return "NV. Meneer";
    }

    public void processSalary() {
        System.out.println("Processing salary for : " + name);
    }
}
