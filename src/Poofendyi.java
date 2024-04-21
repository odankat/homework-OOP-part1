public class Poofendyi extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Poofendyi(String name, int hardWork, int loyalty, int honesty, int magic, int transgression) {
        super(name, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Poofendyi{" +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }

    public void bestOfPoofendyi(Poofendyi person) {
        int stats = hardWork + loyalty + honesty;
        int statsPerson = person.getHardWork() + person.getLoyalty() + person.getHonesty();
        if (stats > statsPerson) {
            System.out.println(getName() + " студент сильнее, чем " + person.getName());
        } else if (statsPerson > stats) {
            System.out.println(getName() + " студент слабее чем " + person.getName());
        } else if (statsPerson == stats) {
            System.out.println("Студенты равны");
        }
    }
}