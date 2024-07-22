public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int intelligence, int wisdom, int wit, int creativity,
                     int powerMagic, int transgress) {
        super(name, powerMagic, transgress);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public String toString() {
        return String.format("Ravenclaw: name - %s, intelligence - %s, wisdom - %s, wit - %s, creativity - %s, powerMagic - %s, transgress - %s",
                getName(), intelligence, wisdom, wit, creativity, getPowerMagic(), getTransgress());
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int getFullMagic () {
        return intelligence + wisdom + wit + creativity;
    }

    public static void max(Ravenclaw ravenclawsOne, Ravenclaw ravenclawsTwo) {
        if (ravenclawsOne.getFullMagic() < ravenclawsTwo.getFullMagic()) {
            System.out.println(ravenclawsOne.getName() + " лучший пуффендуец, чем " + ravenclawsTwo.getName());
        } else if (ravenclawsOne.getFullMagic() > ravenclawsTwo.getFullMagic()) {
            System.out.println(ravenclawsOne.getName() + " лучший пуффендуец, чем " + ravenclawsTwo.getName());
        } else {
            System.out.println(ravenclawsOne.getName() + " то они равны " + ravenclawsTwo.getName());
        }
    }

}