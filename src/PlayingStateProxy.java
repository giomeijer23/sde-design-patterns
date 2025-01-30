import java.util.HashSet;
import java.util.Set;

public class PlayingStateProxy {
    private Set<Character> guessedLetters;
    private int errors;
    private PlayingStateService service;

    public PlayingStateProxy() {
        this.guessedLetters = new HashSet<>();
        this.errors = 0;
        this.service = new PlayingStateService();
    }

    public boolean isLetterAlreadyGuessed(char letter) {
        return guessedLetters.contains(letter);
    }

    public void addGuessedLetter(char letter) {
        guessedLetters.add(letter);
    }

    public void incrementErrors() {
        errors++;
        service.checkGameOver(errors);
    }

    public int getErrors() {
        return errors;
    }

    public boolean isGameOver() {
        return errors >= 7;
    }
}
