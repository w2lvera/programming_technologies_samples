public enum SpeakEnum {
    TALKING{
        @Override
        void speak() {
            System.out.println("I can speak");
        }
    },
    NOTALKING{
        @Override
        void speak() {
            System.out.println("I can't speak");
        }
    };
    abstract void speak();
}
