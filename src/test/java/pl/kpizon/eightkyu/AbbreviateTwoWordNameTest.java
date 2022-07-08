package pl.kpizon.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbbreviateTwoWordNameTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWordName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWordName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWordName.abbrevName("David Mendieta"));
    }
}