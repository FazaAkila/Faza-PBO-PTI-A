import java.time.LocalDate;

class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        long tahunKerja = java.time.temporal.ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (tahunKerja < 5) {
            return gaji * 0.05;
        } else if (tahunKerja < 10) {
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk : " + tahunMasuk + "\nJumlah Anak : " + jumlahAnak + "\nGaji : $" + gaji;
    }
}

