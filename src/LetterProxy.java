import java.util.HashSet;
import java.util.Set;

public class LetterProxy {
    private Set<Character> guessedLetters;

    // Pas de constructor aan zodat hij geen argumenten vereist
    public LetterProxy() {
        this.guessedLetters = new HashSet<>();
    }

    public boolean isLetterAlreadyGuessed(char letter) {
        return guessedLetters.contains(letter);
    }

    public void addGuessedLetter(char letter) {
        guessedLetters.add(letter);
    }
}
