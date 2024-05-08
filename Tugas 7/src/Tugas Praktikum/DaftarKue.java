import java.util.ArrayList;

public class DaftarKue {
    private ArrayList<Kue> daftarKue;

    public DaftarKue(int kapasitas) {
        daftarKue = new ArrayList<>(kapasitas);
    }

    public void tambahkanKue(Kue kue, int index) {
        daftarKue.add(index, kue);
    }

    public void tampilkanSemuaKue() {
        for (Kue kue : daftarKue) {
            System.out.println(kue);
        }
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (Kue kue : daftarKue) {
            totalHarga += kue.hitungHarga();
        }
        return totalHarga;
    }

    public double hitungTotalHargaKuePesanan() {
        double totalHargaKuePesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
            }
        }
        return totalHargaKuePesanan;
    }

    public double hitungTotalBeratKuePesanan() {
        double totalBeratKuePesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        return totalBeratKuePesanan;
    }

    public double hitungTotalHargaKueJadi() {
        double totalHargaKueJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
            }
        }
        return totalHargaKueJadi;
    }

    public double hitungTotalJumlahKueJadi() {
        double totalJumlahKueJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        return totalJumlahKueJadi;
    }

    public double hitungTotalHargaKueBasi() {
        double totalHargaKueBasi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueBasi) {
                totalHargaKueBasi += kue.hitungHarga();
            }
        }
        return totalHargaKueBasi;
    }

    public int hitungTotalLamaHariKueBasi() {
        int totalLamaHariKueBasi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueBasi) {
                totalLamaHariKueBasi += ((KueBasi) kue).getLamaHari();
            }
        }
        return totalLamaHariKueBasi;
    }

    public Kue kueDenganHargaTerbesar() {
        if (daftarKue.isEmpty()) {
            return null;
        }
        Kue kueTerbesar = daftarKue.get(0);
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > kueTerbesar.hitungHarga()) {
                kueTerbesar = kue;
            }
        }
        return kueTerbesar;
    }

    public int indexKosong() {
        for (int i = 0; i < daftarKue.size(); i++) {
            if (daftarKue.get(i) == null) {
                return i;
            }
        }
        return -1;
    }
}
