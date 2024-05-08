import java.util.Date;

public class SalariedEmployee extends Employee {
    private double weeklySalary; // Gaji/minggu

    public SalariedEmployee(String name, String noKTP, Date birthDate, double salary) {
        super(name, noKTP, birthDate);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried Employee:\n%s\nWeekly Salary: %.2f", super.toString(), getWeeklySalary());
    }
}
