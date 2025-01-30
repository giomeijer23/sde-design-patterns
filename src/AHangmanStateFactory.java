public interface AHangmanStateFactory {
    AHangmanState createPlayingState(String word);
    AHangmanState createWinState();
    AHangmanState createLoseState();
    AHangmanState createEndState();
}

