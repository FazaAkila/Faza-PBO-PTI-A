abstract class Kue {
    private String nama;
    private double harga;

    Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama Kue: " + nama + ", Harga: " + harga;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Getter untuk atribut harga
    public double getHarga() {
        return harga;
    }
}
