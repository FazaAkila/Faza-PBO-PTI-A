public class HeroAgility extends Hero {
    String type;
    
    public HeroAgility(String name, double health) {
        super(name, health);
        this.type = "Agility";
    }
    
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}




// Jawaban Nomor 3
// class HeroAgility extends Hero {
//     public HeroAgility(String name, int health) {
//         super(name, health);
//     }

//     @Override
//     public void display() {
//         System.out.println("Agility Hero: " + name + ", Health: " + health);
//     }

//     public String getType() {
//         return "Agility";
//     }
// }





// Jawaban Nomor 4
// class HeroAgility extends Hero {
//     public String type;

//     public HeroAgility(String name, double health) {
//         super(name, health);
//         this.type = "Agility";
//     }

//     @Override
//     public void display() {
//         System.out.println(this.getName() + " is a " + this.type + " Hero with " + this.getHealth() + " health.");
//     }
// }

