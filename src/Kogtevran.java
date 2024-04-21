public class Kogtevran extends Hogwarts {

    private int nous;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, int nous, int wisdom, int wit, int creation, int magic, int transgression) {
        super(name, magic, transgression);
        this.nous = nous;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getNous() {
        return nous;
    }

    public void setNous(int nous) {
        this.nous = nous;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "nous=" + nous +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    public void bestOfKogtervan(Kogtevran person) {
        int stats = nous + wisdom + wit + creation;
        int statsPerson = person.getNous() + person.getWisdom() + person.getWit() + person.getCreation();
        if (stats > statsPerson) {
            System.out.println(getName() + " студент сильнее, чем " + person.getName());
        } else if (statsPerson > stats) {
            System.out.println(getName() + " студент слабее чем " + person.getName());
        } else if (statsPerson == stats) {
            System.out.println("Студенты равны");
        }
    }
}