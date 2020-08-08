import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixAgainTest {

    @Test
    void prefixAgain() {
        assertTrue(PrefixAgain.prefixAgain("prefixpre", 3));
        assertTrue(PrefixAgain.prefixAgain("SuperManIsSuper", 5));
        assertTrue(PrefixAgain.prefixAgain("pip", 1));
        assertFalse(PrefixAgain.prefixAgain("prefixpr", 3));
        assertFalse(PrefixAgain.prefixAgain("nope", 2));
        assertFalse(PrefixAgain.prefixAgain("closeClose", 5));
    }
}