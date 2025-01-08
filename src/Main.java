public class Main {
    public static void main(String[] args) {
        AHangmanState start = new PlayingState("hangman");
        HangmanContext game = new HangmanContext(start);
        game.turn();
    }
}
