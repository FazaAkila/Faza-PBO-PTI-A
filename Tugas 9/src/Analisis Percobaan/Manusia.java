public class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;
   
    @Override
    public void makan() {
    System.out.println("Makan pakai sendok garpu");}
    @Override
    public void berjalan() {
    System.out.println("Jalan pakai dua kaki");}
    @Override
    public void bersuara() {
    System.out.println("Suaranya merdu");}
    @Override
    public void tampilkanNama() {
    System.out.println("Nama saya: " + this.nama);}
    @Override
    public void tampilkanUmur() {
    System.out.println("Umur saya: " + this.umur);}
   
   }



// Untuk Soal Nomor 1
// public class Manusia implements MakhlukHidup, Identitas {
//     String nama;
//     int umur;
   
//     @Override
//     public void makan() {
//         System.out.println("Makan pakai sendok garpu");
//     }

//     @Override
//     public void berjalan() {
//         System.out.println("Jalan pakai dua kaki");
//     }

//     @Override
//     public void bersuara() {
//         System.out.println("Suaranya merdu");
//     }

//     @Override
//     public void tampilkanNama() {
//         System.out.println("Nama saya: " + this.nama);
//     }

//     @Override
//     public void tampilkanUmur() {
//         System.out.println("Umur saya: " + this.umur);
//     }
// }




// Soal Nomor 6
// public class Manusia implements MakhlukHidup, Identitas {
//     String nama;
//     int umur;
   
//     public Manusia(String nama, int umur) {
//         this.nama = nama;
//         this.umur = umur;
//     }

//     @Override
//     public void makan() {
//         System.out.println("Makan pakai sendok garpu");
//     }

//     @Override
//     public void berjalan() {
//         System.out.println("Jalan pakai dua kaki");
//     }

//     @Override
//     public void bersuara() {
//         System.out.println("Suaranya merdu");
//     }

//     @Override
//     public void tampilkanNama() {
//         System.out.println("Nama Saya: " + this.nama);
//     }

//     @Override
//     public void tampilkanUmur() {
//         System.out.println("Umur Saya: " + this.umur);
//     }
// }


// Nomor 7
// public class Manusia implements MakhlukHidup, Identitas {
//     String nama;
//     int umur;

//     @Override
//     public void makan() {
//         System.out.println("Makan pakai sendok garpu");
//     }

//     @Override
//     public void berjalan() {
//         System.out.println("Jalan pakai dua kaki");
//     }

//     @Override
//     public void bersuara() {
//         System.out.println("Suaranya merdu");
//     }

//     @Override
//     public void tampilkanNama() {
//         System.out.println("Nama saya: " + this.nama);
//     }

//     @Override
//     public void tampilkanUmur() {
//         System.out.println("Umur saya: " + this.umur);
//     }
// }
