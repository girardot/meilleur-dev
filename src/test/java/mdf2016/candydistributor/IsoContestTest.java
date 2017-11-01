package mdf2016.candydistributor;

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
            "src/test/resources/mdf2016/candydistributor/input1.txt,src/test/resources/mdf2016/candydistributor/output1.txt",
            "src/test/resources/mdf2016/candydistributor/input2.txt,src/test/resources/mdf2016/candydistributor/output2.txt",
            "src/test/resources/mdf2016/candydistributor/input3.txt,src/test/resources/mdf2016/candydistributor/output3.txt",
            "src/test/resources/mdf2016/candydistributor/input4.txt,src/test/resources/mdf2016/candydistributor/output4.txt",
            "src/test/resources/mdf2016/candydistributor/input5.txt,src/test/resources/mdf2016/candydistributor/output5.txt"
    })
    public void agile(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}