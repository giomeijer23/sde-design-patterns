public class WinState extends AHangmanState {
    public WinState() {
        super();
    }

    public void turn() {
        String wordToGuess = "hangman";
        this.context.changeState(new PlayingState(wordToGuess));
        this.context.turn();
    }

    public void ending() {
        this.writer.writeLine("You have guessed the word correctly! Do you want to play again?");
        String check = this.reader.readLine();
        if (check.equalsIgnoreCase("yes")) {
            String wordToGuess = "hangman";
            this.context.changeState(new PlayingState(wordToGuess));
            this.context.turn();
        } else {
            this.context.changeState(new EndState());
            this.context.turn();
        }
    }
}
