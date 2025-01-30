import tools.ConsoleWriter;

public class TimestampedConsoleWriter extends ConsoleWriter {
    @Override
    public void writeLine(String line) {
        String timestampedLine = "[" + java.time.LocalTime.now() + "] " + line;
        super.writeLine(timestampedLine);
    }
}
