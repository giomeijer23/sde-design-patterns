import tools.ConsoleReader;
import tools.ConsoleWriter;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        boolean quit = false;
        while (!quit) {
            String test = reader.readLine();
            writer.writeLine(test);
            if (test.equals("quit")) {
                quit = true;
            }
        }
    }
}
