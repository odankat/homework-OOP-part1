public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int nobility, int honor, int bravery, int magic, int transgression) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    public void bestOfGriffindor(Griffindor person) {
        int stats = nobility + honor + bravery;
        int statsPerson = person.getNobility() + person.getHonor() + person.getBravery();
        if (stats > statsPerson) {
            System.out.println(getName() + " студент сильнее, чем " + person.getName());
        } else if (statsPerson > stats) {
            System.out.println(getName() + " студент слабее чем " + person.getName());
        } else if (statsPerson == stats) {
            System.out.println("Студенты равны");
        }

    }

}
