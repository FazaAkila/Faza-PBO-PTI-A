public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMathGrade(100);
        anna.setScienceGrade(89);
        anna.setEnglishGrade(80);
        anna.displayMessage();
        
        // menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMathGrade(70);
        chris.setScienceGrade(60);
        chris.setEnglishGrade(90);
        chris.displayMessage();
        
        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("Anna", "Batu", 18);
        anna.displayMessage();
        
        // siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
    }
}
