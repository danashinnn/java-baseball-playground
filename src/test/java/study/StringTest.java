package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] str1 = "1,2".split(",");
        String[] str2 = "1".split(",");

        assertThat(str1).contains("1", "2");
        assertThat(str1).containsExactly("1", "2");

        assertThat(str2).contains("1");
        assertThat(str2).containsExactly("1");
    }

    @Test
    void substring() {
        String str1 = "(1,2)";
        String str2 = str1.substring(1, str1.length()-1);
        assertThat(str2).isEqualTo("1,2");
    }

    @DisplayName("charAt Test")
    @Test
    void charAt() {
        String str = "abc";
        int idx = 1;
        char ch = str.charAt(idx);
        assertThat(ch).isEqualTo('b');
    }

    @DisplayName("charAt Exception1")
    @Test
    void charAtException1() {
        String str = "abc";
        int idx = 5;
        assertThatThrownBy(() -> {
            char ch = str.charAt(idx);
            assertThat(ch).isEqualTo('b');
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("%d", idx);
    }

    @DisplayName("charAt Exception2")
    @Test
    void charAtException2() {
        String str = "abc";
        int idx = 5;
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char ch = str.charAt(idx);
                    assertThat(ch).isEqualTo('b');
                }).withMessageContaining("%d", idx);
    }
}
