public class LoseState extends AHangmanState {
    public LoseState() {
        super();
    }

    @Override
    public void turn() {
        // Verander deze regel naar het doorgeven van de naam van de staat, niet het object zelf
        this.context.changeState("Playing");  // De naam van de staat is "Playing"
        this.context.turn();
    }

    @Override
    public void ending() {
        this.writer.writeLine("Oops! You didn't guess the word. Want to try again?");
        String check = this.reader.readLine();
        if (check.equalsIgnoreCase("yes")) {
            this.context.turn();
        } else {
            this.context.changeState("End");  // De naam van de staat is "End"
            this.context.turn();
        }
    }
}
