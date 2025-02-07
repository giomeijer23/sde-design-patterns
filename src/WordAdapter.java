public class WordAdapter {
    private static WordAdapter instance;

    private WordAdapter() {}

    public static WordAdapter getInstance() {
        if (instance == null) {
            instance = new WordAdapter();
        }
        return instance;
    }

    public boolean containsLetter(char letter, String word) {
        return word.indexOf(letter) >= 0;
    }
}
