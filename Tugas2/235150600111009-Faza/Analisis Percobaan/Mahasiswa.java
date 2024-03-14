public class Mahasiswa {
    private int lembarBuku;
    private int kataSehari;
    public Mahasiswa(int lembarBuku, int kataSehari) {
        this.lembarBuku = lembarBuku;
        this.kataSehari = kataSehari;
    }
    
    public int durasiLamaMenulis() {
        int lembarKata = 100 * 2;
        int jumlahKata = lembarKata * lembarBuku;
        int lamaHari = jumlahKata / kataSehari;
        return lamaHari;
    }
    
    public int getLembarBuku() {
        return lembarBuku;
    }
    
    public int getKataSehari() {
        return kataSehari;
    }
    
    public static void main(String[] args) {
        
        Mahasiswa bukuTulis = new Mahasiswa(50, 100);
        
        int lamaMenulis = bukuTulis.durasiLamaMenulis();
        
        System.out.println("Lama waktu yang dibutuhkan Mahasiswa A untuk menulis buku : " + lamaMenulis + " hari.");
    }
}
