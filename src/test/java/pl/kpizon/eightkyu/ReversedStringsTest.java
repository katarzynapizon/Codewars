package pl.kpizon.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedStringsTest {

    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.reverse("world"));
    }
}