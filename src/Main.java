public class Main {
    public static void main(String[] args) {
        HangmanContext context = new HangmanContext();
        AHangmanState initialState = new PlayingState("hangman");
        context.changeState(initialState);

        while (!(context.getCurrentState() instanceof EndState)) {
            context.turn();
        }
    }
}
