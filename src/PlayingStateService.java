public class PlayingStateService {

    // Controleer of het aantal fouten het maximale aantal bereikt
    public void checkGameOver(int errors) {
        if (errors >= 7) {
            // Game over logica, bijvoorbeeld door een nieuwe staat te triggeren
            System.out.println("Game Over!");
        }
    }
}
