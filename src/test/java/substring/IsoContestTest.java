package substring;

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
            "src/test/resources/substring/input1.txt,src/test/resources/substring/output1.txt",
            "src/test/resources/substring/input2.txt,src/test/resources/substring/output2.txt",
            "src/test/resources/substring/input3.txt,src/test/resources/substring/output3.txt",
            "src/test/resources/substring/input4.txt,src/test/resources/substring/output4.txt",
            "src/test/resources/substring/input5.txt,src/test/resources/substring/output5.txt",
            "src/test/resources/substring/input6.txt,src/test/resources/substring/output6.txt",
            "src/test/resources/substring/input7.txt,src/test/resources/substring/output7.txt"
    })
    public void should_test_poker(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        substring.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}