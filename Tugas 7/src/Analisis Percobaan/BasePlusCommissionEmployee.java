import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // Gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, Date birthDate, double sales, double rate, double salary) {
        super(name, noKTP, birthDate, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("Base Plus Commission Employee:\n%s\nBase Salary: %.2f", super.toString(), getBaseSalary());
    }
}
