package pl.kpizon.eightkyu;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
 */

public class AbbreviateTwoWordName {

    public static String abbrevName(String name) {
        String[] split = name.toUpperCase().split(" ");
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                name = String.valueOf(split[i].charAt(0));
            }
            if (i == 1) {
                name = name.concat(".").concat(String.valueOf(split[i].charAt(0)));
            }
        }
        return name;
    }

    public static String abbrevName2(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0))
                .toUpperCase();
    }
}
