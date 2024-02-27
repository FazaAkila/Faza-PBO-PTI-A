import java.util.Scanner;

public class ReviewPemdas {

    static String[] judulBuku = {"Java Programming", "Data Structures", "Algorithm Design", "Introduction to Algorithms", "Hacking: The Art of Exploitation", "The Pragmatic Programmer"};
    static boolean[] ketersediaanBuku = {true, true, true, true, true, true};

    static void daftarBuku() {
        System.out.println("Daftar Buku Tersedia:");
        for (int i = 0; i < judulBuku.length; i++) {
            if (ketersediaanBuku[i]) {
                System.out.println((i+1) + ". " + judulBuku[i]);
            } else {
                System.out.println((i+1) + ". " + judulBuku[i] + " (Buku kosong)");
            }
        }
    }
    
    static void pinjamBuku(int indexBuku) {
        if (indexBuku >= 0 && indexBuku < judulBuku.length && ketersediaanBuku[indexBuku]) {
            System.out.println("Anda telah meminjam: " + judulBuku[indexBuku]);
            ketersediaanBuku[indexBuku] = false;
        } else {
            System.out.println("pilihan tidak tersedia.");
        }
    }
    
    static void kembalikanBuku(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < judulBuku.length && !ketersediaanBuku[bookIndex]) {
            System.out.println("Anda telah mengembalikan: " + judulBuku[bookIndex]);
            ketersediaanBuku[bookIndex] = true;
        } else {
            System.out.println("pilihan tidak tersedia");
        }
    }


public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int pilihan;
        do {
            System.out.println("=============================================");
            System.out.println("\tSISTEM INFORMASI PERPUSTAKAAN");
            System.out.println("=============================================");
            System.out.println("1. Daftar Ketersediaan Buku");
            System.out.println("2. Peminjaman Buku");
            System.out.println("3. Pengembalian Buku");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan anda: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    daftarBuku();
                    break;
                case 2:
                    System.out.println("Daftar Buku Tersedia:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Data Structures");
                    System.out.println("3. Algorithm Design");
                    System.out.println("4. Introduction to Algorithms");
                    System.out.println("5. Hacking: The Art of Exploitation");
                    System.out.println("6. The Pragmatic Programmer");
                    System.out.print("Masukkan nomor buku yang akan dipinjam (1-6): ");
                    int bukuDipinjam = in.nextInt() - 1;
                    pinjamBuku(bukuDipinjam);
                    break;
                case 3:
                    System.out.print("Masukkan nomor buku yang akan dikembalikan (1-6): ");
                    int bukuDikembalikan = in.nextInt() - 1;
                    kembalikanBuku(bukuDikembalikan);
                    break;
                case 0:
                    System.out.println("Terima kasih telah mengunjungi perpustakaan");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi!");
            }

        } while (pilihan != 0);

        in.close();
        
    }
    
}
