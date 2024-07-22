public class Hogwarts {
    private String name;
    private int powerMagic;
    private int transgress;

    public Hogwarts(String name, int powerMagic, int transgress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    private int getFullMagic() {
        return transgress + powerMagic;
    }

    public static void beastStudent(Hogwarts gryffindorsOne, Hogwarts slytherinsOne) {
        if (gryffindorsOne.getFullMagic() < slytherinsOne.getFullMagic()) {
            System.out.println(gryffindorsOne.getName() + " лучший студент, чем " + slytherinsOne.getName());
        } else if (gryffindorsOne.getFullMagic() > slytherinsOne.getFullMagic()) {
            System.out.println(gryffindorsOne.getName() + " лучший студент, чем " + slytherinsOne.getName());
        } else {
            System.out.println(gryffindorsOne.getName() + " то они равны " + slytherinsOne.getName());
        }
    }
}

