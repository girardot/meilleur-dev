package nov2014.substring;

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
            "src/test/resources/nov2014.substring/input1.txt,src/test/resources/nov2014.substring/output1.txt",
            "src/test/resources/nov2014.substring/input2.txt,src/test/resources/nov2014.substring/output2.txt",
            "src/test/resources/nov2014.substring/input3.txt,src/test/resources/nov2014.substring/output3.txt",
            "src/test/resources/nov2014.substring/input4.txt,src/test/resources/nov2014.substring/output4.txt",
            "src/test/resources/nov2014.substring/input5.txt,src/test/resources/nov2014.substring/output5.txt",
            "src/test/resources/nov2014.substring/input6.txt,src/test/resources/nov2014.substring/output6.txt",
            "src/test/resources/nov2014.substring/input7.txt,src/test/resources/nov2014.substring/output7.txt"
    })
    public void should_test_poker(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        nov2014.substring.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}