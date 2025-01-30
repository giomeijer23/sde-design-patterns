public class Main {
    public static void main(String[] args) {
        AHangmanStateFactory stateFactory = new HangmanStateFactory();

        HangmanContext context = new HangmanGameBuilder()
                .setStateFactory(stateFactory)
                .setInitialWord("hangman")
                .build();

        // Gebruik de TimestampedConsoleWriter
        context.getCurrentState().writer = new TimestampedConsoleWriter();

        while (!(context.getCurrentState() instanceof EndState)) {
            context.turn();
        }
    }
}
