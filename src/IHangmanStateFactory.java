public interface IHangmanStateFactory {
    AHangmanState createPlayingState(String word);
    AHangmanState createWinState();
    AHangmanState createLoseState();
    AHangmanState createEndState();
}

