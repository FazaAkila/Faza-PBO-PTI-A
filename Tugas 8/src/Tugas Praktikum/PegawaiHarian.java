class PegawaiHarian extends Pegawai {
    double upahPerJam;
    double totalJamKerja;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJamKerja) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.upahPerJam = upahPerJam;
        this.totalJamKerja = totalJamKerja;
    }

    @Override
    double hitungGaji() {
        if (totalJamKerja <= 40) {
            return upahPerJam * totalJamKerja;
        } else {
            int jamNormal = 40;
            double jamLembur = totalJamKerja - jamNormal;
            return (upahPerJam * jamNormal) + (upahPerJam * 1.5 * jamLembur);
        }
    }

    double getUpahPerJam() {
        return upahPerJam;
    }

    double getTotalJamKerja() {
        return totalJamKerja;
    }
}
