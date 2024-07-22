public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery,
                      int powerMagic, int transgress) {
        super(name, powerMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String toString() {
        return String.format("Gryffindor: name - %s, nobility - %s, honor - %s, bravery - %s, powerMagic - %s, transgress - %s",
                getName(), nobility, honor, bravery, getPowerMagic(), getTransgress());
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int getFullMagic () {
        return nobility + honor + bravery;
    }

    public static void max(Gryffindor gryffindorsOne, Gryffindor gryffindorsTwo) {
        if (gryffindorsOne.getFullMagic() < gryffindorsTwo.getFullMagic()) {
            System.out.println(gryffindorsOne.getName() + " лучший гриффиндорец, чем " + gryffindorsTwo.getName());
        } else if (gryffindorsOne.getFullMagic() > gryffindorsTwo.getFullMagic()) {
            System.out.println(gryffindorsOne.getName() + " лучший гриффиндорец, чем " + gryffindorsTwo.getName());
        } else {
            System.out.println(gryffindorsOne.getName() + " то они равны " + gryffindorsTwo.getName());
        }
        }

    }


