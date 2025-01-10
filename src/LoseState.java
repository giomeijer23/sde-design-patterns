public class LoseState extends AHangmanState {
    public LoseState() {
        super();
    }

    public void turn() {
        String wordToGuess = "hangman";
        this.context.changeState(new PlayingState(wordToGuess));
        this.context.turn();
    }

    public void ending() {
        this.writer.writeLine("Oops! You didn't guess the word. Want to try again?");
        String check = this.reader.readLine();
        if (check.equalsIgnoreCase("yes")) {
            this.context.turn();
        } else {
            this.context.changeState(new EndState());
            this.context.turn();
        }
    }
}
