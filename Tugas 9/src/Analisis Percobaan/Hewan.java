public class Hewan implements MakhlukHidup, Identitas {
    @Override
    public void makan() {
    System.out.println("Makan pakai tangan dan mulut");
    }
    @Override
    public void berjalan() {
    System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara() {
    System.out.println("Suaranya nggak jelas");
    }
   
    public void tampilkanNama (){}
   
    public void tampilkanUmur () {}
}
   

// Nomor 7
// public class Hewan implements MakhlukHidup, Identitas {
//     @Override
//     public void makan() {
//         System.out.println("Makan pakai tangan dan mulut");
//     }

//     @Override
//     public void berjalan() {
//         System.out.println("Jalan pakai 4 kaki");
//     }

//     @Override
//     public void bersuara() {
//         System.out.println("Suaranya nggak jelas");
//     }

//     @Override
//     public void tampilkanNama() {
//         System.out.println("Nama hewan tidak tersedia");
//     }

//     @Override
//     public void tampilkanUmur() {
//         System.out.println("Umur hewan tidak tersedia");
//     }
// }
