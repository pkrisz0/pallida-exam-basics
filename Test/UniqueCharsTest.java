import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharsTest {

    UniqueChars test = new UniqueChars();

    @Test
    void uniqueCharacters() {
        assertEquals(Arrays.asList('n','g','r','m'), test.uniqueCharacters("anagram"));
    }

    @Test
    void uniqueCharacters_2() {
        assertEquals(Arrays.asList('0'), test.uniqueCharacters(""));
    }

    @Test
    void uniqueCharacters_3() {
        assertEquals(Arrays.asList('m'), test.uniqueCharacters("mahaha"));
    }

}