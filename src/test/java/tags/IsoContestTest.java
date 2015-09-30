package tags;

import common.AbstractTest;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.fest.assertions.api.Assertions.assertThat;

public class IsoContestTest extends AbstractTest {


    @Test
    public void should_return_money_at_the_end_of_the_game() throws Exception {
        // Given
        String data = "15\n" +
                "tag1\n" +
                "tag4\n" +
                "tag3\n" +
                "tag5\n" +
                "tag1\n" +
                "tag2\n" +
                "tag4\n" +
                "tag1\n" +
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
        assertThat(outContent.toString().trim()).isEqualTo("tag1 5\n tag2 4\ntag3 3 \n tag 4 2\n tag 5 1\n");
    }

}