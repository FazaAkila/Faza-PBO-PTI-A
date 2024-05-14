public class HeroIntel extends Hero {
    String type;
    
    public HeroIntel(String name, double health) {
        super(name, health);
        this.type = "Intel";
    }
    
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}



// Jawaban Nomor 3
// class HeroIntel extends Hero {
//     public HeroIntel(String name, int health) {
//         super(name, health);
//     }

//     @Override
//     public void display() {
//         System.out.println("Intel Hero: " + name + ", Health: " + health);
//     }

//     public String getType() {
//         return "Intel";
//     }
// }




// Jawaban Nomor 4
// class HeroIntel extends Hero {
//     public String type;

//     public HeroIntel(String name, double health) {
//         super(name, health);
//         this.type = "Intel";
//     }

//     @Override
//     public void display() {
//         System.out.println(this.getName() + " is a " + this.type + " Hero with " + this.getHealth() + " health.");
//     }
// }


