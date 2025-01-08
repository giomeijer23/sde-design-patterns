public class Main {
    public static void main(String[] args) {
        String wordToGuess = "hangman"; // Kan vervangen worden door dynamische invoer
        AHangmanState start = StateFactory.createState("playing", wordToGuess);
        HangmanContext game = new HangmanContext(start);
        game.turn();
    }
}
