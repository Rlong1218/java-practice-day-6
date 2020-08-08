import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XYZMiddleTest {

    @Test
    void xyzMiddle() {
        assertTrue(XYZMiddle.xyzMiddle("AAxyzBB"));
        assertTrue(XYZMiddle.xyzMiddle("1x345xyz12x4"));
        assertTrue(XYZMiddle.xyzMiddle("xyzxyzAxyzBxyzxyz"));
        assertTrue(XYZMiddle.xyzMiddle("xyzz"));
        assertTrue(XYZMiddle.xyzMiddle("xyz"));
        assertFalse(XYZMiddle.xyzMiddle(""));
        assertFalse(XYZMiddle.xyzMiddle("xy"));
        assertFalse(XYZMiddle.xyzMiddle("AxyzBBBB"));
        assertFalse(XYZMiddle.xyzMiddle("xyzxyzAxyzxyzxy"));
    }
}