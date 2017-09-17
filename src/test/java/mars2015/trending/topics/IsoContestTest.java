package mars2015.trending.topics;

import common.AbstractTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileInputStream;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class IsoContestTest extends AbstractTest {

    @Test
    @Parameters({
            "src/test/resources/mars2015.trending.topics/input1.txt,src/test/resources/mars2015.trending.topics/output1.txt",
            "src/test/resources/mars2015.trending.topics/input2.txt,src/test/resources/mars2015.trending.topics/output2.txt"})
    public void should_test_trending_topics(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        mars2015.trending.topics.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}