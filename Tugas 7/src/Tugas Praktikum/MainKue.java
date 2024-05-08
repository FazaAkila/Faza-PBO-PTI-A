import java.util.Scanner;

public class MainKue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarKue daftarKue = new DaftarKue(20);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan Kue Pesanan");
            System.out.println("2. Tambahkan Kue Jadi");
            System.out.println("3. Tambahkan Kue Basi");
            System.out.println("4. Tampilkan Semua Kue");
            System.out.println("5. Hitung Total Harga Semua Jenis Kue");
            System.out.println("6. Hitung Total Harga dan Total Berat Kue Pesanan");
            System.out.println("7. Hitung Total Harga dan Total Jumlah Kue Jadi");
            System.out.println("8. Hitung Total Harga dan Total Lama Hari Kue Basi");
            System.out.println("9. Tampilkan Informasi Kue dengan Harga Terbesar");
            System.out.println("10. Keluar");

            System.out.print("Pilih menu (1-10): ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Membuang newline karakter setelah input angka

            switch (menu) {
                case 1:
                    tambahkanKuePesanan(daftarKue, scanner);
                    break;
                case 2:
                    tambahkanKueJadi(daftarKue, scanner);
                    break;
                case 3:
                    tambahkanKueBasi(daftarKue, scanner);
                    break;
                case 4:
                    daftarKue.tampilkanSemuaKue();
                    break;
                case 5:
                    System.out.println("Total Harga Semua Jenis Kue: " + daftarKue.hitungTotalHarga());
                    break;
                case 6:
                    System.out.println("Total Harga Kue Pesanan: " + daftarKue.hitungTotalHargaKuePesanan());
                    System.out.println("Total Berat Kue Pesanan: " + daftarKue.hitungTotalBeratKuePesanan());
                    break;
                case 7:
                    System.out.println("Total Harga Kue Jadi: " + daftarKue.hitungTotalHargaKueJadi());
                    System.out.println("Total Jumlah Kue Jadi: " + daftarKue.hitungTotalJumlahKueJadi());
                    break;
                case 8:
                    System.out.println("Total Harga Kue Basi: " + daftarKue.hitungTotalHargaKueBasi());
                    System.out.println("Total Lama Hari Kue Basi: " + daftarKue.hitungTotalLamaHariKueBasi());
                    break;
                case 9:
                    Kue kueTerbesar = daftarKue.kueDenganHargaTerbesar();
                    if (kueTerbesar != null) {
                        System.out.println("Informasi Kue dengan Harga Terbesar: " + kueTerbesar);
                    } else {
                        System.out.println("Belum ada kue yang ditambahkan.");
                    }
                    break;
                case 10:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }

    private static void tambahkanKuePesanan(DaftarKue daftarKue, Scanner scanner) {
    System.out.print("Masukkan nama kue: ");
    String nama = scanner.nextLine();
    System.out.print("Masukkan harga kue: ");
    double harga = scanner.nextDouble();
    scanner.nextLine(); // Membuang newline karakter setelah input angka
    System.out.print("Masukkan berat kue: ");
    double berat = scanner.nextDouble();
    scanner.nextLine(); // Membuang newline karakter setelah input angka
    
    int indexKosong = daftarKue.indexKosong();
    if (indexKosong != -1) {
        daftarKue.tambahkanKue(new KuePesanan(nama, harga, berat), indexKosong);
        System.out.println("Kue pesanan berhasil ditambahkan.");
    } else {
        System.out.println("Daftar kue penuh. Tidak dapat menambahkan kue pesanan.");
    }
}


    private static void tambahkanKueJadi(DaftarKue daftarKue, Scanner scanner) {
        System.out.print("Masukkan nama kue jadi: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga kue jadi: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline karakter setelah input angka
        System.out.print("Masukkan jumlah kue jadi: ");
        double jumlah = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline karakter setelah input angka
        daftarKue.tambahkanKue(new KueJadi(nama, harga, jumlah), daftarKue.indexKosong());
    }

    private static void tambahkanKueBasi(DaftarKue daftarKue, Scanner scanner) {
        System.out.print("Masukkan nama kue basi: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga kue basi: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline karakter setelah input angka
        System.out.print("Masukkan lama hari kue basi: ");
        int lamaHari = scanner.nextInt();
        scanner.nextLine(); // Membuang newline karakter setelah input angka
        daftarKue.tambahkanKue(new KueBasi(nama, harga, lamaHari), daftarKue.indexKosong());
    }
}
