public class WinState extends AHangmanState {
    public WinState() {
        super();
    }

    @Override
    public void turn() {
        // Verander de regel naar het doorgeven van de naam van de staat, niet het object zelf
        this.context.changeState("Playing");  // De naam van de staat is "Playing"
        this.context.turn();
    }

    @Override
    public void ending() {
        this.writer.writeLine("You have guessed the word correctly! Do you want to play again?");
        String check = this.reader.readLine();
        if (check.equalsIgnoreCase("yes")) {
            this.context.turn();
        } else {
            this.context.changeState("End");  // De naam van de staat is "End"
            this.context.turn();
        }
    }
}
