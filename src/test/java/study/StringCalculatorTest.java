package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringCalculatorTest {

    StringCalculator sc;

    @BeforeEach
    void setUp() {
        sc = new StringCalculator();
    }

    @Test
    public void stringToArrayTest() {
        String str = "1 + 2";
        assertThat(sc.stringToArray(str)).containsExactly("1", "+", "2");
    }

    @Test
    public void stringToIntTest() {
        assertEquals(1, sc.stringToInt("1"));
    }

    @Test
    public void calculatorTest() {
        assertEquals(3, sc.calculator(1, "+", 2));
    }

    @Test
    public void calculateInOrderTest() {
        assertEquals(1, sc.calculateInOrder(sc.stringToArray("3 - 2")));
    }

    @Test
    public void isBlankTest() {
        assertTrue(sc.isBlank(" "));
    }

    @Test
    public void makeResultTest() {
        assertEquals(6, sc.calculateInOrder(sc.stringToArray("2 * 3")));
    }
}
