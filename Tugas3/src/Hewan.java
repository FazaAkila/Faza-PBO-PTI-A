import java.util.Scanner;

public class Hewan {
    public String namaHewan;
    public int umurHewan;
    public String jenisHewan;
    public String habitatHewan;
    public String asalHewan;
    public double beratHewan;

    public Hewan(String namaHewan, int umurHewan, String jenisHewan, String habitatHewan, String asalHewan, double beratHewan) {
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.jenisHewan = jenisHewan;
        this.habitatHewan = habitatHewan;
        this.asalHewan = asalHewan;
        this.beratHewan = beratHewan;
    }
    
    public void tampilkanData() {
        System.out.println("\nData Hewan:");
        System.out.println("Nama Hewan : " + namaHewan);
        System.out.println("Umur Hewan : " + umurHewan + " Tahun");
        System.out.println("Jenis Hewan : " + jenisHewan);
        System.out.println("Habitat Hewan : " + habitatHewan);
        System.out.println("Asal Hewan : " + asalHewan);
        System.out.println("Berat Hewan : " + beratHewan + " Kg");
    }

    // Method untuk memperbarui data hewan
    public void perbaruiData(String namaHewan, int umurHewan, String jenisHewan, String habitatHewan, String asalHewan, double beratHewan) {
        this.namaHewan = namaHewan;
        this.umurHewan = umurHewan;
        this.jenisHewan = jenisHewan;
        this.habitatHewan = habitatHewan;
        this.asalHewan = asalHewan;
        this.beratHewan = beratHewan;
        System.out.println("\nData Hewan berhasil diperbarui.");
    }
    
    public void hapusData() {
        this.namaHewan = "";
        this.umurHewan = 0;
        this.jenisHewan = "";
        this.habitatHewan = "";
        this.asalHewan = "";
        this.beratHewan = 0.0;
        System.out.println("\nData Hewan berhasil dihapus.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Aplikasi CRUD Makhluk Hidup Jenis Hewan ===");

        boolean isRunning = true;
        Hewan hewan = null; 

        while (isRunning) {
            System.out.println("\nMenu Data Hewan :");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Data Hewan");
            System.out.println("3. Perbarui Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\nTambah Data Hewan:");
                    System.out.print("Nama Hewan : ");
                    String namaHewan = scanner.nextLine();
                    System.out.print("Umur Hewan : ");
                    int umurHewan = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Jenis Hewan : ");
                    String jenisHewan = scanner.nextLine();
                    System.out.print("Habitat Hewan : ");
                    String habitatHewan = scanner.nextLine();
                    System.out.print("Asal Hewan : ");
                    String asalHewan = scanner.nextLine();
                    System.out.print("Berat Hewan : ");
                    double beratHewan = scanner.nextDouble();
                    scanner.nextLine();
                    hewan = new Hewan(namaHewan, umurHewan, jenisHewan, habitatHewan, asalHewan, beratHewan);
                    System.out.println("\nData Hewan berhasil ditambahkan.");
                    break;
                case 2:
                    if (hewan != null) {
                        hewan.tampilkanData();
                    } else {
                        System.out.println("\nBelum ada data hewan.");
                    }
                    break;
                case 3:
                    if (hewan != null) {
                        System.out.println("\nPerbarui Data Hewan:");
                        System.out.print("Nama Hewan Baru : ");
                        namaHewan = scanner.nextLine();
                        System.out.print("Umur Hewan Baru : ");
                        umurHewan = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Jenis Hewan Baru : ");
                        jenisHewan = scanner.nextLine();
                        System.out.print("Habitat Hewan Baru : ");
                        asalHewan = scanner.nextLine();
                        System.out.print("Asal Hewan Baru : ");
                        habitatHewan = scanner.nextLine();
                        System.out.print("Berat Hewan Baru : ");
                        beratHewan = scanner.nextDouble();
                        scanner.nextLine(); 
                        hewan.perbaruiData(namaHewan, umurHewan, jenisHewan, habitatHewan, asalHewan, beratHewan);
                    } else {
                        System.out.println("\nBelum ada data hewan.");
                    }
                    break;
                case 4:
                    if (hewan != null) {
                        hewan.hapusData();
                    } else {
                        System.out.println("\nBelum ada data hewan.");
                    }
                    break;
                case 5:
                    System.out.println("\nAplikasi selesai. Anda telah keluar dari sistem CRUD");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
