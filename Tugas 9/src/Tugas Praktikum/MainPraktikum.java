public class MainPraktikum {
    public static void main(String[] args) {
        Invoice[] invoices1 = {
            new Invoice("Laptop", 1, 35000000),
            new Invoice("Mouse", 2, 250000)
        };

        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Alexa Rivera", 25000000, invoices1, "Standard Pension");
        System.out.println(permanentEmployee.getEmployeeDetails());
        System.out.println("Role : " + permanentEmployee.getRole());
        System.out.println("Pension Details : " + permanentEmployee.getPensionDetails());
        System.out.println("Remaining Salary : " + permanentEmployee.getRemainingSalary());
        permanentEmployee.processSalary();
        System.out.println("Invoices :");
        for (Invoice invoice : invoices1) {
            System.out.println(invoice.getInvoiceDetails());
        }

        Invoice[] invoices2 = {
            new Invoice("Keyboard", 1, 500000),
            new Invoice("Monitor", 1, 2000000)
        };

        InternEmployee internEmployee = new InternEmployee(102, "Pierson Woodzinsky", 10000000, invoices2, "Summer Internship", 6);
        System.out.println(internEmployee.getEmployeeDetails());
        System.out.println("Role : " + internEmployee.getRole());
        System.out.println("Internship Details : " + internEmployee.getInternshipDetails());
        System.out.println("Remaining Salary : " + internEmployee.getRemainingSalary());
        internEmployee.processSalary();
        System.out.println("Invoices :");
        for (Invoice invoice : invoices2) {
            System.out.println(invoice.getInvoiceDetails());
        }
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
    }
}
