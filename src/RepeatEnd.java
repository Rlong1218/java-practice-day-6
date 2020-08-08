// Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
// You may assume that n is between 0 and the length of the string, inclusive.

public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeated.append(str.substring(str.length() - n));
        }
        return repeated.toString();
    }
}