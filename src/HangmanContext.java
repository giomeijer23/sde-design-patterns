public class HangmanContext {
    private AHangmanState currentState;
    private AHangmanStateFactory stateFactory;

    // HangmanContext krijgt een AHangmanStateFactory als parameter
    public HangmanContext(AHangmanStateFactory stateFactory) {
        this.stateFactory = stateFactory;
    }

    public void changeState(String stateType) {
        AHangmanState newState = null;

        // Gebruik de factory om de juiste staat te creëren
        if (stateType.equals("Playing")) {
            newState = stateFactory.createPlayingState("hangman");
        } else if (stateType.equals("Win")) {
            newState = stateFactory.createWinState();
        } else if (stateType.equals("Lose")) {
            newState = stateFactory.createLoseState();
        } else if (stateType.equals("End")) {
            newState = stateFactory.createEndState();
        }

        this.currentState = newState;
        this.currentState.setContext(this);
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

    // Voeg de getCurrentState() methode toe
    public AHangmanState getCurrentState() {
        return currentState;
    }
}
