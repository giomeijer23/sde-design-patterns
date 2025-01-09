public class PlayingState extends AHangmanState {
    private String guessWord;
    private String correctLetters;
    private int errors;
    private WordAdapter wordAdapter;
    private LetterProxy letterProxy;

    public PlayingState(String guessWord) {
        super();
        this.guessWord = guessWord;
        this.correctLetters = ".".repeat(guessWord.length());
        this.errors = 0;
        this.wordAdapter = WordAdapter.getInstance();
        this.letterProxy = new LetterProxy();
    }

    public void turn() {
        this.writer.writeLine("This is what you know right now: " + correctLetters + "\n");

        if (errors > 0) {
            this.writer.writeLine("You have " + (7 - errors) + " mistakes left.");
        }

        this.writer.writeLine("What letter do you want to guess?");
        String guess = "";

        while (guess.length() != 1) {
            guess = reader.readLine();
            if (guess.length() != 1) {
                this.writer.writeLine("Please write one letter.");
            }
        }

        char letter = guess.charAt(0);

        if (letterProxy.isLetterAlreadyGuessed(letter)) {
            this.writer.writeLine("You have already guessed this letter. Try another one.\n");
            return;
        }

        letterProxy.addGuessedLetter(letter);

        if (wordAdapter.containsLetter(letter, this.guessWord)) {
            changeShowWord(letter);
            this.writer.writeLine("Good guess! This letter is in the word.\n");
        } else {
            this.writer.writeLine("Yikes! That letter is not in the word.\n");
            this.errors++;
        }

        // Controleer verliesconditie
        if (errors >= 7) {
            this.context.changeState(new LoseState());
            this.context.ending();
            return;
        }

        // Controleer winstconditie
        if (!this.correctLetters.contains(".")) {
            this.context.changeState(new WinState());
            this.context.ending();
            return;
        }

        this.context.turn();
    }


    public void ending() {
        // does nothing
    }

    private void changeShowWord(char letter) {
        for (int i = 0; i < this.guessWord.length(); i++) {
            if (this.guessWord.charAt(i) == letter) {
                this.correctLetters = this.correctLetters.substring(0, i)
                        + letter
                        + this.correctLetters.substring(i + 1);
            }
        }
    }
}
