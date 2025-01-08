public class Main {
    public static void main(String[] args) {
        String wordToGuess = "hangman";
        AHangmanState start = StateFactory.createState("playing", wordToGuess);
        HangmanContext game = new HangmanContext(start);
        game.turn();
    }
}
