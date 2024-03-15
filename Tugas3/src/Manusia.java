import java.util.Scanner;

public class Manusia {
    public String nama;
    public int umur;
    public String jenisKelamin;
    public double tinggiBadan;
    public double beratBadan;
    public String pekerjaan;
    public String alamat;
    
    public Manusia() {
    }
    
    public Manusia(String nama, int umur, String jenisKelamin, double tinggiBadan, double beratBadan, String pekerjaan, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
    }
    
    public void tampilkanData() {
        System.out.println("\nMenampilkan Biodata :");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " Tahun");
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Tinggi Badan : " + tinggiBadan + " Cm");
        System.out.println("Berat Badan : " + beratBadan + " Kg");
        System.out.println("Pekerjaan : " + pekerjaan);
        System.out.println("Alamat : ");
    }
    
    public void perbaruiData(String namaBaru, int umurBaru, String jenisKelaminBaru, double tinggiBadanBaru, double beratBadanBaru, String pekerjaanBaru, String alamatBaru) {
        nama = namaBaru;
        umur = umurBaru;
        jenisKelamin = jenisKelaminBaru;
        tinggiBadan = tinggiBadanBaru;
        beratBadan = beratBadanBaru;
        pekerjaan = pekerjaanBaru;
        alamat = alamatBaru;
        System.out.println("\nBiodata berhasil diperbarui.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manusia manusia = new Manusia(); 

        System.out.println("=== Aplikasi CRUD Makluk Hidup Biodata User ===");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu Biodata User :");
            System.out.println("1. Tambah Biodata");
            System.out.println("2. Tampilkan Biodata");
            System.out.println("3. Perbarui Biodata");
            System.out.println("4. Hapus Biodata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\nTambah Biodata :");
                    System.out.print("Nama  : ");
                    String nama = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Jenis Kelamin : ");
                    String jenisKelamin = scanner.nextLine();
                    System.out.print("Tinggi Badan : ");
                    double tinggiBadan = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Berat Badan : ");
                    double beratBadan = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Pekerjaan : ");
                    String pekerjaan = scanner.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = scanner.nextLine();
                    
                    manusia = new Manusia(nama, umur, jenisKelamin, tinggiBadan, beratBadan, pekerjaan, alamat);
                    System.out.println("\nData Manusia berhasil ditambahkan.");
                    break;
                case 2:
                
                    manusia.tampilkanData();
                    break;
                case 3:
                    System.out.println("\nPerbarui Data Manusia:");
                    System.out.print("Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Umur Baru: ");
                    int umurBaru = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline dari buffer
                    System.out.print("Jenis Kelamin Baru: ");
                    String jenisKelaminBaru = scanner.nextLine();
                    System.out.print("Tinggi Badan Baru: ");
                    double tinggiBadanBaru = scanner.nextDouble();
                    scanner.nextLine(); // Membuang newline dari buffer
                    System.out.print("Berat Badan Baru: ");
                    double beratBadanBaru = scanner.nextDouble();
                    scanner.nextLine(); // Membuang newline dari buffer
                    System.out.print("Pekerjaan Baru: ");
                    String pekerjaanBaru = scanner.nextLine();
                    System.out.print("Alamat Baru: ");
                    String alamatBaru = scanner.nextLine();
                    
                    // Memanggil method untuk memperbarui data
                    manusia.perbaruiData(namaBaru, umurBaru, jenisKelaminBaru, tinggiBadanBaru, beratBadanBaru, pekerjaanBaru, alamatBaru);
                    break;
                case 4:
                    System.out.println("\nData Manusia dihapus.");
                    manusia = new Manusia(); // Menghapus data dengan membuat objek baru
                    break;
                case 5:
                    System.out.println("\nAplikasi selesai dijalankan. Terima kasih telah menggunakan Aplikasi CRUD biodata User");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
