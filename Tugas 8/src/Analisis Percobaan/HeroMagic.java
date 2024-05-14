// Jawaban Nomor 5
class HeroMagic extends Hero {
    public String power;

    public HeroMagic(String name, double health) {
        super(name, health);
        this.power = "Magic";
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " Adalah " + this.power + " Hero Dengan " + this.getHealth() + " Health.");
    }
}
