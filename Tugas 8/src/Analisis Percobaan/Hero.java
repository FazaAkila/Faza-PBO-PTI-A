public class Hero {
    private String name;
    private double health;
    
    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }
    
    //getter
    public double getHealth() { 
        return this.health;
    }

    public String getName() {
        return this.name;
    }
    
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    //method umum
    public void display() {
        System.out.println(this.name + " is a regular hero.");
    }
}



// Jawaban Nomor 3
// class Hero {
//     protected String name;
//     protected int health;

//     public Hero(String name, int health) {
//         this.name = name;
//         this.health = health;
//     }

//     public void display() {
//         System.out.println("Hero : " + name + ", Health: " + health);
//     }
// }



   

// Jawaban Nomor 5
// class Hero {
//     protected String name;
//     protected double health;

//     public Hero(String name, double health) {
//         this.name = name;
//         this.health = health;
//     }

//     public void display() {
//         System.out.println("Hero: " + name + ", Health: " + health);
//     }

//     public String getName() {
//         return name;
//     }

//     public double getHealth() {
//         return health;
//     }
// }
