package mars2015.rallonges;

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
            "src/test/resources/mars2015.rallonges/input1.txt,src/test/resources/mars2015.rallonges/output1.txt",
            "src/test/resources/mars2015.rallonges/input2.txt,src/test/resources/mars2015.rallonges/output2.txt"})
    public void should_test_rallonges(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        mars2015.rallonges.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}