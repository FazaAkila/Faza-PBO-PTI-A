import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        System.out.println("=== Aplikasi CRUD Makhluk Hidup Jenis Hewan ===");

        boolean jalankan = true;

        while (jalankan) {
            System.out.println("\n Menu CRUD Data Hewan :");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Data Hewan");
            System.out.println("3. Perbarui Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Simpan Data ke File");
            System.out.println("6. Muat Data dari File");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");

            int aplikasi = scanner.nextInt();
            scanner.nextLine(); 

            switch (aplikasi) {
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
                    Hewan hewan = new Hewan(namaHewan, umurHewan, jenisHewan, habitatHewan, asalHewan, beratHewan);
                    data.tambahHewan(hewan);
                    System.out.println("\nData Hewan berhasil ditambahkan.");
                    break;
                case 2:
                    data.tampilkanData();
                    break;
                case 3:
                    System.out.println("\nPerbarui Data Hewan:");
                    System.out.print("Masukkan nomor data yang akan diperbarui: ");
                    int dataUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (dataUpdate >= 0 && dataUpdate < Data.MAX_HEWAN && data.getHewan(dataUpdate) != null) {
                        System.out.print("Nama Hewan Baru : ");
                        namaHewan = scanner.nextLine();
                        System.out.print("Umur Hewan Baru : ");
                        umurHewan = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Jenis Hewan Baru : ");
                        jenisHewan = scanner.nextLine();
                        System.out.print("Habitat Hewan Baru : ");
                        habitatHewan = scanner.nextLine();
                        System.out.print("Asal Hewan Baru : ");
                        asalHewan = scanner.nextLine();
                        System.out.print("Berat Hewan Baru : ");
                        beratHewan = scanner.nextDouble();
                        scanner.nextLine();
                        Hewan hewanBaru = new Hewan(namaHewan, umurHewan, jenisHewan, habitatHewan, asalHewan, beratHewan);
                        data.perbaruiData(dataUpdate, hewanBaru);
                    } else {
                        System.out.println("\nIndeks tidak valid atau data belum ada.");
                    }
                    break;
                case 4:
                    System.out.println("\nHapus Data Hewan:");
                    System.out.print("Masukkan indeks data yang akan dihapus: ");
                    int dataHapus = scanner.nextInt();
                    scanner.nextLine();
                    if (dataHapus >= 0 && dataHapus < Data.MAX_HEWAN && data.getHewan(dataHapus) != null) {
                        data.hapusData(dataHapus);
                    } else {
                        System.out.println("\nIndeks tidak valid atau data belum ada.");
                    }
                    break;
                case 5:
                    System.out.print("\nMasukkan nama file untuk menyimpan data (contoh: data.txt): ");
                    String namaFileSimpan = scanner.nextLine();
                    data.writeFile(namaFileSimpan);
                    break;
                case 6:
                    System.out.print("\nMasukkan nama file untuk memuat data (contoh: data.txt): ");
                    String namaFileMuat = scanner.nextLine();
                    data.readFile(namaFileMuat);
                    break;
                case 7:
                    System.out.println("\nAplikasi selesai. Anda telah keluar dari sistem CRUD");
                    jalankan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
