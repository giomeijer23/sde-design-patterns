public class StateFactory {
    public static AHangmanState createState(String stateType, String word) {
        switch (stateType.toLowerCase()) {
            case "playing":
                return new PlayingState(word);
            case "win":
                return new WinState();
            case "lose":
                return new LoseState();
            default:
                System.out.println("Invalid state type provided, defaulting to LoseState.");
                return new LoseState();
        }
    }
}
