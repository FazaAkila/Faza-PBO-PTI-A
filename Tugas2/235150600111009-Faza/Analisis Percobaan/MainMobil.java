import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Set manufaktur mobil anda : ");
       
        Mobil m1 = new Mobil();
        m1.setManufaktur(input.nextLine());
        
        System.out.print("Masukkan Nomor Plat Mobil Anda : ");
        m1.setNoPlat(input.nextLine());
        
        System.out.print("Masukkan Warna Mobil Anda : "); 
        m1.setWarna(input.nextLine());
        
        System.out.print("Masukkan Kecepatan Mobil Anda : ");
        m1.setKecepatan(input.nextInt());
        input.nextLine();
        
        System.out.println("Tentukan Waktu Tempuh Perjalanan Anda (Dalam Satuan Jam) : "); 
        m1.setWaktu(input.nextDouble());
        input.nextLine();
        
        System.out.println("\nDetail Mobil Anda : ");
        m1.displayMessage();

        while (true) {
            System.out.print("Apakah Anda Ingin Mengubah Detail Mobil Anda ? (Y/N): ");
            String konfirmasi = input.nextLine();
            if (konfirmasi.equalsIgnoreCase("Y")) {
                System.out.println("1. Ubah Manufaktur\n2. Ubah Nomor Plat Mobil\n3. Ubah Warna Mobil\n4. Ubah Kecepatan Mobil\n5. Ubah Waktu Tempuh Perjalanan\n0. Keluar");
                System.out.print("Pilih Detail Menu Yang Ingin Diubah (0-5): ");
                int pilihan = input.nextInt();
                input.nextLine(); 
                
                switch (pilihan) {
                    case 1 :
                        System.out.print("Masukkan Manufaktur Mobil Anda : ");
                        m1.setManufaktur(input.nextLine());
                        break;
                    case 2 :                
                        System.out.print("Masukkan Nomor Plat Mobil Anda : ");
                        m1.setNoPlat(input.nextLine());
                        break;
                    case 3 :
                        System.out.print("Masukkan Warna Mobil Anda : ");
                        m1.setWarna(input.nextLine());
                        break;
                    case 4 :
                        System.out.print("Masukkan Kecepatan Mobil Anda : ");
                        if (input.hasNextInt()) {
                            m1.setKecepatan(input.nextInt());
                            input.nextLine(); 
                        } else {
                            System.out.println("Input Tidak Valid. Masukkan Angka Untuk Kecepatan.");
                            input.nextLine(); 
                        }
                        break;
                    case 5 :
                        System.out.print("Masukkan Waktu Tempuh Perjalanan Anda (Dalam Satuan Jam) : "); 
                        if (input.hasNextDouble()) {
                            m1.setWaktu(input.nextDouble());
                            input.nextLine(); 
                        } else {
                            System.out.println("Input tidak valid. Masukkan angka untuk waktu tempuh.");
                            input.nextLine(); 
                        }
                        break;
                    case 0 :
                        System.out.println("Anda Tidak Merubah Data Apapun");
                        break;
                    default :
                        System.out.println("Pilihan tidak sesuai");
                }
                
                System.out.println("\nDetail Mobil Anda Berhasil Dirubah :");
                m1.displayMessage();
            } else if (konfirmasi.equalsIgnoreCase("N")) {
                System.out.println("Terima kasih, Anda telah keluar dari mode pengeditan detail mobil.");
                break;
            } else {
                System.out.println("Masukkan tidak valid. Silakan masukkan 'Y' atau 'N'.");
            }
        }

        input.close();
    
    }
}
