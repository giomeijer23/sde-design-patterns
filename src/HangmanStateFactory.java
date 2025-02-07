public class HangmanStateFactory implements IHangmanStateFactory {
    @Override
    public AHangmanState createPlayingState(String word) {
        return new PlayingState(word);
    }

    @Override
    public AHangmanState createWinState() {
        return new WinState();
    }

    @Override
    public AHangmanState createLoseState() {
        return new LoseState();
    }

    @Override
    public AHangmanState createEndState() {
        return new EndState();
    }
}
