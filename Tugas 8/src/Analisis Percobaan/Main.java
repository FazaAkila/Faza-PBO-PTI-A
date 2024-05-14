public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);

    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100);
    hero1.display();
    
    //upcasting
    Hero heroUp = (Hero)hero1;
    heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    
    //Object dgn class Hero
    Hero heroReg = new Hero("Boy",100);
    heroReg.display();
    
    //downcasting
    //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    //heroDown.display();
    
    //heroUp dikembalikan ke hero1
    HeroIntel hero2 = (HeroIntel) heroUp;
    hero2.display(); //ini berhasil downcasting
    }
}




// Jawaban Nomor 3
// public class Main {
//     public static void main(String[] args) {
//         // Object dengan class HeroIntel
//         HeroIntel hero1 = new HeroIntel("Ucup", 100);
//         hero1.display();
        
//         // upcasting
//         Hero heroUp = (Hero) hero1;
//         heroUp.display();
//         // System.out.println(heroUp.getType()); // ini error, karena Hero tidak punya metode getType
        
//         // Object dengan class Hero
//         Hero heroReg = new Hero("Boy", 100);
//         heroReg.display();
        
//         // downcasting
//         // HeroAgility heroDown = (HeroAgility) heroReg; // ini error
//         // heroDown.display();
        
//         // heroUp dikembalikan ke hero1
//         HeroIntel hero2 = (HeroIntel) heroUp;
//         hero2.display(); // berhasil downcasting
//         HeroAgility hero3 = (HeroAgility) heroUp; // menyebabkan ClassCastException
//         hero3.display();
//     }
// }



// public class Main {
//     public static void main(String[] args) {
//         // Object dengan class HeroIntel
//         HeroIntel hero1 = new HeroIntel("Ucup", 100);
//         hero1.display();
        
//         // upcasting
//         Hero heroUp = (Hero) hero1;
//         heroUp.display();
//         // System.out.println(heroUp.getType()); // error, karena Hero tidak punya metode getType
        
//         // Object dengan class Hero
//         Hero heroReg = new Hero("Boy", 100);
//         heroReg.display();
        
//         // downcasting (error)
//         // HeroAgility heroDown = (HeroAgility) heroReg; 
//         // heroDown.display();
        
//         // heroUp dikembalikan ke hero1
//         HeroIntel hero2 = (HeroIntel) heroUp;
//         hero2.display(); // ini berhasil downcasting

//         if (heroUp instanceof HeroAgility) {
//             HeroAgility hero3 = (HeroAgility) heroUp;
//             hero3.display();
//         } else {
//             System.out.println("heroUp bukan instance dari HeroAgility");
//         }
//     }
// }


// Jawaban Nomor 4
// public class Main {
//     public static void main(String[] args) {
//         // Object dengan class HeroIntel
//         HeroIntel hero1 = new HeroIntel("Ucup", 100.0);
//         hero1.display();
//         System.out.println("Type of hero1: " + hero1.type); // Mengakses atribut type secara langsung

//         // upcasting
//         Hero heroUp = (Hero) hero1;
//         heroUp.display();
//         // System.out.println(heroUp.getType()); // ini error, karena Hero tidak punya metode getType

//         // Object dengan class Hero
//         Hero heroReg = new Hero("Boy", 100.0);
//         heroReg.display();

//         // downcasting (ini error)
//         // HeroAgility heroDown = (HeroAgility) heroReg; 
//         // heroDown.display();

//         // heroUp dikembalikan ke hero1
//         HeroIntel hero2 = (HeroIntel) heroUp;
//         hero2.display(); // ini berhasil downcasting

//         // Tambahkan dan jalankan kode ini
//         if (heroUp instanceof HeroAgility) {
//             HeroAgility hero3 = (HeroAgility) heroUp;
//             hero3.display();
//         } else {
//             System.out.println("heroUp bukan instance dari HeroAgility");
//         }

//         // Membuat objek HeroAgility dan mengakses atribut type secara langsung
//         HeroAgility hero4 = new HeroAgility("Hanabi", 80.0);
//         hero4.display();
//         System.out.println("Type of hero4: " + hero4.type); // Mengakses atribut type secara langsung
//     }
// }






// Jawaban Nomor 5
// public class Main {
//     public static void main(String[] args) {
//         // Object dengan class HeroIntel
//         HeroIntel hero1 = new HeroIntel("Ucup", 100.0);
//         hero1.display();
//         System.out.println("Type of Ucup : " + hero1.type); // Mengakses atribut type secara langsung

//         // upcasting
//         Hero heroUp = (Hero) hero1;
//         heroUp.display();
//         // System.out.println(heroUp.getType()); // ini error, karena Hero tidak punya metode getType

//         // Object dengan class Hero
//         Hero heroReg = new Hero("Boy", 100.0);
//         heroReg.display();

//         // downcasting (ini error)
//         // HeroAgility heroDown = (HeroAgility) heroReg; 
//         // heroDown.display();

//         // heroUp dikembalikan ke hero1
//         HeroIntel hero2 = (HeroIntel) heroUp;
//         hero2.display(); // ini berhasil downcasting
        
//         if (heroUp instanceof HeroAgility) {
//             HeroAgility hero3 = (HeroAgility) heroUp;
//             hero3.display();
//         } else {
//             System.out.println("heroUp bukan instance dari HeroAgility");
//         }
        
//         HeroAgility hero4 = new HeroAgility("Hanabi", 800.0);
//         hero4.display();
//         System.out.println("Type of Hanabi: " + hero4.type); // Mengakses atribut type secara langsung

//         HeroMagic heroMagic = new HeroMagic("Oddete", 500.0);
//         heroMagic.display();
//         System.out.println("Power dari Hero Magic : " + heroMagic.power);

//         // Upcasting dari HeroMagic ke Hero
//         Hero heroMagicUp = (Hero) heroMagic;
//         heroMagicUp.display();

//         // Downcasting dari Hero ke HeroMagic
//         if (heroMagicUp instanceof HeroMagic) {
//             HeroMagic heroMagicDown = (HeroMagic) heroMagicUp;
//             heroMagicDown.display();
//             System.out.println("Type of Oddete : " + heroMagicDown.power);
//         } else {
//             System.out.println("heroMagicUp bukan instance dari HeroMagic");
//         }
//     }
// }
