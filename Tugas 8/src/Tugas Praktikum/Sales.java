class Sales extends Pegawai {
    double totalPenjualan;
    double komisi;

    Sales(String nama, String noKTP, double totalPenjualan, double komisi) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }

    @Override
    double hitungGaji() {
        return totalPenjualan * komisi;
    }

    double getTotalPenjualan() {
        return totalPenjualan;
    }

    double getKomisi() {
        return komisi;
    }
}
