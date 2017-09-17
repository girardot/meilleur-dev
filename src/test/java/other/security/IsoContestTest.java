package other.security;

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
            "src/test/resources/other.security/input1.txt,src/test/resources/other.security/output1.txt",
            "src/test/resources/other.security/input2.txt,src/test/resources/other.security/output2.txt",
            "src/test/resources/other.security/input3.txt,src/test/resources/other.security/output3.txt",
    })
    public void should_test_exo(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        other.security.IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}