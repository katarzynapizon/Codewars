package pl.kpizon.eightkyu;

/*
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.
 */

public class RemoveFirstAndLastCharacter {

    public static String remove(String str) {
        return new StringBuilder(str)
                .deleteCharAt(str.length() - 1)
                .deleteCharAt(0)
                .toString();
    }

    public static String remove2(String str) {
        return str.substring(1, str.length() - 1);
    }

}
