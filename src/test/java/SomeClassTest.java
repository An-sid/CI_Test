import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeClassTest {

    @Test
    void isPositiveNumber() {
    int num = 10;
    boolean expected = true;
    boolean actual = SomeClass.isPositiveNumber(num);
    assertEquals(expected, actual);
    }

}