import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Manusia cowokMenikah = new Manusia("Timothée Chalamet", true, "123456789", true);
        Manusia cewekMenikah = new Manusia("Ariana Grande", false, "987654321", true);
        Manusia belumMenikah = new Manusia("Taylor Swift", false, "567890123", false);

        System.out.println("Test case Manusia:");
        System.out.println("Cowok Menikah : ");
        System.out.println(cowokMenikah.toString());
        System.out.println("\nCewek Menikah: ");
        System.out.println(cewekMenikah.toString());
        System.out.println("\nBelum Menikah : ");
        System.out.println(belumMenikah.toString());

        System.out.println("\nTest case Mahasiswa FILKOM :");
        MahasiswaFILKOM mahasiswaip3 = new MahasiswaFILKOM("Oliver Bearman", true, "0123456789", false, "2151506071110009", 3.0);
        MahasiswaFILKOM mahasiswaip35 = new MahasiswaFILKOM("Johnny Orlando", true, "9876543210", false, "2251506011110009", 3.5);
        MahasiswaFILKOM mahasiswaip39 = new MahasiswaFILKOM("Gracie Abrams", false, "6789012345", true, "2351506001110009", 3.9);

        System.out.println("Mahasiswa 1 :");
        System.out.println(mahasiswaip3.toString());
        System.out.println("\nMahasiswa 2 :");
        System.out.println(mahasiswaip35.toString());
        System.out.println("\nMahasiswa 3 :");
        System.out.println(mahasiswaip39.toString());

        System.out.println("\nTest case Pekerja :");
        Pekerja pekerjaA = new Pekerja("Gigi Hadid", true, "1357924680", true, 8000, LocalDate.of(2019, 1, 1), 2);
        Pekerja pekerjaB = new Pekerja("Kendall Jenner", false, "2468135790", false, 9000, LocalDate.of(2015, 1, 1), 0);
        Pekerja pekerjaC = new Pekerja("Emma Stone", true, "0864213579", true, 10000, LocalDate.of(2004, 1, 1), 10);

        System.out.println("Pekerja A :");
        System.out.println(pekerjaA.toString());
        System.out.println("\nPekerja B :");
        System.out.println(pekerjaB.toString());
        System.out.println("\nPekerja C :");
        System.out.println(pekerjaC.toString());

        System.out.println("\nTest case Manager :");
        Manager manager = new Manager("Lana Del Rey", false, "0975312468", true, 7500, LocalDate.of(2009, 1, 1), 3, "Department IT");

        System.out.println("Manager :");
        System.out.println(manager.toString());
    }
}
