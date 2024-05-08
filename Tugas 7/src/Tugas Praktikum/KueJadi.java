class KueJadi extends Kue {
    private double jumlah;

    KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    // Getter untuk atribut jumlah
    public double getJumlah() {
        return jumlah;
    }
}
