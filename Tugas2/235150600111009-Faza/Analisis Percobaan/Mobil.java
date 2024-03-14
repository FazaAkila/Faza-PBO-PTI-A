public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu; 
    private double waktuSekon; 
    private double gantiParameter; 
   
    
    public void setNoPlat(String s) {
        noPlat = s;
    }
    
    public void setWarna(String s) {
        warna = s;
    }
    
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    
    public void setKecepatan(int i) {
        kecepatan = i;
        rubahKecepatan(i); 
    }
    
    public void setWaktu(double d) { 
        waktu = d;
        rubahSekon(d); 
    }
    
    private void rubahSekon(double d) { 
        waktuSekon = d * 3600.0;
    }
    
    private void rubahKecepatan(double i) { 
        gantiParameter = kecepatan * 1000.0 / 3600.0;
    }
    
    public double jarakTempuh() { 
        return (gantiParameter * waktuSekon) / 1000.0; 
    }
    
    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memililki warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan + " Km/Jam");
        System.out.println("Dengan waktu " + waktu + " jam, dapat menempuh jarak " + jarakTempuh() + " kilometer"); 
    }
}
