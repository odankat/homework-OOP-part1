public class Hogwarts {

    protected String name;
    protected int magic;
    protected int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void bestOfHogwarts(Hogwarts person) {
        int stats = magic + transgression;
        int statsPerson = person.getMagic() + person.getTransgression();
        if (stats > statsPerson) {
            System.out.println(getName() + " студент сильнее, чем " + person.getName());
        } else if (statsPerson > stats) {
            System.out.println(getName() + " студент слабее чем " + person.getName());
        } else if (statsPerson == stats) {
            System.out.println("Студенты равны");
        }
    }


}
