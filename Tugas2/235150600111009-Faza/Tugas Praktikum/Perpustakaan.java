import java.io.*;
import java.util.Scanner;

class Buku {
    private String judul;
    private String[] penulis;
    private int jumlahPenulis;
    
    public Buku(String judul) {
        this.judul = judul;
        this.penulis = new String[10];
        this.jumlahPenulis = 0;
    }
    
    public void tambahPenulis(String namaPenulis) {
        if (jumlahPenulis < penulis.length) {
            penulis[jumlahPenulis] = namaPenulis;
            jumlahPenulis++;
        } else {
            System.out.println("Maksimum penulis per buku telah tercapai.");
        }
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String[] getPenulis() {
        return penulis;
    }
    
    public int getJumlahPenulis() {
        return jumlahPenulis;
    }
    
    public void tulisDataBuku(FileWriter writer) throws IOException {
        writer.write("Judul: " + judul + "\n");
        writer.write("Penulis: ");
        for (int i = 0; i < jumlahPenulis; i++) {
            writer.write(penulis[i]);
            if (i < jumlahPenulis - 1) {
                writer.write(", ");
            }
        }
        writer.write("\n\n");
    }
}

class Kategori {
    private String namaKategori;
    private Buku[] daftarBuku;
    private int jumlahBuku;
    
