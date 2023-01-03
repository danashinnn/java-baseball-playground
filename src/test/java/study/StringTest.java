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
        String str1 = "1,2";
        String str2 = "1";

        String[] arr1 = str1.split(",");
        String[] arr2 = str2.split(",");

        assertThat(arr1).contains("1", "2");
        assertThat(arr1).containsExactly("1", "2");

        assertThat(arr2).contains("1");
        assertThat(arr2).containsExactly("1");
    }

    @Test
    void substring() {
        String str = "(1,2)";
        String actual = str.substring(1, str.length()-1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt test")
    void charAt() {
        String str = "abc";
        int idx = 1;
        char ch = str.charAt(idx);
        assertThat(ch).isEqualTo('b');
    }

    @Test
    @DisplayName("charAt assertThatThrownBy Exception")
    void charAtException1() {
        String str = "abc";
        int idx = 5;

        assertThatThrownBy(() -> {
            char ch = str.charAt(idx);
            assertThat(ch).isEqualTo('b');
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("%d", idx);
    }

    @Test
    @DisplayName("charAt assertThatExceptionOfType Exception")
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
