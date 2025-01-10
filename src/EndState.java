public class EndState extends AHangmanState {
    @Override
    public void turn() {
        this.writer.writeLine("Thank you for playing Hangman. Goodbye!");
    }

    @Override
    public void ending() {
        // Do nothing, het spel is afgelopen.
    }
}
