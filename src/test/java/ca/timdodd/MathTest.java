package ca.timdodd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testAdd() {
        assertEquals(5, Math.add(2, 3));
    }
}
