package tags;

import common.AbstractTest;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.fest.assertions.api.Assertions.assertThat;

public class IsoContestTest extends AbstractTest {


    @Test
    public void should_return_money_at_the_end_of_the_game() throws Exception {
        // Given
        String data = "21\n" +
                "tag1\n" +
                "tag4\n" +
                "tag1\n" +
                "tag3\n" +
                "tag5\n" +
                "tag4\n" +
                "tag5\n" +
                "tag1\n" +
                "tag3\n" +
                "tag2\n" +
                "tag4\n" +
                "tag42\n" +
                "tag1\n" +
                "tag2\n" +
                "tag2\n" +
                "tag1\n" +
                "tag3\n" +
                "tag2\n" +
                "tag2\n" +
                "tag3\n" +
                "tag1\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        // When
        tags.IsoContest.main(null);

        //Then
        assertThat(outContent.toString()).isEqualTo(
                "tag1 6\r\n" +
                "tag2 5\r\n" +
                "tag3 4\r\n" +
                "tag4 3\r\n" +
                "tag5 2\r\n"
        );
    }

}