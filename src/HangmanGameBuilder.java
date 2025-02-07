public class HangmanGameBuilder {
    private IHangmanStateFactory stateFactory;
    private String initialWord;

    public HangmanGameBuilder setStateFactory(IHangmanStateFactory stateFactory) {
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
