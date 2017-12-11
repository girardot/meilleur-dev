package nov2017.adn;

import common.AbstractTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import nov2017.adn.IsoContest;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.FileInputStream;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class IsoContestTest extends AbstractTest {

    @Test
    @Parameters({
            "src/test/resources/nov2017/adn/input1.txt,src/test/resources/nov2017/adn/output1.txt",
            "src/test/resources/nov2017/adn/input2.txt,src/test/resources/nov2017/adn/output2.txt",
            "src/test/resources/nov2017/adn/input3.txt,src/test/resources/nov2017/adn/output3.txt",
            "src/test/resources/nov2017/adn/input4.txt,src/test/resources/nov2017/adn/output4.txt",
            "src/test/resources/nov2017/adn/input5.txt,src/test/resources/nov2017/adn/output5.txt",
            "src/test/resources/nov2017/adn/input6.txt,src/test/resources/nov2017/adn/output6.txt",
    })
    public void should_test_exo(String inputFileName, String outputFileName) throws Exception {
        // Given
        System.setIn(new FileInputStream(inputFileName));

        // When
        IsoContest.main(null);

        //Then
        assertThat(outContent.toString().trim()).isEqualTo(readOutputFile(outputFileName));
    }

}