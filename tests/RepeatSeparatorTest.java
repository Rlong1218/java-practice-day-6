import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatSeparatorTest {

    @Test
    void repeatSeparator() {
        assertEquals("WithxWithxWith", RepeatSeparator.repeatSeparator("With", "x", 3));
        assertEquals("XoXoXoXoXoXoXoXoXoX", RepeatSeparator.repeatSeparator("X", "o", 10));
        assertEquals("HopSkipHop", RepeatSeparator.repeatSeparator("Hop", "Skip", 2));
        assertEquals("Lonely", RepeatSeparator.repeatSeparator("Lonely", "", 1));
        assertEquals("LonelyLonely", RepeatSeparator.repeatSeparator("Lonely", "", 2));
        assertEquals(" ? ", RepeatSeparator.repeatSeparator(" ", "?", 2));
    }
}