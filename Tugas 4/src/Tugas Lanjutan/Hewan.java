public class Hewan {
    public String namaHewan;
    public int umurHewan;
    public String jenisHewan;
    public String habitatHewan;
    public String asalHewan;
    public double beratHewan;

    // Constructor Overload 1
    public Hewan() {
        this.namaHewan = "Belum diisi";
        this.umurHewan = 0;
        this.jenisHewan = "Belum diisi";
        this.habitatHewan = "Belum diisi";
        this.asalHewan = "Belum diisi";
        this.beratHewan = 0.0;
    }

    // Constructor Overload 2
    public Hewan(String namaHewan, String jenisHewan) {
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umurHewan = 0;
        this.habitatHewan = "Belum diisi";
        this.asalHewan = "Belum diisi";
        this.beratHewan = 0.0;
    }

    // Constructor Overload 3
    public Hewan(String namaHewan, int umurHewan, String jenisHewan, String habitatHewan, String asalHewan, double beratHewan) {
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.jenisHewan = jenisHewan;
        this.habitatHewan = habitatHewan;
        this.asalHewan = asalHewan;
        this.beratHewan = beratHewan;
    }

    // Method Overload 1
    public void tampilkanData() {
        System.out.println("\nData Hewan:");
        System.out.println("Nama Hewan : " + namaHewan);
        System.out.println("Umur Hewan : " + umurHewan + " Tahun");
        System.out.println("Jenis Hewan : " + jenisHewan);
        System.out.println("Habitat Hewan : " + habitatHewan);
        System.out.println("Asal Hewan : " + asalHewan);
        System.out.println("Berat Hewan : " + beratHewan + " Kg");
    }

    // Method Overload 2
    public void perbaruiData(String namaHewan, int umurHewan, String jenisHewan, String habitatHewan, String asalHewan, double beratHewan) {
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.jenisHewan = jenisHewan;
        this.habitatHewan = habitatHewan;
        this.asalHewan = asalHewan;
        this.beratHewan = beratHewan;
        System.out.println("\nData Hewan berhasil diperbarui.");
    }

    // Method Overload 3
    public void perbaruiData(String namaHewan, int umurHewan, String jenisHewan) {
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.jenisHewan = jenisHewan;
        System.out.println("\nData Hewan berhasil diperbarui.");
    }

    // Method untuk menghapus data hewan
    public void hapusData() {
        this.namaHewan = "";
        this.umurHewan = 0;
        this.jenisHewan = "";
        this.habitatHewan = "";
        this.asalHewan = "";
        this.beratHewan = 0.0;
        System.out.println("\nData Hewan berhasil dihapus.");
    }

    // Method instans yang mengembalikan tipe data class itu sendiri
    public Hewan getHewanInstance() {
        return this;
    }
}
