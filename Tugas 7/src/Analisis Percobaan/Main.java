import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", new Date(), 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", new Date(), 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", new Date(), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", new Date(), 5000, .04, 300);
        ProductionEmployee productionEmployee = new ProductionEmployee("Aldi", "567", new Date(), 1000, 2.50);

        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "Earnings: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "Earnings: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "Earnings: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "Earnings: ", basePlusCommissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee, "Earnings: ", productionEmployee.earnings());

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("Earnings: $%,.2f\n\n", currentEmployee.earnings());
        }
    }
}
