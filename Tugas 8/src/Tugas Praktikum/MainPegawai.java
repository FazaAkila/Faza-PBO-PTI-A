public class MainPegawai {
    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiTetap("Hanabi", "35072849032742409342", 2000000);
        Pegawai pegawai2 = new PegawaiHarian("Oddete", "35072849032742409343", 8500, 40);
        Pegawai pegawai3 = new Sales("Guinevere", "35072849032742409344", 50, 50000);

        System.out.println("Informasi Gaji Pegawai :");
        System.out.println();

        System.out.println("Pegawai Tetap :");
        System.out.println("Nama Pegawai : " + pegawai1.nama);
        System.out.println("No. KTP : " + pegawai1.noKTP);
        System.out.println("Upah : " + ((PegawaiTetap)pegawai1).getUpah());
        System.out.println("Pendapatan : Rp " + (int)pegawai1.hitungGaji());
        System.out.println();

        System.out.println("Pegawai Harian :");
        System.out.println("Nama Pegawai : " + pegawai2.nama);
        System.out.println("No. KTP : " + pegawai2.noKTP);
        System.out.println("Upah / Jam : Rp " + ((PegawaiHarian)pegawai2).getUpahPerJam());
        System.out.println("Total Jam Kerja : " + ((PegawaiHarian)pegawai2).getTotalJamKerja());
        System.out.println("Pendapatan : Rp " + (int)pegawai2.hitungGaji());
        System.out.println();

        System.out.println("Sales :");
        System.out.println("Nama Sales : " + pegawai3.nama);
        System.out.println("No. KTP : " + pegawai3.noKTP);
        System.out.println("Total Penjualan : " + ((Sales)pegawai3).getTotalPenjualan());
        System.out.println("Besaran Komisi : " + ((Sales)pegawai3).getKomisi() * 100);
        System.out.println("Pendapatan : Rp " + (int)pegawai3.hitungGaji());
    }
}
