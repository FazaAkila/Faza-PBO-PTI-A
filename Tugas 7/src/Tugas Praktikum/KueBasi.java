class KueBasi extends Kue {
    private int lamaHari;

    KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    @Override
    double hitungHarga() {
        return getHarga() - (lamaHari * (getHarga() * 0.1));
    }

    // Getter untuk atribut lamaHari
    public int getLamaHari() {
        return lamaHari;
    }
}
