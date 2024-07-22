public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int thirstPower,
                     int powerMagic, int transgress) {
        super(name, powerMagic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public String toString() {
        return String.format("Slytherin: name - %s, cunning - %s, determination - %s, ambition - %s, " +
                        "resourcefulness - %s, thirdPower - %s, powerMagic - %s, transgress - %s",
                getName(), cunning, determination, ambition, resourcefulness, thirstPower, getPowerMagic(), getTransgress());
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }
    private int getFullMagic () {
        return cunning + determination + ambition + resourcefulness + thirstPower;

    }
    public static void max(Slytherin slytherinsOne, Slytherin slytherinsTwo) {
        if (slytherinsOne.getFullMagic() < slytherinsTwo.getFullMagic()) {
            System.out.println(slytherinsOne.getName() + " лучший слизеринец, чем " + slytherinsTwo.getName());
        } else if (slytherinsOne.getFullMagic() > slytherinsTwo.getFullMagic()) {
            System.out.println(slytherinsOne.getName() + " лучший слизеринец, чем " + slytherinsTwo.getName());
        } else {
            System.out.println(slytherinsOne.getName() + " то они равны " + slytherinsTwo.getName());
        }
    }
}