public class InternEmployee extends Employee implements Contract {
    private String internshipType;
    private int contractDuration;

    public InternEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices, String internshipType, int contractDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.internshipType = internshipType;
        this.contractDuration = contractDuration;
    }

    @Override
    public String getRole() {
        return "Intern Employee";
    }

    public String getInternshipDetails() {
        return "Internship Type: " + internshipType;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println(getName() + " is attending a training session.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Contract duration for " + getName() + " is " + contractDuration + " months.");
    }
}
