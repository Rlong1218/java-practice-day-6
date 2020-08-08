import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatEndTest {

    @Test
    void repeatEnd() {
        assertEquals("llollollo", RepeatEnd.repeatEnd("Hello", 3));
        assertEquals("dingdingdingding", RepeatEnd.repeatEnd("mending", 4));
        assertEquals("RepeatRepeatRepeatRepeatRepeatRepeat", RepeatEnd.repeatEnd("Repeat", 6));
        assertEquals("", RepeatEnd.repeatEnd("nothing", 0));
    }
}