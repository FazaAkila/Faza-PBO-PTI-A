class KuePesanan extends Kue {
    private double berat;

    KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    double hitungHarga() {
        return getHarga() * berat;
    }

    public double getBerat() {
        return berat;
    }
}
