public class Managerr extends Employee {
    private double bonus;
    public Managerr(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
