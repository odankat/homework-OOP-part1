public class Main {

    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри Поттер",25,1,81,51,59);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 17,28,92,12,51);
        Griffindor ron = new Griffindor("Рон Уизли", 64,59,28,37,47);
        Slizerin darko = new Slizerin("Дарко Малфой", 57,51,39,74,4,97,42);
        Slizerin grehem = new Slizerin("Грэхэм Монтегю", 64,4,17,34,2,50,94);
        Slizerin gregory = new Slizerin("Грегори Гойл", 53,9,40,44,5,1,53);
        Poofendyi zahariya = new Poofendyi("Захария Смит", 77,22,97,77,81);
        Poofendyi sedrik = new Poofendyi("Седрик Диггори", 58,75,58,30,49);
        Poofendyi jastin = new Poofendyi("Джастин Финч-Флетчли.", 52,71,19,42,27);
        Kogtevran chjoy = new Kogtevran("Чжоу Чанг",86,41,69,49,90,31);
        Kogtevran padma = new Kogtevran("Падма Патил",97,59,95,84,72,4);
        Kogtevran markus = new Kogtevran("Маркус Белби",90,71,75,52,57,12);
        System.out.println(padma);
        System.out.println(ron);
        harry.bestOfGriffindor(ron);
        ron.bestOfGriffindor(germiona);
        ron.bestOfGriffindor(ron);
        darko.bestOfSlizerin(grehem);
        zahariya.bestOfPoofendyi(jastin);
        ron.bestOfHogwarts(markus);


    }
}