// Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
// separated by the separator string.

public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder seperated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            seperated.append(word);
            if (i < count-1) {
                seperated.append(sep);
            }
        }
        return seperated.toString();
    }
}
