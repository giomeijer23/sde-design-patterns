public class PlayingState extends AHangmanState {
    private String guessWord;

    private String guessedLetters;

    private String correctLetters;

    private int errors;

    public PlayingState(String guessWord) {
        super();
        this.guessWord = guessWord;
        this.guessedLetters = "";
        this.correctLetters = "";
        for (int i = 0; i < guessWord.length(); i++) { this.correctLetters += "."; }
        this.errors = 0;
    }

    public void turn() {
        this.writer.writeLine("This is what you know right now: " + correctLetters + "\n");
        if (!guessedLetters.isEmpty()) {
            this.writer.writeLine("These are the letters you have already guessed: " + guessedLetters + "\n");
        }
        if (errors == 7) {
            this.writer.writeLine("You have no mistakes left, be careful!");
        } else if (errors > 0) {
            this.writer.writeLine("You have " + (7 - errors) + " mistakes left");
        }
        this.writer.writeLine("What letter do you want to guess?");

        // Checks if only one letter is in the input
        String guess = "";
        while (guess.length() != 1) {
            guess = reader.readLine();
            if (guess.length() != 1) {
                this.writer.writeLine("Please write one letter");
            }
        }

        this.guessedLetters += guess;
        char letter = guess.charAt(0);

        if (isLetterInWord(letter, this.guessWord)) {
            changeShowWord(letter);
            this.writer.writeLine("Good Guess! This letter is in the word\n");
        } else {
            this.writer.writeLine("Yikes! That letter is not in the word\n");
            this.errors++;
        }

        if (errors > 7) {
            this.context.changeState(new LoseState());
            this.context.ending();
        } else if (!isLetterInWord('.', this.correctLetters)) {
            this.context.changeState(new WinState());
            this.context.ending();
        } else {
            this.context.turn();
        }
    }

    public void ending() {
        // does nothing
    }

    private void changeShowWord(char letter) {
        for (int i = 0; i < this.guessWord.length(); i++) {
            if (this.guessWord.charAt(i) == letter) {
                this.correctLetters = this.correctLetters.substring(0, i)
                        + Character.toString(letter)
                        + this.correctLetters.substring(i + 1);
            }
        }
    }
}
