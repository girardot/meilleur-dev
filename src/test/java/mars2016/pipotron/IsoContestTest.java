package mars2016.pipotron;

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
            "src/test/resources/mars2016.pipotron/input1.txt,src/test/resources/mars2016.pipotron/output1.txt",
            "src/test/resources/mars2016.pipotron/input2.txt,src/test/resources/mars2016.pipotron/output2.txt"})
    public void pipotron(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        mars2016.pipotron.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}