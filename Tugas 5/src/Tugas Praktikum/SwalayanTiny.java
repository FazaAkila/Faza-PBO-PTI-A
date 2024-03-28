import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwalayanTiny {
    private Map<String, Customer> dataPelanggan;

    public SwalayanTiny() {
        dataPelanggan = new HashMap<>();
        verifikasiPelanggan();
    }

    private void verifikasiPelanggan() {
        dataPelanggan.put("381234567890", new Customer("381234567890", "Gracie Abrams", "38", 1500000));
        dataPelanggan.put("561234567890", new Customer("561234567890", "Ariana Grande", "56", 2000000));
        dataPelanggan.put("741234567890", new Customer("741234567890", "Taylor Swift", "74", 3000000));
    }

    public void transaksi(String nomorPelanggan, String pin, double amount, String jenisTransaksi) {
        Customer customer = dataPelanggan.get(nomorPelanggan);
        if (customer != null) {
            if (customer.autentikasi(pin)) {
                if (jenisTransaksi.equalsIgnoreCase("Pembelian")) {
                    customer.makePurchase(amount);
                } else if (jenisTransaksi.equalsIgnoreCase("Top up")) {
                    customer.topUp(amount);
                } else {
                    System.out.println("Jenis Transaksi Tidak Valid.");
                }
            }
        } else {
            System.out.println("Nomor Pelanggan Tidak Ditemukan.");
        }
    }

    public static void main(String[] args) {
        SwalayanTiny system = new SwalayanTiny();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Selamat Datang di Supermarket Tiny ===");

        // Meminta nomor pelanggan dan PIN
        System.out.print("Masukkan Nomor Pelanggan: ");
        String nomorPelanggan = scanner.nextLine();
        System.out.print("Masukkan PIN Anda: ");
        String pin = scanner.nextLine();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Layanan Pada Supermarket Tiny :");
            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu Yang Ingin Anda Lakukan (1/2/3): ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    processPurchase(system, scanner, nomorPelanggan, pin);
                    break;
                case "2":
                    processTopUp(system, scanner, nomorPelanggan, pin);
                    break;
                case "3":
                    exit = true;
                    System.out.println("Terima Kasih Telah Menggunakan Layanan Kami. Happy Shopping and Stay Healty :)");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silakan Pilih Menu Yang Sesuai.");
            }
        }
    }

    private static void processPurchase(SwalayanTiny system, Scanner scanner, String nomorPelanggan, String pin) {
        // Looping terjadi setelah customer memasukkan nomor pelanggan dan PIN
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Masukkan Nominal Pembelian: ");
            double purchaseAmount = scanner.nextDouble();
            scanner.nextLine(); // Membuang karakter newline (\n)
            if (purchaseAmount > 0) {
                system.transaksi(nomorPelanggan, pin, purchaseAmount, "Pembelian");
                validInput = true; // Mengakhiri looping jika input valid
            } else {
                System.out.println("Nominal Pembelian Tidak Valid. Silakan Masukkan Nominal Pembelian Yang Lebih Dari 0.");
            }
        }
    }

    private static void processTopUp(SwalayanTiny system, Scanner scanner, String nomorPelanggan, String pin) {
        // Looping terjadi setelah customer memasukkan nomor pelanggan dan PIN
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Masukkan Nominal Top up: ");
            double topUpAmount = scanner.nextDouble();
            scanner.nextLine(); // Membuang karakter newline (\n)
            if (topUpAmount > 0) {
                system.transaksi(nomorPelanggan, pin, topUpAmount, "Top up");
                validInput = true; // Mengakhiri looping jika input valid
            } else {
                System.out.println("Jumlah Top up Tidak Valid. Silakan Masukkan Nominal Top up Yang Lebih Dari 0.");
            }
        }
    }
}
