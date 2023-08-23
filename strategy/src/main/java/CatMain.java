public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
        cat.setSpeakBehavior(new NoSpeak());
        cat.speak();
        CatEnum ce = new CatEnum();
        ce.speak();
        ce.setSe(SpeakEnum.NOTALKING);
        ce.speak();
    }
}
