public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int hardWork, int loyalty, int honesty,
                      int powerMagic, int transgress) {
        super(name, powerMagic, transgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String toString() {
        return String.format("Hufflepuff: name - %s, hardWork - %s, loyalty - %s, honesty - %s, powerMagic - %s, transgress - %s",
                getName(), hardWork, loyalty, honesty, getPowerMagic(), getTransgress());
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int getFullMagic () {
        return hardWork + loyalty + honesty;
    }

    public static void max(Hufflepuff hufflepuffsOne, Hufflepuff hufflepuffsTwo) {
        if (hufflepuffsOne.getFullMagic() < hufflepuffsTwo.getFullMagic()) {
            System.out.println(hufflepuffsOne.getName() + " лучший пуффендуец, чем " + hufflepuffsTwo.getName());
        } else if (hufflepuffsOne.getFullMagic() > hufflepuffsTwo.getFullMagic()) {
            System.out.println(hufflepuffsOne.getName() + " лучший пуффендуец, чем " + hufflepuffsTwo.getName());
        } else {
            System.out.println(hufflepuffsOne.getName() + " то они равны " + hufflepuffsTwo.getName());
        }
    }
}