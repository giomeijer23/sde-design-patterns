import tools.ConsoleReader;
import tools.ConsoleWriter;

public abstract class AHangmanState {
    protected HangmanContext context;

    protected ConsoleReader reader;

    protected ConsoleWriter writer;

    AHangmanState() {
        this.reader = new ConsoleReader();
        this.writer = new ConsoleWriter();
    }

    protected boolean isLetterInWord(char letter, String word) {
        return word.contains(Character.toString(letter));
    }

    public void setContext(HangmanContext context) {
        this.context = context;
    }

    public abstract void turn();

    public abstract void ending();
}
