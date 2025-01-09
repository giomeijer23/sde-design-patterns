public class HangmanContext {
    private AHangmanState currentState;

    public void changeState(AHangmanState newState) {
        this.currentState = newState;
        this.currentState.setContext(this);
    }

    public AHangmanState getCurrentState() {
        return this.currentState;
    }

    public void turn() {
        if (currentState != null) {
            currentState.turn();
        } else {
            throw new IllegalStateException("No state is set.");
        }
    }

    public void ending() {
        if (currentState != null) {
            currentState.ending();
        } else {
            throw new IllegalStateException("No state is set.");
        }
    }
}
