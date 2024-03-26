import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Data {
    public static final int MAX_HEWAN = 100;
    private Hewan[] daftarHewan;
    private int jumlahHewan;

    public Data() {
        daftarHewan = new Hewan[MAX_HEWAN];
        jumlahHewan = 0;
    }

    public void tambahHewan(Hewan hewan) {
        if (jumlahHewan < MAX_HEWAN) {
            daftarHewan[jumlahHewan++] = hewan;
        } else {
            System.out.println("Kapasitas data hewan sudah penuh.");
        }
    }

    public void tampilkanData() {
        if (jumlahHewan > 0) {
            for (int i = 0; i < jumlahHewan; i++) {
                daftarHewan[i].tampilkanData();
            }
        } else {
            System.out.println("Belum ada data hewan.");
        }
    }

    public void perbaruiData(int index, Hewan hewanBaru) {
        if (index >= 0 && index < jumlahHewan) {
            daftarHewan[index] = hewanBaru;
            System.out.println("Data hewan berhasil diperbarui.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void hapusData(int index) {
        if (index >= 0 && index < jumlahHewan) {
            for (int i = index; i < jumlahHewan - 1; i++) {
                daftarHewan[i] = daftarHewan[i + 1];
            }
            jumlahHewan--;
            System.out.println("Data hewan berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public Hewan getHewan(int index) {
        if (index >= 0 && index < jumlahHewan) {
            return daftarHewan[index];
        } else {
            System.out.println("Indeks tidak valid.");
            return null;
        }
    }

    public void writeFile(String namaFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            for (int i = 0; i < jumlahHewan; i++) {
                writer.write(daftarHewan[i].namaHewan + "," + daftarHewan[i].umurHewan + "," + daftarHewan[i].jenisHewan + "," + daftarHewan[i].habitatHewan + "," + daftarHewan[i].asalHewan + "," + daftarHewan[i].beratHewan + "\n");
            }
            System.out.println("Data berhasil disimpan ke file.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data ke file: " + e.getMessage());
        }
    }

    public void readFile(String namaFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Hewan hewan = new Hewan(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3], parts[4], Double.parseDouble(parts[5]));
                tambahHewan(hewan);
            }
            System.out.println("Data berhasil dimuat dari file.");
        } catch (IOException e) {
            System.out.println("Gagal memuat data dari file: " + e.getMessage());
        }
    }
}
