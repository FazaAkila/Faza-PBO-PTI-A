class PegawaiTetap extends Pegawai {
    double upah;

    PegawaiTetap(String nama, String noKTP, double upah) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.upah = upah;
    }

    @Override
    double hitungGaji() {
        return upah;
    }

    double getUpah() {
        return upah;
    }
}
