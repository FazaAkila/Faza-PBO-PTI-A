import java.util.Scanner;

public class Tumbuhan {
    public String namaTumbuhan;
    public int usiaTumbuhan;
    public String jenisTumbuhan;
    public String habitatTumbuhan;
    public double tinggiTumbuhan;
    public String jenisAkarTumbuhan;

    public void fotosintesis() {
        System.out.println("Tumbuhan " + namaTumbuhan + " sedang melakukan fotosintesis.");
    }

    public void tumbuh() {
        System.out.println("Tumbuhan " + namaTumbuhan + " sedang tumbuh.");
    }

    public void berbunga() {
        System.out.println("Tumbuhan " + namaTumbuhan + " sedang berbunga.");
    }

    public void berbuah() {
        System.out.println("Tumbuhan " + namaTumbuhan + " sedang berbuah.");
    }

    public void reproduksi() {
        System.out.println("Tumbuhan " + namaTumbuhan + " sedang melakukan reproduksi.");
    }

    public int usiaSekarang(int tahunSekarang) {
        return tahunSekarang - usiaTumbuhan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tumbuhan tumbuhan = new Tumbuhan();

        System.out.println("=== Aplikasi CRUD Makhluk Hidup Data Tumbuhan ===");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu Data Tumbuhan:");
            System.out.println("1. Tambah Tumbuhan");
            System.out.println("2. Tampilkan Data Tumbuhan");
            System.out.println("3. Perbarui Data Tumbuhan");
            System.out.println("4. Hapus Data Tumbuhan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\nTambah Data Tumbuhan :");
                    System.out.print("Nama Tumbuhan : ");
                    tumbuhan.namaTumbuhan = scanner.nextLine();
                    System.out.print("Usia Tumbuhan : ");
                    tumbuhan.usiaTumbuhan = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Jenis Tumbuhan : ");
                    tumbuhan.jenisTumbuhan = scanner.nextLine();
                    System.out.print("Habitat Tumbuhan : ");
                    tumbuhan.habitatTumbuhan = scanner.nextLine();
                    System.out.print("Tinggi Tumbuhan : ");
                    tumbuhan.tinggiTumbuhan = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Jenis Akar Tumbuhan : ");
                    tumbuhan.jenisAkarTumbuhan = scanner.nextLine();
                    System.out.println("\nData Tumbuhan berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\nTampilkan Data Tumbuhan :");
                    System.out.println("Nama Tumbuhan : " + tumbuhan.namaTumbuhan);
                    System.out.println("Usia Tumbuhan : " + tumbuhan.usiaTumbuhan + " Tahun");
                    System.out.println("Jenis Tumbuhan : " + tumbuhan.jenisTumbuhan);
                    System.out.println("Habitat Tumbuhan : " + tumbuhan.habitatTumbuhan);
                    System.out.println("Tinggi Tumbuhan : " + tumbuhan.tinggiTumbuhan + " Cm");
                    System.out.println("Jenis Akar Tumbuhan : " + tumbuhan.jenisAkarTumbuhan);
                    break;
                case 3:
                    System.out.println("\nPerbarui Data Tumbuhan:");
                    System.out.print("Nama Tumbuhan baru: ");
                    tumbuhan.namaTumbuhan = scanner.nextLine();
                    System.out.print("Usia Tumbuhan baru: ");
                    tumbuhan.usiaTumbuhan = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Jenis Tumbuhan baru: ");
                    tumbuhan.jenisTumbuhan = scanner.nextLine();
                    System.out.print("Habitat Tumbuhan baru: ");
                    tumbuhan.habitatTumbuhan = scanner.nextLine();
                    System.out.print("Tinggi Tumbuhan baru: ");
                    tumbuhan.tinggiTumbuhan = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Jenis Akar Tumbuhan baru: ");
                    tumbuhan.jenisAkarTumbuhan = scanner.nextLine();
                    System.out.println("\nData Tumbuhan berhasil diperbarui.");
                    break;
                case 4:
                    System.out.println("\nData Tumbuhan dihapus.");
                    tumbuhan = new Tumbuhan(); 
                    System.out.println("\nData Tumbuhan berhasil dihapus.");
                    break;
                case 5:
                    System.out.println("\nAplikasi CRUD telah selesai dijalankan.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
