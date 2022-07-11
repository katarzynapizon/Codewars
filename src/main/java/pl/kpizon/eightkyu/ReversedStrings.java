package pl.kpizon.eightkyu;

/*
Complete the solution so that it reverses the string passed into it.
'world'  =>  'dlrow'
'word'   =>  'drow'
 */

public class ReversedStrings {

    public static String reverse(String str) {

        String reverseWord = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }

        return reverseWord;
    }

    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}