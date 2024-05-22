// Nomor 8
public class Robot implements MakhlukHidup, Identitas {
    String model;
    int tahunProduksi;

    public Robot(String model, int tahunProduksi) {
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    @Override
    public void makan() {
        System.out.println("Robot tidak membutuhkan makan, hanya membutuhkan pengisian daya");
    }

    @Override
    public void berjalan() {
        System.out.println("Robot berjalan dengan roda atau kaki mekanik");
    }

    @Override
    public void bersuara() {
        System.out.println("Robot berbicara dengan suara buatan manusia");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Model robot : " + this.model);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Tahun produksi : " + this.tahunProduksi);
    }
}