    public Kategori(String namaKategori, int jumlahBuku) {
        this.namaKategori = namaKategori;
        this.daftarBuku = new Buku[jumlahBuku];
        this.jumlahBuku = 0;
    }
    
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Kategori ini sudah penuh.");
        }
    }
    
    public int jumlahBuku() {
        return jumlahBuku;
    }
    
    public void tampilkanInfoBuku() {
        System.out.println("Kategori: " + namaKategori);
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("- Judul: " + daftarBuku[i].getJudul());
            System.out.print("  Penulis: ");
            String[] penulis = daftarBuku[i].getPenulis();
            for (int j = 0; j < daftarBuku[i].getJumlahPenulis(); j++) {
                System.out.print(penulis[j]);
                if (j < daftarBuku[i].getJumlahPenulis() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    
    public void tulisDataKategori(FileWriter writer) throws IOException {
        writer.write("Kategori: " + namaKategori + "\n");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].tulisDataBuku(writer);
        }
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        Kategori teknologi = new Kategori("Teknologi", 10);
        Kategori filsafat = new Kategori("Filsafat", 10);
        Kategori sejarah = new Kategori("Sejarah", 10);
        Kategori agama = new Kategori("Agama", 10);
        Kategori psikologi = new Kategori("Psikologi", 10);
        Kategori politik = new Kategori("Politik", 10);
        Kategori fiksi = new Kategori("Fiksi", 10);

        // Menambahkan buku ke dalam kategori Teknologi
        Buku buku1 = new Buku("Artificial Unintelligence: How Computers Misunderstand the World");
        buku1.tambahPenulis("Meredith Broussard");
        teknologi.tambahBuku(buku1);

        // Menambahkan buku ke dalam kategori Filsafat
        Buku buku2 = new Buku("Critique of Pure Reason");
        buku2.tambahPenulis("Immanuel Kant");
        filsafat.tambahBuku(buku2);

        // Menambahkan buku ke dalam kategori Sejarah
        Buku buku3 = new Buku("The Guns of August");
        buku3.tambahPenulis("Barbara W. Tuchman");
        sejarah.tambahBuku(buku3);

        // Menambahkan buku ke dalam kategori Agama
        Buku buku4 = new Buku("Secrets of Divine Love: A Spiritual Journey into the Heart of Islam");
        buku4.tambahPenulis("A. Helwa");
        agama.tambahBuku(buku4);

        // Menambahkan buku ke dalam kategori Psikologi
        Buku buku5 = new Buku("Thinking Fast & Slow");
        buku5.tambahPenulis("Danniel Kahneman");
        psikologi.tambahBuku(buku5);

        // Menambahkan buku ke dalam kategori Politik
        Buku buku6 = new Buku("Politik Kuasa Media");
        buku6.tambahPenulis("Noam Chomsky");
        politik.tambahBuku(buku6);

        // Menambahkan buku ke dalam kategori Fiksi
        Buku buku7 = new Buku("Harry Potter");
        buku7.tambahPenulis("J.K Rowling");
        fiksi.tambahBuku(buku7);

        // Menampilkan info buku dalam setiap kategori
        System.out.println("Selamat datang di Perpustakaan");
        System.out.println("Silakan pilih menu:");
        System.out.println("1. Tampilkan buku dalam kategori Teknologi");
        System.out.println("2. Tampilkan buku dalam kategori Filsafat");
        System.out.println("3. Tampilkan buku dalam kategori Sejarah");
        System.out.println("4. Tampilkan buku dalam kategori Agama");
        System.out.println("5. Tampilkan buku dalam kategori Psikologi");
        System.out.println("6. Tampilkan buku dalam kategori Politik");
        System.out.println("7. Tampilkan buku dalam kategori Fiksi");
        System.out.println("8. Tambahkan buku baru");
        System.out.println("9. Simpan data ke file");
        System.out.println("0. Keluar");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("Pilih menu (0-9): ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) {
                case 1:
                    teknologi.tampilkanInfoBuku();
                    break;
                case 2:
                    filsafat.tampilkanInfoBuku();
                    break;
                case 3:
                    sejarah.tampilkanInfoBuku();
                    break;
                case 4:
                    agama.tampilkanInfoBuku();
                    break;
                case 5:
                    psikologi.tampilkanInfoBuku();
                    break;
                case 6:
                    politik.tampilkanInfoBuku();
                    break;
                case 7:
                    fiksi.tampilkanInfoBuku();
                    break;
                case 8:
                    System.out.print("Masukkan judul buku baru: ");
                    String judulBaru = scanner.nextLine();
                    Buku bukuBaru = new Buku(judulBaru);
                    System.out.print("Masukkan nama penulis (pisahkan dengan koma jika lebih dari satu): ");
                    String penulisBaru = scanner.nextLine();
                    String[] penulis = penulisBaru.split(",");
                    for (String p : penulis) {
                        bukuBaru.tambahPenulis(p.trim());
                    }
                    System.out.print(" 1. Teknologi \n 2. Filsafat \n 3. Sejarah \n 4. Agama \n 5. Psikologi \n 6. Politik \n 7. Fiksi \n Masukkan kategori buku : ");
                    String kategori = scanner.nextLine();
                    if (kategori.equalsIgnoreCase("1")) {
                        teknologi.tambahBuku(bukuBaru);
                    } else if (kategori.equalsIgnoreCase("2")) {
                        filsafat.tambahBuku(bukuBaru);
                    } else if (kategori.equalsIgnoreCase("3")) {
                        sejarah.tambahBuku(bukuBaru);
                    } else if (kategori.equalsIgnoreCase("4")) {
                        agama.tambahBuku(bukuBaru);
                    } else if (kategori.equalsIgnoreCase("5")) {
                        psikologi.tambahBuku(bukuBaru);
                    } else if (kategori.equalsIgnoreCase("6")) {
                        politik.tambahBuku(bukuBaru);
                    } else if (kategori.equalsIgnoreCase("7")) {
                        fiksi.tambahBuku(bukuBaru);
                    } else {
                        System.out.println("Kategori tidak valid.");
                    }
                    break;
                case 9:
                    simpanKeFile(teknologi, filsafat, sejarah, agama, psikologi, politik, fiksi);
                    break;
                case 0:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan Perpustakaan.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        scanner.close();
    }
    
    public static void simpanKeFile(Kategori teknologi, Kategori filsafat, Kategori sejarah, Kategori agama, Kategori psikologi, Kategori politik, Kategori fiksi) {
        try (FileWriter writer = new FileWriter("perpustakaan_data.txt")) {
            teknologi.tulisDataKategori(writer);
            filsafat.tulisDataKategori(writer);
            sejarah.tulisDataKategori(writer);
            agama.tulisDataKategori(writer);
            psikologi.tulisDataKategori(writer);
            politik.tulisDataKategori(writer);
            fiksi.tulisDataKategori(writer);
            System.out.println("Data berhasil ditulis ke dalam file perpustakaan_data.txt.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }
}
