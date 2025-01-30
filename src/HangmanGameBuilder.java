public class HangmanGameBuilder {
    private AHangmanStateFactory stateFactory;
    private String initialWord;

    public HangmanGameBuilder setStateFactory(AHangmanStateFactory stateFactory) {
        this.stateFactory = stateFactory;
        return this;
    }

    public HangmanGameBuilder setInitialWord(String initialWord) {
        this.initialWord = initialWord;
        return this;
    }

    public HangmanContext build() {
        HangmanContext context = new HangmanContext(stateFactory);
        context.changeState("Playing");
        return context;
    }
}
