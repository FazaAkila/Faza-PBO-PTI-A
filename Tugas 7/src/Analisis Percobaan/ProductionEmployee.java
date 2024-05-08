import java.util.Date;

public class ProductionEmployee extends Employee {
    private int producedItems; // Jumlah barang yang diproduksi per minggu
    private double itemWage; // Upah per barang

    public ProductionEmployee(String name, String noKTP, Date birthDate, int producedItems, double itemWage) {
        super(name, noKTP, birthDate);
        this.producedItems = producedItems;
        this.itemWage = itemWage;
    }

    public int getProducedItems() {
        return producedItems;
    }

    public void setProducedItems(int producedItems) {
        this.producedItems = producedItems;
    }

    public double getItemWage() {
        return itemWage;
    }

    public void setItemWage(double itemWage) {
        this.itemWage = itemWage;
    }

    @Override
    public double earnings() {
        return producedItems * itemWage;
    }

    @Override
    public String toString() {
        return String.format("Production Employee:\n%s\nProduced Items: %d\nItem Wage: %.2f", super.toString(), producedItems, itemWage);
    }
}
