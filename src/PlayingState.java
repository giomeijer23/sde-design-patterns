public class PlayingState extends AHangmanState {
    private String guessWord;
    private String correctLetters;
    private PlayingStateProxy stateProxy;  // Use the new Proxy class
    private WordAdapter wordAdapter;

    public PlayingState(String guessWord) {
        super();
        this.guessWord = guessWord;
        this.correctLetters = ".".repeat(guessWord.length());
        this.stateProxy = new PlayingStateProxy();  // Initialize the Proxy
        this.wordAdapter = WordAdapter.getInstance();
    }

    public void turn() {
        this.writer.writeLine("This is what you know right now: " + correctLetters + "\n");

        if (stateProxy.getErrors() > 0) {
            this.writer.writeLine("You have " + (7 - stateProxy.getErrors()) + " mistakes left.");
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

        if (stateProxy.isLetterAlreadyGuessed(letter)) {
            this.writer.writeLine("You have already guessed this letter. Try another one.\n");
            return;
        }

        stateProxy.addGuessedLetter(letter);

        if (wordAdapter.containsLetter(letter, this.guessWord)) {
            changeShowWord(letter);
            this.writer.writeLine("Good guess! This letter is in the word.\n");
        } else {
            this.writer.writeLine("Yikes! That letter is not in the word.\n");
            stateProxy.incrementErrors();  // Increment errors through the Proxy
        }

        if (stateProxy.isGameOver()) {
            this.context.changeState("Lose");  // Geef de naam van de staat door
            this.context.ending();
            return;
        }

        if (!this.correctLetters.contains(".")) {
            this.context.changeState("Win");  // Geef de naam van de staat door
            this.context.ending();
            return;
        }

        this.context.turn();
    }

    public void ending() {
        // Does nothing
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
