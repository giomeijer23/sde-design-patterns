public class LoseState extends AHangmanState {
    public LoseState() {
        super();
    }

    public void turn() {
        this.writer.writeLine("Oops! You didn't guess the word. Want to try again?");
        String check = this.reader.readLine();
        if (check.equalsIgnoreCase("yes")) {
            String wordToGuess = "hangman";
            this.context.changeState(new PlayingState(wordToGuess));
            this.context.turn();
        } else {
            this.writer.writeLine("OK, have a nice day :)");
        }
    }
}
