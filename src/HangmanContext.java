public class HangmanContext {
    private AHangmanState state;

    public HangmanContext(AHangmanState state) {
        this.state = state;
        state.setContext(this);
    }

    public void changeState(AHangmanState newState) {
        this.state = newState;
    }

    public void turn() {
        this.state.turn();
    }

    public void ending() {
        this.state.ending();
    }
}
