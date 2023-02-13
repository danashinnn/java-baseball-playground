package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseballTest {

    Baseball bb;

    @BeforeEach
    void setUp() {
        bb = new Baseball();
    }

    @Test
    public void randomTest() {
        assertEquals(3, bb.random().length());
    }

    @Test
    public void stringToArrTest() {
        String str = "123";
        assertThat(bb.stringToArr(str)).containsExactly('1', '2', '3');
    }

    @Test
    public void searchIndexTest() {
        assertEquals(-1, bb.searchIndex('1', "456"));
    }


}
