public class WinState extends AHangmanState {
    private HangmanContext context;

    public WinState() {
        super();
    }

    public void turn() {
        this.writer.writeLine("You have guessed the word correctly! Do you want to play again?");
        String check = this.reader.readLine();
        if (check.equalsIgnoreCase("yes")) {
            String wordToGuess = "hangman";
            this.context.changeState(StateFactory.createState("playing", wordToGuess));
            this.context.turn();
        } else {
            this.writer.writeLine("OK, have a nice day :)");
        }
    }
}
