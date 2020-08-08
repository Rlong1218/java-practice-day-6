import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatFrontTest {

    @Test
    void repeatFront() {
        assertEquals("HelHeH", RepeatFront.repeatFront("Hello", 3));
        assertEquals("GoG", RepeatFront.repeatFront("Goodness", 2));
        assertEquals("RepeatRepeaRepeRepReR", RepeatFront.repeatFront("Repeat", 6));
        assertEquals("", RepeatFront.repeatFront("NothingHere", 0));
    }
}