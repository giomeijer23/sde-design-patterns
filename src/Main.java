public class Main {
    public static void main(String[] args) {
        IHangmanStateFactory stateFactory = new HangmanStateFactory();

        HangmanContext context = new HangmanGameBuilder()
                .setStateFactory(stateFactory)
                .setInitialWord("hangman")
                .build();

        context.getCurrentState().writer = new TimestampedConsoleWriter();

        while (!(context.getCurrentState() instanceof EndState)) {
            context.turn();
        }
    }
}
