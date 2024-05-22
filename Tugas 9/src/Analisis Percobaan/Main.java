// Soal Nomor 1
public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan();
        System.out.println("Hewan:");
        hewan1.makan();
        hewan1.berjalan();
        hewan1.bersuara();
        hewan1.tampilkanNama();
        hewan1.tampilkanUmur();
        
        // Membuat objek Manusia
        Manusia manusia1 = new Manusia();
        manusia1.nama = "Budi";
        manusia1.umur = 25;
        
        System.out.println("\nManusia:");
        manusia1.makan();
        manusia1.berjalan();
        manusia1.bersuara();
        manusia1.tampilkanNama();
        manusia1.tampilkanUmur();
    }
}



// Nomor 6
// public class Main {
//     public static void main(String[] args) {
//         Manusia namaAnda = new Manusia("Zaraaa", 18);
        
//         namaAnda.makan();
//         namaAnda.berjalan();
//         namaAnda.bersuara();
//         namaAnda.tampilkanNama();
//         namaAnda.tampilkanUmur();
//     }
// }


// Nomor 7
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Hewan hewan1 = new Hewan();
//         System.out.println("Hewan :");
//         hewan1.makan();
//         hewan1.berjalan();
//         hewan1.bersuara();
//         hewan1.tampilkanNama();
//         hewan1.tampilkanUmur();

//         System.out.println("\nMasukkan Nama Manusia : ");
//         String nama = scanner.nextLine();
//         System.out.println("Masukkan Umur Manusia : ");
//         int umur = scanner.nextInt();

//         Manusia manusia1 = new Manusia();
//         manusia1.nama = nama;
//         manusia1.umur = umur;

//         System.out.println("\nManusia :");
//         manusia1.makan();
//         manusia1.berjalan();
//         manusia1.bersuara();
//         manusia1.tampilkanNama();
//         manusia1.tampilkanUmur();
        
//         scanner.close();
//     }
// }




// Nomor 8 
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         Hewan hewan1 = new Hewan();
//         System.out.println("Hewan :");
//         hewan1.makan();
//         hewan1.berjalan();
//         hewan1.bersuara();
//         hewan1.tampilkanNama();
//         hewan1.tampilkanUmur();
        
//         System.out.println("\nMasukkan nama manusia : ");
//         String nama = scanner.nextLine();
//         System.out.println("Masukkan umur manusia : ");
//         int umur = scanner.nextInt();
//         scanner.nextLine();  
        
//         Manusia manusia1 = new Manusia();
//         manusia1.nama = nama;
//         manusia1.umur = umur;

//         System.out.println("\nManusia :");
//         manusia1.makan();
//         manusia1.berjalan();
//         manusia1.bersuara();
//         manusia1.tampilkanNama();
//         manusia1.tampilkanUmur();
        
//         System.out.println("\nMasukkan model robot : ");
//         String model = scanner.nextLine();
//         System.out.println("Masukkan tahun produksi robot : ");
//         int tahunProduksi = scanner.nextInt();
        
//         Robot robot1 = new Robot(model, tahunProduksi);

//         System.out.println("\nRobot :");
//         robot1.makan();
//         robot1.berjalan();
//         robot1.bersuara();
//         robot1.tampilkanNama();
//         robot1.tampilkanUmur();

//         scanner.close();
//     }
// }
