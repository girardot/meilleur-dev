package poker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;

public class IsoContestTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void should_return_money_at_the_end_of_the_game() throws Exception {
        // Given
        String data = "1000\n" +
                "10\n" +
                "8 16\n" +
                "5 0\n" +
                "6 24\n" +
                "7 21\n" +
                "9 0\n" +
                "5 15\n" +
                "7 0\n" +
                "10 20\n" +
                "7 0\n" +
                "3 12\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        // When
        poker.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo("1041");
    }

}