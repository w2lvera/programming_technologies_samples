public class NoSpeak implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.println("I can't speak");
    }
}
